package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student = createStudent("학생1", 15, 90);

        Student student1 = createStudent("학생2", 16, 80);

        printStudent(student);
        printStudent(student1);

    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.gradle = grade;
        return student;
    }
    static void printStudent(Student student) {
        System.out.println("이름: " + student.name + " 나이 : " + student.age + " 성적 : " + student.gradle);

    }
}
