package yejin.shortenURL.test.utils;

import java.util.Stack;

import yejin.shortenURL.test.commons.BadInputException;

public class AntilogarithmConversion {

	private static final int RADIX = 62;

	private static final char[] TABLE = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e',
			'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
			'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
			'V', 'W', 'X', 'Y', 'Z' };
	/**
	 * Convert form 10 to 62.
	 * @param idx
	 * @return
	 */
	public static String to62(long idx){
		Stack<Character> stack =new Stack<>();
		
		while (true) {
			int quota = (int) (idx / TABLE.length);
			int remainder = (int) (idx % TABLE.length);
			stack.push(TABLE[remainder]);

			if (quota < TABLE.length) {
				stack.push(TABLE[quota]);
				break;
			}
			
			idx = quota;
		}

		StringBuilder sb = new StringBuilder();

		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		return sb.toString();
	}
		
	 /** Convert from 62 to 10.
	 * @param shortenIdx
	 * 
	 */
	public static long toDecimal(String shortenIdx) {
		long longIdx =0;


		for(int degree = 0 ; degree <shortenIdx.length() ; degree++){
			char cipher = shortenIdx.charAt(degree);
			int cipherNum=0;

			if(48<= cipher && cipher <58 ){
				cipherNum = cipher-48;
			}else if(65<= cipher && cipher<91 ){
				cipherNum = cipher-29;
			}else if(97<=cipher && cipher <122){
				cipherNum = cipher-87;
			}else{
				throw new BadInputException("Wrong Shorten Url!");
			}
			longIdx += cipherNum * (int)Math.pow(RADIX, shortenIdx.length()-degree-1);
		}
		//System.out.println(longIdx);
		return longIdx;
	}
	
}
