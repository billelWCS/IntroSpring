package fr.wcs.introSpring;

import fr.wcs.introSpring.Student;
import org.springframework.http.HttpStatusCode;

import java.util.ArrayList;
import java.util.List;

public class BDDSimulation {
    List<Student> students = new ArrayList<>();

    public BDDSimulation (){
        this.students.add(new Student("Imen" , 17));
        this.students.add(new Student("Amine" , 19));
        this.students.add(new Student("Franck" , 8));
        this.students.add(new Student("Hanna" , 9));
        this.students.add(new Student("Lindya" , 007));
    }

    public List<Student> getStudents(){
        return this.students;
    }

    public Student getStudentByName(String name) {
        for (Student student : students){
            if (student.getName().equals(name)){
                return student;
            }
        }
        return null;
    }
}
