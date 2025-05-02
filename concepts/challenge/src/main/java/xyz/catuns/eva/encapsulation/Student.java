package xyz.catuns.eva.encapsulation;

public class Student {
  private String studentName;
  private int studentId;
  private int[] grades;

  public Student(String studentName, int studentId, int[] grades) {
    this.studentName = studentName;
    this.studentId = studentId;
    this.grades = grades;
  }

  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  public int getStudentId() {
    return studentId;
  }

  public void setStudentId(int studentId) {
    this.studentId = studentId;
  }

  public int[] getGrades() {
    return grades;
  }

  public void setGrades(int[] grades) {
    this.grades = grades;
  }
}
