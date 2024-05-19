import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Andrzej", "Piekarski", "piekarskia@op.pl", "Cracow, Kwiatowa 3", "709-000-000", new Date(1992, 2, 12));
        Students.addStudent(s);

        StudyProgramme it = new StudyProgramme("IT", "AAA", 9, 6);
        s.enrollStudent(it);
        s.addGrade(4, "PGO");
        s.addGrade(3, "APBD");

        Students.promoteAllStudents();
        Students.displayInfoAboutAllStudents();
    }
}