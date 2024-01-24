package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1; // 학생을 담을 변수 선언
        student1 = new Student(); // 학생을 담을 메모리를 만든다.
        student1.name = "학생1";  // 클래스에서는 .을 통해 접근할 수 있다.
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);

        System.out.println("이름 : " + student1.name + " 나이 : " +student1.age + " 성적 : " + student1.grade);
        System.out.println("이름 : " + student2.name + " 나이 : " +student2.age + " 성적 : " + student2.grade);
    }
}
