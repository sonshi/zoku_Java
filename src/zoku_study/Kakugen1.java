package zoku_study;

import java.util.*;
import java.io.*;
public class Kakugen1 {
	public static void main(String args[]) {
		FileReader fr;
		BufferedReader br;
		String kakugenFile = "src/zoku_study/hametsu.txt";
		Vector vec = new Vector(4);
		String str, kakugen;
		
		try {
			fr = new FileReader(kakugenFile);
			br = new BufferedReader(fr);
			while(( str = br.readLine()) != null) {
				vec.add(str);
			}
			br.close();
			kakugen = (String)vec.get((int)(Math.random() * vec.size()));
			
			System.out.println(kakugen);
		} catch(FileNotFoundException e) {
			System.err.println("ファイルが見つかりませんでした");
		} catch(IOException e) {
			System.err.println("読み込めませんでした");
		}
	}
}
