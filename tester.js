doctype html
html
  head
    title
    link(rel='stylesheet', href='/stylesheets/style.css')
    link(rel='stylesheet', href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css', integrity='sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==', crossorigin='anonymous')
    // Optional theme
    link(rel='stylesheet', href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css', integrity='sha384-aUGj/X2zp5rLCbBxumKTCw2Z50WgIr1vs/PFN4praOTvYXWlVyh2UtNUU0KAUhAX', crossorigin='anonymous')
    // Latest compiled and minified JavaScript
    script(src='//code.jquery.com/jquery-1.11.3.min.js')
    script(type="text/javascript", src="/javascripts/formChecker.js")
    script(src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js', integrity='sha512-K1qjQ+NcF2TYO/eI3M6v8EiNYZfA95pQumfvcVrTHtwQVDG+aHRqLi/ETn2uB+1JqwYqVG3LIvdm9lj6imS/pQ==', crossorigin='anonymous')

  body
    .container
      h1.centeralign Phonebuzz
      br
      br
      br
      br
      form#phoneForm(role='form')
        .form-group
          label.centeralign(for='phonenum') Please enter a phone number
          input#pnum.form-control(type='phonenum')
          br
          label(for='time') Please enter how long we should wait before calling you. (E.g "1 minute")
          input#timeval.form-control(type='text')
        button.btn.btn-default(type='submit') Submit
      br
      br
      block content
       include table

//- TABLE>JAD

div
  table.table
    thead
      tr 
        th Phone Number
        th Call Time
        th Fizzbuzz Digits
        th Delay
        th 
    tbody
      each call in calllist
        tr
          td#pnum2=call.phonenumber
          td=new Date(call.calltime)
          td=call.digits
          td#delay2=(call.delay/1000) + " seconds"
          td
            button#makecall.btn.btn-default.btn-xs(type='button')
              span.glyphicon.glyphicon-earphone(aria-hidden='true')
              |  Make Call
//- formchecker

$(function() {
    // Prevent form submission and submit using ajax
    $('#phoneForm').on('submit', function(e) {
        // Stop event bubbling
        e.preventDefault();
        var timeinmil = timeParser($("#timeval").val().toString());
        // Check if it is an integer value, else set to 0
        if ( timeinmil !== parseInt(timeinmil, 10) ) {
            timeinmil = 0;
        }
        console.log(timeinmil);
        $.ajax({
            url: '/caller',
            method: 'POST',
            dataType: 'json',
            data: {
                phoneNum: $('#pnum').val(),
                delay: timeinmil
            }
        }).done(function(data) {
            // Success alert
            alert(data.message);
        }).fail(function(error) {
            alert(JSON.stringify(error));
        });
    });

    $('#makecall').on('click', function(e) {
        // Stop event bubbling
        e.preventDefault();
        var delay = (parseInt($(this).parent().parent().find("#delay2").text())/1000).toString();
        delay += " seconds";
        var timeinmil = timeParser(delay);
        // Check if it is an integer value, else set to 0
        if ( timeinmil !== parseInt(timeinmil, 10) ) {
            timeinmil = 0;
        }
        console.log(timeinmil);
        $.ajax({
            url: '/caller',
            method: 'POST',
            dataType: 'json',
            data: {
                phoneNum: $(this).parent().parent().find("#pnum2").text(),
                delay: timeinmil
            }
        }).done(function(data) {
            // Success alert
            alert(data.message);
        }).fail(function(error) {
            alert(JSON.stringify(error));
        });
        $.ajax({
            url: '/calls',
            method: 'GET'
        }).done(function(data) {
            // Success alert
            alert(data.message);
        })
        
    });

    // Parses the string to get the time in milliseconds
    function timeParser(timestring){
        console.log(timestring);
        var res = timestring.split(" ");
        var timeinmil = 0;
        var buff;
        for (i = 0; i < res.length; i = i+2 ) {
            console.log( res[i] );
            console.log( parseInt( res[i] ));
            buff = parseInt( res[i] ) * secondCheck(res[i+1]);
            timeinmil += buff;
        }

        return timeinmil;
    }
    // Checks for hours, minutes and seconds to output correct value for millisecond calculation
    function secondCheck(str){
        str = str.toLowerCase();
        if ( (str == "minute") || (str == "minutes") ) {
            return (1000*60)
        } else if ( (str == "second") || (str == "seconds") ) {
            return 1000
        } else if ( (str == "hour") || (str == "hours") ) {
            return (1000*60*60)
        } else {
            alert("Please enter a correct input for time");
        }
    }


});

//- index.js
var express = require('express');
var config = require('../config.js');
var router = express();
var twilio = require('twilio');
var fizzbuzzcalculator = require('../public/javascripts/fizzbuzz.js');
var mongoose = require('mongoose');
var Calls = require('../models/calls.js');
var options = {
  upsert: true
}
/* GET home page. */
router.get('/', function(req, res){
  var calllist;
  Calls.find({}, 'phonenumber digits delay calltime',function(err, calls) {
    if (err) throw err;
    // calllist = JSON.parse(calls);
  }).sort({calltime: -1}).exec(function (err, calls) {
    calllist = calls.map(function(call) {
      return call.toJSON();
    });
  }).then(function(){
    res.render('index', {calllist: calllist});
  })
  
})

// GET ALL CALLS
router.get('/calls', function(req, res){
  var calllist;
  Calls.find({}, 'phonenumber digits delay calltime',function(err, calls) {
    if (err) throw err;
    // calllist = JSON.parse(calls);
  }).sort({calltime: -1}).exec(function (err, calls) {
    calllist = calls.map(function(call) {
      return call.toJSON();
    });
  }).then(function(){
    res.render('table', {calllist: calllist});
  })
})

// Endpoint for Twilio call
router.post('/phonebuzzer', function(req, res) {
  var url = 'http://' + req.headers.host+ '/fizzbuzz';
  // Validate twilio request
  if (twilio.validateExpressRequest(req, config.authToken)) {
    var resp = new twilio.TwimlResponse();
    resp.say('Welcome to Phonebuzz').gather({
      action: url,
      finishOnKey: '#'
    }, function() {
      this.say('Please enter a number greater than 0 to run fizzbuzz. Press pound after you have finished entering the number.')
    });
    res.type('text/xml');
    res.send(resp.toString());
  } else {
    res.status(403).send('This is not a twilio request! Only requests from twilio are accepted');
  }
});

// Endpoint for fizzbuzz output through Twilio
router.post('/fizzbuzz', function(req, res) {
  var digits;
  var callLogger;
  if (req.body.Digits) {
    console.log('body digits are:' + req.body.Digits);
    callLogger = Calls.findOneAndUpdate({ phonenumber: req.body.Called },  { digits: req.body.Digits }, options, function(err){
      if (err) {console.log(err)} else {console.log('Success')};
      digits = req.body.Digits;
      console.log('digit set to '+digits);
    });
  } else {
    callLogger = Calls.findOne({ phonenumber: req.body.Called }).sort('-calltime').exec(function (err, call){
      console.log(call.digits);
      digits = call.digits;
    })
  }
  console.log('haha');
    callLogger.then(function(){
    console.log('digit is ' + digits);
      if ( parseInt(digits) > -1 ){
        console.log('H12');
        var number = digits;
        console.log('H13');
        number = parseInt(number);
        var fizzBuzzer = new twilio.TwimlResponse();
        // If the number is > 0, provide twiml output
        if (number > 0){
          var result = fizzbuzzcalculator(number);
          fizzBuzzer.say("Fizzbuzz has been calculated.").pause({ length: 2 }).say(result).say("Thank you for using fizzbuzzer");
        } else {
          fizzBuzzer.say("You have entered 0. Please enter a number greater than 0");
        }
    } else {
      fizzBuzzer.say("You have made an invalid entry");
    }
    res.writeHead(200, {'Content-Type': 'text/xml'});
    res.end(fizzBuzzer.toString());
  });
});


// Caller route opened when user used interface on website
router.post('/caller', function(req, res) {
  var url = 'http://' + req.headers.host + '/phonebuzzer';
  var twilioclient = twilio(config.accountSid, config.authToken);
  var delay = req.body.delay;
  console.log('Delay is '+delay);
  var digits = 0;
  var phonenum = req.body.phoneNum;
  // Get most recent call by number and highest calltime
  var callLogger = Calls.findOne( {phonenumber: phonenum}).sort('-calltime').exec(function (err, call){
    if ( call != null ){
      digits = call.digits;
      delay = call.delay;
      console.log('Digits set to '+ digits);
    }
  });

  callLogger.then(function(){
    console.log(digits);
    if (parseInt(digits) > 0) { 
      url = 'http://' + req.headers.host + '/fizzbuzz';
    }
    if ( delay != 0 ) { res.send({ message: "Calling in "+ delay + " seconds"})
    } else { res.send({message: "Calling now"}); }
    setTimeout(function(){
        var milliseconds = (new Date).getTime();
        twilioclient.makeCall({
          to: phonenum, from: config.twilioNumber, url: url
        }, function(err, responsedata) {
          var currentcall = new Calls({ phonenumber: phonenum, digits: digits, delay: delay, calltime: milliseconds });
          currentcall.save(function (err) {if (err) console.log ('Error on save!')});
          if (err) { res.status(500).send(err); }
        });   
      }, delay);
  })

});

module.exports = router;
