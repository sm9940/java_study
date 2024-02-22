package ch07.sec09;

public class InstanceOfExample {
    public static void main(String[] args) {
      Person p1 = new Person("홍길동");
      personInto(p1);
Person p2 = new Student("김길동",10);
personInto(p2);
    }
    public static void personInto(Person person){
        System.out.println("name: "+person.name);
        person.walk();

        //강제타입변환을 하기 전에 instanceof를 사용해 타입을 확인한다.

//        if( person instanceof Student){
//            //person이 Student 객체를 가지고 있을 경우 강제타입 변환
//            Student student = (Student) person;
//            //Student 객체에 있는 필드, 메소드 사용 가능
//            System.out.println("studentNo: "+student.studentNo);
//            student.study();
//        }
        if(person instanceof Student student){
            System.out.println("studentNo: "+student.studentNo);
            student.study();
        }
    }
}
