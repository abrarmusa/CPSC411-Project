package test.visitor;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;

import org.junit.Test;

import ast.Program;
import parser.Parser;
import test.SampleCode;
import visitor.MaxDepthVisitor;

public class MaxDepthVisitorTest {


	@Test
	public void testVisitSampleFiles() throws Exception {
		File[] files = SampleCode.sampleFiles();
		HashMap<String, Integer> fileNodes = fillInNodeNum();
		MaxDepthVisitor v = new MaxDepthVisitor();
		int nodeNum = 0;
		for (int i = 0; i < files.length; i++) {
			Program p = Parser.parse(files[i]);
			int res = v.visit(p);

			nodeNum = fileNodes.get(files[i].getName());
			assertEquals(nodeNum, res);
		}
	}

	public HashMap<String, Integer> fillInNodeNum(){
		HashMap<String, Integer> fileNodes = new HashMap<String, Integer>();
		fileNodes.put("aaa.exp", 18);
		fileNodes.put("bigcond.exp", 7);
		fileNodes.put("cond.exp", 5);
		fileNodes.put("fib.exp", 4);
		fileNodes.put("less.exp", 4);
		fileNodes.put("not.exp", 4);
		fileNodes.put("year.exp", 4);
		return fileNodes;
	}


	//////////////////////////////////////////////////////////////////////////
	// First let's ensure we can parse the "simplest possible" program:

	@Test
	public void testSmallest() throws Exception {
		HashMap<String, Integer> identifiers = new HashMap<String, Integer>();
		MaxDepthVisitor v = new MaxDepthVisitor();
		int currNodes = 0;
		int nodeVisits = 0;
		String[] names = {"print 1"};
		identifiers.put("print 1", 3);
		Program p;
		for (int i = 0; i < identifiers.size(); i++){
			currNodes = identifiers.get(names[i]);
			p = Parser.parse(names[i]);
			nodeVisits = v.visit(p);
			assertEquals(currNodes, nodeVisits);
		}
	}

	@Test
	public void testIdentifier() throws Exception {
		HashMap<String, Integer> identifiers = new HashMap<String, Integer>();
		MaxDepthVisitor v = new MaxDepthVisitor();
		int currNodes = 0;
		int nodeVisits = 0;
		String[] names = {"x" ,"y" ,"xy123" ,"x_y_123" ,"x_y_123"};
		identifiers.put("x", 3);
		identifiers.put("y", 3);
		identifiers.put("xy123", 3);
		identifiers.put("x_y_123", 3);
		identifiers.put("x_y_123", 3);
		Program p;
		for (int i = 0; i < identifiers.size(); i++){
			currNodes = identifiers.get(names[i]);
			p = Parser.parse("print " + names[i]);
			nodeVisits = v.visit(p);
			assertEquals(currNodes, nodeVisits);
		}
	}


	@Test
	public void testNot() throws Exception {
		HashMap<String, Integer> nots = new HashMap<String, Integer>();
		MaxDepthVisitor v = new MaxDepthVisitor();
		int currNodes = 0;
		int nodeVisits = 0;
		String[] names = {"!x" , "!!!!!!x"};
		nots.put("!x", 4);
		nots.put("!!!!!!x", 9);
		Program p;
		for (int i = 0; i < nots.size(); i++){
			currNodes = nots.get(names[i]);
			p = Parser.parse("print " + names[i]);
			nodeVisits = v.visit(p);
			assertEquals(currNodes, nodeVisits);
		}
	}
	@Test
	public void testParens() throws Exception {
		HashMap<String, Integer> parens = new HashMap<String, Integer>();
		MaxDepthVisitor v = new MaxDepthVisitor();
		int currNodes = 0;
		int nodeVisits = 0;
		String[] names = {"(1)" , "((((((1))))))"};
		parens.put("(1)", 3);
		parens.put("((((((1))))))", 3);
		Program p;
		for (int i = 0; i < parens.size(); i++){
			currNodes = parens.get(names[i]);
			p = Parser.parse("print " + names[i]);
			nodeVisits = v.visit(p);
			assertEquals(currNodes, nodeVisits);
		}
	}


	@Test
	public void testMult() throws Exception {
		HashMap<String, Integer> mults = new HashMap<String, Integer>();
		MaxDepthVisitor v = new MaxDepthVisitor();
		int currNodes = 0;
		int nodeVisits = 0;
		String[] names = { "10*9", "10*9*8", "foo*length", "10*9*8*7*x*y*foo"};
		mults.put("10*9", 4);
		mults.put("10*9*8", 5);
		mults.put("foo*length", 4);
		mults.put("10*9*8*7*x*y*foo", 9);
		Program p;
		for (int i = 0; i < mults.size(); i++){
			currNodes = mults.get(names[i]);
			p = Parser.parse("print " + names[i]);
			nodeVisits = v.visit(p);
			assertEquals(currNodes, nodeVisits);
		}
	}




	@Test
	public void testAdd() throws Exception {
		HashMap<String, Integer> addExpressions = new HashMap<String, Integer>();
		MaxDepthVisitor v = new MaxDepthVisitor();
		int currNodes = 0;
		int nodeVisits = 0;
		String[] names = { "10+9", "10-9", "10+9+8", "10-9-8", "length+length", "length-length", "foo+foo", "foo+(foo)", "10+9+x*length-foo+array", "(a-b)*(a+b)"};
		addExpressions.put("10+9", 4);
		addExpressions.put("10-9", 4);
		addExpressions.put("10+9+8", 5);
		addExpressions.put("10-9-8", 5);
		addExpressions.put("length+length", 4);
		addExpressions.put("length-length", 4);
		addExpressions.put("foo+foo", 4);
		addExpressions.put("foo+(foo)", 4);
		addExpressions.put("10+9+x*length-foo+array", 7);
		addExpressions.put("(a-b)*(a+b)",5);
		Program p;
		for (int i = 0; i < addExpressions.size(); i++){
			currNodes = addExpressions.get(names[i]);
			p = Parser.parse("print " +names[i]);
			nodeVisits = v.visit(p);
			assertEquals(currNodes, nodeVisits);
		}
	}

	@Test
	public void testComp() throws Exception {
		HashMap<String, Integer> condExpressions = new HashMap<String, Integer>();
		MaxDepthVisitor v = new MaxDepthVisitor();
		int currNodes = 0;
		int nodeVisits = 0;
		String[] names = {"10<9", "10+a*3<9-4+2", "length<1", "i<foo", "10<9", "10+a*3<9-4+2", "length<1", "i<foo"};
		condExpressions.put("10<9", 4);
		condExpressions.put("10+a*3<9-4+2", 13);
		condExpressions.put("length<1", 4);
		condExpressions.put("i<foo", 4);
		condExpressions.put("10<9", 4);
		condExpressions.put("10+a*3<9-4+2", 6);
		condExpressions.put("length<1", 4);
		condExpressions.put("i<foo", 4);
		Program p;
		for (int i = 0; i < condExpressions.size(); i++){
			currNodes = condExpressions.get(names[i]);
			p = Parser.parse("print " + names[i]);
			nodeVisits = v.visit(p);
			assertEquals(currNodes, nodeVisits);
		}

	}

	@Test
	public void testConditional() throws Exception {
		HashMap<String, Integer> condExpressions = new HashMap<String, Integer>();
		MaxDepthVisitor v = new MaxDepthVisitor();
		int currNodes = 0;
		int nodeVisits = 0;
		String[] names = {"10<9?x:y","10+a*3<9-4+2 ? 3 + 4 : 5 * 7","1 ? 2 ? 3 ? 4 : 5 : 6 : 7","1 ? 2 ? 3 : 4 ? 5 : 6 : 7 ? 8 : 9"};
		condExpressions.put("10<9?x:y", 5);
		condExpressions.put("10+a*3<9-4+2 ? 3 + 4 : 5 * 7", 7);
		condExpressions.put("1 ? 2 ? 3 ? 4 : 5 : 6 : 7", 6);
		condExpressions.put("1 ? 2 ? 3 : 4 ? 5 : 6 : 7 ? 8 : 9", 6);
		Program p;
		for (int i = 0; i < condExpressions.size(); i++){
			currNodes = condExpressions.get(names[i]);
			p = Parser.parse("print " + names[i]);
			nodeVisits = v.visit(p);
			assertEquals(currNodes, nodeVisits);
		}
	}
}

