import java.util.Scanner;

public class whileExam {
  public static void main(String[] args) {

    Scanner sc  =  new Scanner(System.in); // 스캐너 문법 터미널 입력하게 가능함
    int a = sc.nextInt();

    while(a<10){ // while 문  a가 10 보다 작을떄 까지 프린트를 찍어냄
      System.out.println(a);
      a++;
    }
  }
  
}
