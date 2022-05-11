/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
 
import java.io.Serializable;
import java.util.Date;
 
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name = "student")
@XmlAccessorType(XmlAccessType.FIELD)

/**
 *
 * @author HOANGTUAN
 */

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private Date dob;
    private String address;
    private String email;
    /* điểm trung bình của sinh viên */
    private float gpa;
 
    public Student() {
    }
 
    public Student(int id, String name, Date dob, String address,String email, float gpa) {
        super();
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.email=email;
        this.gpa = gpa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public Date getDob() {
        return dob;
    }
 
    public void setDob(Date age) {
        this.dob = age;
    }
 
    public String getAddress() {
        return address;
    }
 
    public void setAddress(String address) {
        this.address = address;
    }
 
    public float getGpa() {
        return gpa;
    }
 
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}