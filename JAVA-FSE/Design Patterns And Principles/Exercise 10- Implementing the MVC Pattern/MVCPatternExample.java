class Student {
    private String name;
    private int id;
    private String grade;
    public Student(String name, int id, String grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public String getGrade() {
        return grade;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
}
class StudentView {
    public void displayStudentDetails(String name, int id, String grade) {
        System.out.println("Student Details");
        System.out.println("Name : " + name);
        System.out.println("ID   : " + id);
        System.out.println("Grade: " + grade);
    }
}
class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }
    public void updateStudent(String name, String grade) {
        model.setName(name);
        model.setGrade(grade);
    }
    public void displayStudent() {
        view.displayStudentDetails(model.getName(), model.getId(), model.getGrade());
    }
}
public class MVCPatternExample{
    public static void main(String[] args) {
        Student student = new Student("Prithisha", 101, "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);
        controller.displayStudent();
        controller.updateStudent("Prithisha Ravi", "A+");
        System.out.println("\nUpdated Details:");
        controller.displayStudent();
    }
}