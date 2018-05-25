package zoku_study;

public class hametsukuji {
		static String[] kuji = {"凶", "大凶", "破滅", "大破滅", "死", "無", "つらいにゃん"};
		
		static void omikuji() {
			System.out.println(kuji[(int)(Math.random() * kuji.length)]);
	}
		
		public static void main(String args[]) {
			System.out.print("今日の破滅は:" );
			omikuji();
		}
}
