public class ArrayExam {
  public static void main(String[] args) {
    //배열 int 이름 [] = {}
    int arrayInt1[] = new int[10];
    for(int i=0; i<arrayInt1.length; i++){
      System.out.println(i);
    }

    int arrayint2[] = {1,3,5,7,9};
    for(int i=0; i<arrayint2.length; i++){
      System.out.println(i);
    }

    int arrayint3[] = {1,3,5,7,9};
    for(int i =0; i<arrayint3.length; i++){
      System.out.println(arrayint3[i]); // arrayint3[i] 는 {1,3,5,7,9}에서 0번째 시작하라는 의미를 담고 있음
    }

    String arraystr[] = {"하나","둘","셋"};
    for(int i = 0; i<arraystr.length; i++){
      System.out.println(arraystr[i]);
    }
  }
  
}
