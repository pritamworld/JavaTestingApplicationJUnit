package sample;

import java.util.Arrays;

public class Student {
    float per;
    char grade;
    private int studentID;
    private String studentName;
    private int[] marks;
    private int total;

    Student() {
        this.studentID = 0;
        this.studentName = "";
        this.marks = new int[5];
        this.total = 0;
        this.per = 0.0f;
        this.grade = '\u0000';
    }

    public Student(int studentID, String studentName, int[] marks) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.marks = marks;
        calculateTotal();
        calculatePercentage();
        this.grade = getLetterGrade();
    }

    public void setStudentData(int studentID, String studentName, int[] marks) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.marks = marks;
    }

    private void calculateTotal() {
        for (int m : this.marks) {
            this.total += m;
        }
    }

    private void calculatePercentage() {
        this.per = this.total / 500;
    }


    public char getLetterGrade() {
        // assume that mark is between 0 and 100 (inclusive)
        assert (per >= 0 && per <= 100) : "mark is out-of-range: " + per;
        if (per >= 75) {
            return 'A';
        } else if (per >= 60) {
            return 'B';
        } else if (per > 50) {   // an logical error here
            return 'C';
        } else {
            return 'F';
        }
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public float getPer() {
        return per;
    }

    public void setPer(float per) {
        this.per = per;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                ", marks=" + Arrays.toString(marks) +
                ", total=" + total +
                ", per=" + per +
                ", grade='" + grade + '\'' +
                '}';
    }
}
