package java02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ExamBuffering {

	public static void main(String[] args) throws Throwable {
//		Scanner sc = new Scanner(System.in);
		// InputStream(1Byte 단위 전송) -> InputStreamReader(1Byte -> 2Byte 전송 변환)
		// -> BufferedReader(2Byte씩 8K를 버퍼링_4000자 단위로 한번에 전송) -> br.readLine()

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String line = br.readLine();
		System.out.println("line = " + line);
		// 공백기준 글자 분할 토크닝, 파싱(tokenize, parsing)
		StringTokenizer st = new StringTokenizer(line);
		String s1 = st.nextToken();
		System.out.println("s1 = " + s1);
		String s2 = st.nextToken();
		System.out.println("s2 = " + s2);
		String s3 = st.nextToken();
		System.out.println("s3 = " + s3);
	}

}
