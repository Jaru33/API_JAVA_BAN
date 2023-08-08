package two;

public class StringMethodBasic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String 클래스의 생성자와 메서드		
//1.String(String s) 주어진 문자열(s)를 갖는 String 인스턴스를 생성한다
//		String s = new String("Hello");
//		System.out.println(s);
//2.String(char[] value) 주어진 문자열(value)을 갖는 String 인스턴스를 생성한다
//		char[] c = {'H','e','l','l','o'};
//		String s = new String(c);
//		System.out.println(s);
//3.String(StringBuffer buf) StringBuffer인스턴스가 갖고 있는 
//	문자열과 같은 내용의 String인스턴스생성
//		StringBuffer sb = new StringBuffer("Hello");
//		String s = new String(sb);
//		System.out.println(s);
//4.char charAt(int index) 지정된 위치(index)에 있는 문자를 알려준다.
//(index는 0부터 시작)
//		String s = "Hello";
//		String n = "0123456";
//		char c = s.charAt(1);
//		char c2 = n.charAt(1);
//		System.out.println(c);
//		System.out.println(c2);
//5.boolean contains(CharSequence s) 지정된 문자열(s)이 포함되어 있는지 검사한다.
//		String s = "abcedfg";
//		boolean b = s.contains("bc");
//		System.out.println(b);
//6.boolean endsWith(String suffix) 지정된 문자열(suffix)로 끝나는지 검사한다.
//		String file = "Hello.txt";
//		boolean b = file.endsWith("txt");
//		System.out.println(b);
//7.boolean equals(Objecet obj)매개변수로 받은 문자열(obj)과 String인스턴스의 문자열을 비교한다.
//obj가 String이 아니거나 문자열이 다르면 false를 반환한다
//		String s = "Hello";
//		boolean b = s.equals("Hello");
//		boolean b2 = s.equals("hello");
//		System.out.println(b);
//		System.out.println(b2);
//8. boolean equalsIgnoreCase(String str) 문자열과 String인스턴스의 문자열을 
//대소문자 구분없이 비교한다.
//		String s = "Hello";
//		boolean b = s.equalsIgnoreCase("Hello");
//		boolean b2 = s.equalsIgnoreCase("heLLo");
//		System.out.println(b);
//		System.out.println(b2);
//9.int indexOf(int ch)주어진 문자(ch)가 문자열에 존재하는지 확인 하여 위치(index)를 알려준다.
//못 찾으면 -1을 반환한다.(index는 0부터시작)
//		String s = "Hello";
//		int idx1 = s.indexOf('o');
//		int idx2 = s.indexOf('k');
//		System.out.println(idx1);
//		System.out.println(idx2);
//10.int indexOf(int ch, int pos)주어진 문자(ch)가 문자열에 존재하는지 지정된 위치(pos)부터
//확인하여 위치(index) 를 알려준다. 못 찾으면 -1을 반환한다 (index는 0부터시작)
//		String s = "Hello";
//		int idx1 = s.indexOf('e', 0);
//		int idx2 = s.indexOf('e', 2);
//		System.out.println(idx1);
//		System.out.println(idx2);
//11.int indexOf(String str)주어진 문자열이 존재하는지 확인하여 그 위치(index)를 알려준다.
//없으면 -1을 반환한다(index는 0부터 시작)
//		String s = "ABCDEFG";
//		int idx = s.indexOf("D");
//		System.out.println(idx);
//12. int lastIndexOf(int ch) 지정된 문자 또는 문자코드를 문자열의 오른쪽 끝에서부터 찾아서 위치(index)
//를 알려준다. 못 찾으면 -1을 반환한다
//		String s = "java.lang.Object";
//		int idx1 = s.lastIndexOf('.');
//		int idx2 = s.indexOf('.');
//		System.out.println(idx1);
//		System.out.println(idx2);
//13.int lastIndexOf(String str)지정된 문자열을 인스턴스의 문자열 끝에서 부터 찾아서 위치(index)를
//알려준다. 못 찾으면 -1을 반환한다.
//		String s = "java.lang.java";
//		int idx1 = s.lastIndexOf("java");
//		int idx2 = s.indexOf("java");
//		System.out.println(idx1);
//		System.out.println(idx2);
//14.int length() 문자열의 길이를 알려준다.
//		String s = "Hello";
//		int length = s.length();
//		System.out.println(length);
//15.String replace(char old, char nw)문자열 중의 문자(old)를 새로운 문자(nw)로 
//바꾼 문자열을 반환한다.
//		String s = "Hello";
//		String s1 = s.replace('H','C');
//		System.out.println(s);
//16.String replace(CharSequence old, CharSequence nw)문자열 중의 문자열(old)을
//새로운 문자열(nw)로 모두 바꾼 문자열을 반환한다
//		String s = "Hellollo";
//		String s1 = s.replace("ll", "LL");
//		System.out.println(s1);
//17. String replaceAll(String regex, String replacement) 문자열 중에서 지정된 문자열
//(regex)과 일치하는 것을 새로운 문자열(replacement)로 모두 번경한다
//		String ab = "AABBAABB";
//		String r = ab.replaceAll("BB","bb");
//		System.out.println(r);
//18.String repalceFirst(String regex, String replacement)문자열 중에서 지정된 문자열
//(regex)과 일치하는 것 중, 첫 번째 것만 새로운 문자열(replacement)로 변경한다.
//		String ab = "AABBAABB";
//		String r = ab.replaceFirst("BB","bb");
//		System.out.println(r);
//19.String[]split(String regex)문자열으 지정된 분리자(regex)로 나누어 문자열 배열에 담아 반환한다.
//		String animals = "dog,cat,bear";
//		String[] arr = animals.split(",");
//		System.out.println(arr[0]);				
//		System.out.println(arr[1]);             
//		System.out.println(arr[2]);
//20.String[] split(String regex, int limit) 문자열을 지정된 분리자(regex)로 나누어 문자배열에
//담아 반환한다. 단, 문자열 전체를 지정된 수 (limit)로 자른다.
//		String animals = "dog,cat,bear,rabbit";
//		String[] arr = animals.split(",",3);
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//21.boolean startsWith(String prefix)주어진 문자열(prefix)로 시작하는지 검사한다.
//		String s = "java.lang.Object";
//		boolean b = s.startsWith("java");
//		boolean b2 = s.startsWith("lang");
//		System.out.println(b);
//		System.out.println(b2);
//22.String substring(int begin),String substring(int begin, int end)
//주어진 시작위치(begin)부터 끝 위치(end)범위에 포함된 문자열을 얻는다. 이 때, 시작위치의 문자는 범위에
//포함된 문자열을 얻는다.
//		String s = "java.lang.Object";
//		String c = s.substring(10);
//		String p = s.substring(5,9);
//		System.out.println(c);
//		System.out.println(p);
//23.String toLowerCase()String인스턴스에 저장되어있는 모든 문자열을 소문자로 변환하여 반환한다.
//		String s = "Hello";
//		String s1 = s.toLowerCase();
//		System.out.println(s1);
//24.String toString() String 인스턴스에 저장되어 있는 문자열을 반환한다.
//		String s = "Hello";
//		String s1 = s.toString();
//		System.out.println(s1);
//25. String toUpperCase()String 인스턴스에 저자오디어 있는 모든 문자열을 대문자로 변환하여 반환한다.
//		String s = "Hello";
//		String s1 = s.toUpperCase();
//		System.out.println(s1);
//26.String trim()문자열의 왼쪽 끝과 오른쪽 끝에 있는 공백을 없앤 결과를 반환한다. 이때 문자열 중간에 있는
//공백은 제거되지 않는다.
//		String s = "   Hello World   ";
//		String s1 = s.trim();
//		System.out.println(s);
//		System.out.println(s1);
//27 static String valueOf(boolean b)
//static String valueOf(char c)
//static String valueOf(int i)
//static String valueOf(long l)
//static String valueOf(float f)
//static String valueOf(double d)
//static String valueOf(Object o)
//지정된 값을 문자열로 변환하여 반환한다
//참조 변수의 경우, toStirng()을 호출한 결과를 반환한다.
//
//		String b = String.valueOf(true);
//		String c = String.valueOf('a');
//		String i = String.valueOf(100);
//		String l = String.valueOf(100L);
//		String f = String.valueOf(10f);
//		String d = String.valueOf(10.0);
//		java.util.Date dd = new java.util.Date();
//		String date = String.valueOf(dd);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(i);
//		System.out.println(l);
//		System.out.println(f);
//		System.out.println(d);
//		System.out.println(date);

		
		

		
		
		
		
	}

}
