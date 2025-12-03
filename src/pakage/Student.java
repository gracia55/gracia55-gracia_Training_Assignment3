package pakage;

class StudentDetails {
    private String name;
    private int rollNo;
    private int marks;

    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks! Marks must be between 0 and 100.");
        } else {
            this.marks = marks;
        }
    }
}

public class Student {
    public static void main(String[] args) {

    	StudentDetails student = new StudentDetails();
        student.setName("Ajay");
        student.setRollNo(101);
        student.setMarks(195);    
          

        System.out.println("Student Details ");
        System.out.println("Name: " + student.getName());
        System.out.println("Roll No: " + student.getRollNo());
        System.out.println("Marks: " + student.getMarks());
    }
}