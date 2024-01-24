package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2", "학생3"};
        int[] studentAges = {15, 16, 17};
        int[] studentGrades = {90, 80, 75};

        for (int i = 0; i < studentAges.length; i++) {
            System.out.println("학생 이름 : " + studentNames[i] +" 나이 : " +  studentAges[i]
                    + "성적 : " +  studentGrades[i]);
        }

    }

}
