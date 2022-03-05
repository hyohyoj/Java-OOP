# Java-OOP
Java 객체 지향 프로그래밍 공부

### OOP
- OOP : 객체 지향 프로그래밍
Object-oriented programming

### class & instance
- class -> 복제한 객체 하나하나가 instance
- 클래스 내용 자체를 바꾸는게 아니라 복제한 인스턴스를 사용해 각각의 인스턴스 내용을 변경하면서 편리하게 사용

### static
- static은 class 소속.
- static이 붙지 않은 변수와 메서드는 인스턴스를 통해서만 접근 가능함.
- static이 붙은 변수는 값을 변경했을 시, 클래스의 값은 물론 그 클래스를 참조하고 있는 모든 인스턴스의 값도 같이 바뀜.

### 생성자
- 생성자 : 초기에 주입할 필요가 있는 값을 전달하거나, 초기의 작업을 수행할 때 씀.
- 클래스의 이름과 똑같은 메서드로 정의하면 됨.
- static이나 return 타입은 정의하지 않음.

### this
- this : 클래스가 인스턴스화 되었을 때의 인스턴스를 가리키는 특수한 이름.
