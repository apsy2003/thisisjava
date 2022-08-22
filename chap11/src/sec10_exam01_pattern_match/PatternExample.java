package sec10_exam01_pattern_match;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-1234-4567";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		// white@naver.com (or) white@naver.co.kr
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "ashram7@hanmail.net";
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}		
		
		// 날짜와 일반 숫자를 구분해서 데이터 베이스에 구축하기 위한 정규식 표현
		//^\\d{4}-\\d{2}-\\d{2}$
	}

}
