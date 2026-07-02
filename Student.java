public class Student {

    private String name;
    private int marks;
    private String grade;
    private String result;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
        this.grade = Utils.calculateGrade(marks);
        this.result = Utils.checkResult(marks);
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public String getGrade() {
        return grade;
    }

    public String getResult() {
        return result;
    }
}