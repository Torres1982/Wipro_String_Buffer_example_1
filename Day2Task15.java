import java.lang.StringBuffer;

class Day2Task15 {
	public static void main(String args[]) {
		String string = "xWelcomex";
		String appendedString = appendFirstLastCharsOfString(string);
		
		System.out.println(appendedString);
	}
	
	public static String appendFirstLastCharsOfString(String string) {
		String result = "";
		int stringOneLastIndex = string.length()-1;
		int string1Length = string.length();
		StringBuffer stringBuffer = new StringBuffer(string);

		
		if ((string.charAt(stringOneLastIndex)) == 'x') {
			stringBuffer.setLength(stringOneLastIndex);
		}
		if (string.charAt(0) == 'x') {
			stringBuffer.delete(0, 1);
		}
		
		result = stringBuffer.toString();
		
		return result;
	}
}