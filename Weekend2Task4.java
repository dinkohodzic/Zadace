public class Weekend2Task4 {

	public static void main(String[] args) {
		TextIO.readFile("src/encodedFile.in");
		int n = TextIO.getlnInt();

		for (int i = 1; i <= n; i++) {
			String line = TextIO.getln();
			int l = line.length();
			for (int j = 0; j < l; j++) {
				char c = line.charAt(j);
				int num = c - 1;
				c = (char) num;
				System.out.print(c);
			}
			System.out.println();
		}
	}

}
