public class data { //변수와 데이터 형식

  public static void main(String[] args) {
    char var1 = '지'; //한글자의 한글 or 영문 가능 '' 사용하니 주의
    String var2 = "안녕하세요!"; // 여러글자의 문자열 가능

    byte var3 = -128; // -128 ~ +127까지 사용가능
    short var4 = -32768; // -32768 ~ +32767까지 사용가능
    int var5 =  999999999; // -21억부터 +21억까지 사용가능
    long var6 = 999999999; // 여러숫자 가능

    float var7 = 0.5f; // 소수점 선언후 뒤에 f를 까먹지 말자 char같은 느낌
    double var8 = 3.242532; // 소수점 선언

    boolean isStart = false; // false 와 true 밖에 못사용 조건식에서 많이 쓰임

    System.out.println(var1);
    System.out.println(var2);
    System.out.println(var3);
    System.out.println(var4);
    System.out.println(var5);
    System.out.println(var6);
    System.out.println(var7);
    System.out.println(var8);
    System.out.println(isStart);

  }
}
