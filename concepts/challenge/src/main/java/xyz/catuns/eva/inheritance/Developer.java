package xyz.catuns.eva.inheritance;

import java.util.Date;

public class Developer extends Employee{

  private int computerId;
  private Date hireDate;

  private String title;


  public Developer(String name, double salary, int employeeId, int computerId, Date hireDate, String title) {
    super(name, salary, employeeId);
    this.computerId = computerId;
    this.hireDate = hireDate;
    this.title = title;
  }

  public int getComputerId() {
    return computerId;
  }

  public void setComputerId(int computerId) {
    this.computerId = computerId;
  }

  public Date getHireDate() {
    return hireDate;
  }

  public void setHireDate(Date hireDate) {
    this.hireDate = hireDate;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
