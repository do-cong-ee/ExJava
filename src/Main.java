import java.io.*;
import java.util.*;


public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
     
		String[] firstLine = br.readLine().split(" ");  
		int N = Integer.parseInt(firstLine[0]);         
		int M = Integer.parseInt(firstLine[1]);        
     
		List<Map.Entry<String, Integer>> dict = new ArrayList<>();
		String word;
		
		for(int i=0;i<N;i++)
		{
			word = br.readLine().trim();
			//boolea
		}
		
		bw.flush();
		bw.close(); 
		br.close();
		return ;
	}
}
