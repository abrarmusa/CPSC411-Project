package ca.ubc.cs411.assignment1;
import java.io.File;
import java.util.*;

public class WordCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] filenames = line.split(" ");
		printFileDetails(filenames);
		
	}
	
	public static void printFileDetails(String[] filenames){
		String[] filenames2  = Arrays.copyOf(filenames, filenames.length + 1);
		String[] outputlist = new String[filenames2.length];
	    filenames2[filenames2.length - 1] = "total";
		long maxlength = 0;
		long total = 0;
		long filebytes = 0;
		String output = "";
		for (int i = 0; i < filenames2.length-1; i++){
			File initial = new File(System.getProperty("user.dir"));
			File f = new File(initial, filenames2[i]);
			filebytes = getFileBytes(f);
			if (filebytes == -1){
				filenames2[i] += " **NOT A FILE**";
				filebytes = 0;
			}
			total += filebytes;
			String flength = Long.toString(filebytes);
			if ( flength.length() > maxlength ) {
				maxlength = flength.length();
			}
			outputlist[i] = flength;
			outputlist[filenames2.length-1] = String.valueOf(total);
		}
		
		if ( outputlist[filenames2.length-1].length() > maxlength ) {
			maxlength = outputlist[filenames2.length-1].length();
		}
		
		String[] justifiedSizes = rightJustify(outputlist, maxlength);
		for (int j = 0; j < filenames2.length; j++){
			output = justifiedSizes[j]+ " " + filenames2[j];
			System.out.println(output);
		}
		
	}
	
	public static long getFileBytes(File file){
	    if (file.isDirectory()) {
	        return -1;
	    } else {
	        return file.length();
	    }
	}
	
	public static String[] rightJustify(String[] filesizes, long maxlength){
		long diff = 0;
		long currSize = 0;
		for (int i = 0; i < filesizes.length; i++){
			currSize = filesizes[i].length();
			if (currSize < maxlength){
				diff = (maxlength - currSize);
				String s = "";
				for (int x = 0; x < diff; x++){
					s = s + " ";
				}
				s += filesizes[i];
				filesizes[i] = s;
			}
		}
		return filesizes;
	}

}
