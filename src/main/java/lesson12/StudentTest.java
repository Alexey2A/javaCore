package lesson12;

public class StudentTest {
    public static void sravnenie1(Student st1, Student st2) {
        if (st1.name == st2.name && st1.course == st2.course && st1.averageGrade == st1.averageGrade) {
            System.out.println("Student 1 raven studentu 2");
        } else {
            System.out.println("Studenti ne ravni");
        }
    }

    public static void sravnenie2(Student st1, Student st2) {
        if (st1.name==st2.name){
            if(st1.course==st2.course){
                if(st1.averageGrade== st2.averageGrade)
                    System.out.println("Studenti ravni");
                else System.out.println("Studenti NE ravni, t.k. ne ravni srednyi bal");
            } else System.out.println("Studenti NE ravni, t.k. ne ravni course");
        } else System.out.println("Studenti NE ravni, t.k. ne ravni name");
    }

    public static void main(String[] args) {
        Student s1 = new Student("Elena", 2, 8.8);
        Student s2 = new Student("Elena", 2, 8.8);

        sravnenie1(s1,s2);
        System.out.println("----");
        sravnenie2(s1,s2);
    }
}
