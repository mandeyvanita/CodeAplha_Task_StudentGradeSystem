import java.util.ArrayList;

public class GradeManager {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student Added Successfully!");
    }

    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No Student Records Found!");
            return;
        }

        System.out.println("\n-------------------------------------------------------------");
        System.out.printf("%-15s %-10s %-10s %-10s%n",
                "Name", "Marks", "Grade", "Result");
        System.out.println("-------------------------------------------------------------");

        for (Student s : students) {
            System.out.printf("%-15s %-10d %-10s %-10s%n",
                    s.getName(),
                    s.getMarks(),
                    s.getGrade(),
                    s.getResult());
        }
    }

    public void searchStudent(String name) {

        for (Student s : students) {

            if (s.getName().equalsIgnoreCase(name)) {

                System.out.println("\nStudent Found");
                System.out.println("Name : " + s.getName());
                System.out.println("Marks : " + s.getMarks());
                System.out.println("Grade : " + s.getGrade());
                System.out.println("Result : " + s.getResult());
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    public void displayReport() {

        if (students.isEmpty()) {
            System.out.println("No Data Available.");
            return;
        }

        int total = 0;
        Student highest = students.get(0);
        Student lowest = students.get(0);

        for (Student s : students) {

            total += s.getMarks();

            if (s.getMarks() > highest.getMarks())
                highest = s;

            if (s.getMarks() < lowest.getMarks())
                lowest = s;
        }

        double average = (double) total / students.size();

        System.out.println("\n========== REPORT ==========");
        System.out.println("Total Students : " + students.size());
        System.out.printf("Average Marks : %.2f%n", average);

        System.out.println("\nHighest Marks");
        System.out.println(highest.getName() + " : " + highest.getMarks());

        System.out.println("\nLowest Marks");
        System.out.println(lowest.getName() + " : " + lowest.getMarks());
    }
}