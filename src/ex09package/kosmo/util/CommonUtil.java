package ex09package.kosmo.util;

public class CommonUtil {

	public static boolean isNumber(String strValue) {
		
		if(strValue.length()==0) {
			return false;
		}
		
		for(int i=0; i<strValue.length(); i++) {
			int acode = strValue.codePointAt(i); //()안의 인덱스 숫자에 해당하는 아스키코드 반환
			if(!(acode>='0' && acode<='9')) {//해당 아스키코드가 문자숫자 0~9에 해당하면 숫자라는 논리
				return false;
			}
		}
		return true;
	}
}
