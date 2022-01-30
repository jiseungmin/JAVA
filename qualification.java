public class qualification {
//메인함수
  public static void main(String[] args) {
    String dog = "귀엽다";
    int a = 3;

    if (dog == "안귀엽다") {
      System.out.println("틀렸습니다.");
    }else if ( dog == "귀엽다"){
      System.out.println("맞습니다.");
    }else {
      System.out.println("뭔소리입니까?");
    }

    if (a == 0){
      System.out.println("틀렸습니다.");
    }else if (a == 3){
      System.out.println("맞습니다.");
    }else {
      System.out.println("틀립니다.");
    }


// and 연산자, or 연산자
    if (a == 3 && a == 1){ //and 연산자 사용
      System.out.println("맞습니다");
    }

    if (a == 0 || a == 3){// or 연산자 사용
      System.out.println("맞습니다.");
    }

  }
  
}
