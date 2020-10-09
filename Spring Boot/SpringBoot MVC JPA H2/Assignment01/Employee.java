package com.abhishek.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Employee
{
    @Id
    @Column
    private int empid;
    @Column
    private String empname;

    public int getempid()
    {
        return empid;
    }
    public void setempid(int empid)
    {
        this.empid = empid;
    }
    public String getempname()
    {
        return empname;
    }
    public void setempname(String empname)
    {
        this.empname = empname;
    }


}
