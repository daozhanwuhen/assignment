package expression;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchZipCodes {

	public static void main(String[] args) throws IOException {
		  FileReader reader = new FileReader("match.txt");
          BufferedReader br = new BufferedReader(reader);
  		String letters = "";
  		while(true){
  			String s = br.readLine();
  			if (s == null){
  				break;
  			}
  			letters += getMatch(s);
  		}
  		System.out.println(letters);
	}

	private static String getMatch(String s) {
		String regex = "[1-9]\\d{5}";
		String matches = "";
		matches += findMatch(regex, s);
		return matches;
	}

	private static String findMatch(String regex, String s) {
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(s);
		String matches = "";
		while(m.find()){
			matches += m.group();
		}
		return matches;
	}

}
