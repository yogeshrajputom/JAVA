class Student {

    int rollno;
    String studentName;
}

public class First {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.rollno = 1;
        obj1.studentName = "Mohan";
        System.out.println(obj1.studentName);
        System.out.println(obj1.rollno);
        Student obj2 = new Student();
        obj2.rollno = 4;
        obj2.studentName = "Ram";
        System.out.println(obj2.studentName);
        System.out.println(obj2.rollno);
    }

}