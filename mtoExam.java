public class mtoExam {

  
    public static void main(String[] args) {
      
      mtoExam mtoExam = new mtoExam(); //클래스 생성
      mtoExam.StrCombine("hellow", "jiseungmin"); // 메소드 실행 (String 타입을 2개를 넘겨줌)
      String bbb  = mtoExam.Stringjiseungmin("hellow","jiseungmin");
  
      System.out.println(bbb);
  
  
  
    }
    
  // 메소드를 만든 것
                                               // 메소드를 만드는 이유
                                               // 1. 유지보수를 위해서
                                               // 2. 가독성이 좋아지니깐
                                               // 3. 캡슐화 ( 여러곳에서 중복된 코드를 작성할 필요가 없어짐)
  
  public void StrCombine (String a,String b) { //void는 실행형 메소드 main 메소드에서 hellow 와 jiseungmin를 받아서 출력
  
    String result = a + b;
    System.out.println(result);
  }
  
  public String Stringjiseungmin(String ji, String seungmin){ // return 리턴형 메소드 result 값들을 main함수로 가서 메소드받아서 출력
    String result = ji + seungmin;
    return result;
  
  }
  
  }
  
  

