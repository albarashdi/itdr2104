/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author ss0368
 */
public class Student extends Person{
    
    private int studentId;
    private String major;
    
    public Student(){
        
    }
    
    public Student(int i, String s, int n, String m){
        this.age=i;
        this.name=s;
        this.studentId=n;
        this.major=m;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getMajor() {
        return major;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
