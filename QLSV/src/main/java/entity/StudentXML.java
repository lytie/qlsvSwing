/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.List;
 
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name = "students")
@XmlAccessorType(XmlAccessType.FIELD)

/**
 *
 * @author HOANGTUAN
 */

public class StudentXML {
     
    private List<Student> student;
 
    public List<Student> getStudent() {
        return student;
    }
 
    public void setStudent(List<Student> student) {
        this.student = student;
    }
}