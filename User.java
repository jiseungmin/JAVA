public class User {

  String name ;
  int age ;
  String hobby ;

  //디폴트 생성자
  public User (){

  }
// 클래스의 생성자  커맨드 + n
  public User (String name, int age, String hobby){
    this.name = name;
    this.age = age;
    this.hobby =hobby;
  }

  // 게터와 세터 영역 //

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getHobby() {
    return hobby;
  }

  public void setHobby(String hobby) {
    this.hobby = hobby;
  }

  
  }
