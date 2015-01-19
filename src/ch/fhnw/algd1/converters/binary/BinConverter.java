package ch.fhnw.algd1.converters.binary;



public class BinConverter {

	public static String toString(int x) {
		if (x < 0) x = x + 256;
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < 8; i++) {
			if ((x % 2) == 1) s.insert(0, '1');
			else s.insert(0, '0');
			x = x / 2;
		}
		return s.toString();
	}
	public static int fromString(String text) {
		int x=0;
		for (int i = 0; i < text.length(); i++) {
			x = 2 * x;
			if (text.charAt(i) == '1') x++;
		}
		return x > 127 ? x = x - 256 : x;
	}
}