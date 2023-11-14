// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        person.set_name("John");
        person.set_age(18);
        person.set_email("john@gmail.com");
        person.set_phone("0905123456");

        person.print();

        System.out.println("----------------------------------");

        Student student = new Student();
        student.set_name("Peter");
        student.set_age(20);
        student.set_email("peter@gmail.com");
        student.set_phone("0905222333");
        student.set_score(9.5f);
        student.set_tuition(1000);
        student.set_attendance(9);

        student.print();


        System.out.println("----------------------------------");

        Teacher teacher = new Teacher();
        teacher.set_name("Mary");
        teacher.set_age(30);
        teacher.set_email("mary@gmail.com");
        teacher.set_phone("0905654321");
        teacher.set_skills("Java, C#, C++, PHP");
        teacher.set_salary(10_000_000);
        teacher.print();
    }
}