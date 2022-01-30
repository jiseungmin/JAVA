import java.io.ObjectInputFilter.Status;

public class Trycatch {
  public static void main(String[] args) {
    
    int intarray [] = new int [5]; //intarray 라는 변수에다 5의 공간만큼 배열을 선언 (0,치1,2,3,4,5)

//try문이 발생하지 않으면 catch문으로 실행
    try {
      intarray[3] = 20;
      intarray[6] = 9;

    }
    catch( Exception e) {

      e.printStackTrace(); //실제 에러문을 출력
      System.out.println("배열 범위 초과");
      System.exit(0); //강제로 프로그램 종료

    }

      System.out.println("프로그램이 끝났어요");
  }
  
}
