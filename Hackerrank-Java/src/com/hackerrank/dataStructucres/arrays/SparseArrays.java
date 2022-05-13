package com.hackerrank.dataStructucres.arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * There is a collection of input strings and a collection of query strings. For
 * each query string, determine how many times it occurs in the list of input
 * strings.
 * 
 * For example, given input and , we find instances of ', of '' and of ''. For
 * each query, we add an element to our return array, .
 * 
 * Function Description
 * 
 * Complete the function matchingStrings in the editor below. The function must
 * return an array of integers representing the frequency of occurrence of each
 * query string in strings.
 * 
 * matchingStrings has the following parameters:
 * 
 * strings - an array of strings to search queries - an array of query strings
 * Input Format
 * 
 * The first line contains and integer , the size of . Each of the next lines
 * contains a string . The next line contains , the size of . Each of the next
 * lines contains a string .
 * 
 * Constraints
 * 
 * 
 * 
 * .
 * 
 * Output Format
 * 
 * Return an integer array of the results of all queries in order.
 * 
 * @author phsg5
 *
 */
public class SparseArrays {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int stringsCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String[] strings = new String[stringsCount];

		for (int i = 0; i < stringsCount; i++) {
			String stringsItem = scanner.nextLine();
			strings[i] = stringsItem;
		}

		int queriesCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String[] queries = new String[queriesCount];

		for (int i = 0; i < queriesCount; i++) {
			String queriesItem = scanner.nextLine();
			queries[i] = queriesItem;
		}

		int[] res = matchingStrings(strings, queries);

		for (int i = 0; i < res.length; i++) {
			bufferedWriter.write(String.valueOf(res[i]));

			if (i != res.length - 1) {
				bufferedWriter.write("\n");
			}
		}

		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}

	// Complete the matchingStrings function below.
	static int[] matchingStrings(String[] strings, String[] queries) {
		int[] retorno = new int[queries.length];
		List<String> vListQ = new ArrayList<>(Arrays.asList(queries));
		List<String> vListS = new ArrayList<>(Arrays.asList(strings));

		for (int p = 0; p < vListQ.size(); p++) {
			String que = vListQ.get(p);
			for (int i = 0; i < vListS.size();) {
				if (vListS.get(i).equalsIgnoreCase(que)) {
					retorno[p] = retorno[p] + 1;
//					vListS.remove(i);
				} // else {
				i++;
				// }
			}
		}

		return retorno;
	}
}
