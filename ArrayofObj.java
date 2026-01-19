
class Student {
    int roll;
    String name;
    int marks;
}

public class ArrayofObj {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 1;
        s1.name = "Jashandeep Singh";
        s1.marks = 99;

        Student s2 = new Student();
        s2.roll = 2;
        s2.name = "Ishvjot Singh";
        s2.marks = 97;

        Student s3 = new Student();
        s3.roll = 1;
        s3.name = "Krish Jindal";
        s3.marks = 98;

        Student[] studs = new Student[3];
        studs[0] = s1;
        studs[1] = s2;
        studs[2] = s3;

        for (Student s : studs) {
            System.out.println(s.name+" : "+s.marks);
        }
    }
}