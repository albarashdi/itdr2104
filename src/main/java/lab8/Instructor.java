/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;


/**
 *
 * @author ss0368
 */
public class Instructor extends Person{
    
    private int empNo;
    private String dept;

    public Instructor(int empNo, String dept) {
        this.empNo = empNo;
        this.dept = dept;
    }

    public Instructor(int i, String n, String g, int empNo, String dept) {
        this.age=i;
        this.name=n;
        this.gender=g;
        this.empNo = empNo;
        this.dept = dept;
    }

    public int getEmpNo() {
        return empNo;
    }

    public String getDept() {
        return dept;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    @Override
    public boolean equals(Object o){
        return o instanceof Instructor;
    }
    
    
}
