import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Balachandran
 *
 */
public class ReverseWords {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		//System.out.println(n);

		List<String> list = new ArrayList<String>();
		for(int index=0; index <n; index++) {
			list.add(br.readLine());
			//System.out.println(list.get(index));
		}

		for(String sentence :list) {
			// Reverse Words
			String words[] = sentence.split(" "); 
			String reverseWords = ""; 
			for (int index = words.length - 1; index >= 0; index--) { 
				reverseWords += words[index].trim() + " "; 
			} 
			System.out.println(reverseWords); 
		}
	}
}
