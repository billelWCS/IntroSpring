package fr.wcs.introSpring.controllers;
import fr.wcs.introSpring.BDDSimulation;
import fr.wcs.introSpring.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Controller
public class WildController {
    BDDSimulation bddSimulation = new BDDSimulation();

    @GetMapping("/students")
    @ResponseBody
    public ResponseEntity<List<Student>> getStudents(){
        return new ResponseEntity<List<Student>>(bddSimulation.getStudents(), HttpStatus.OK);
    }

    @GetMapping("students/{name}")
    @ResponseBody
    public ResponseEntity<Student> getStudentByName(@PathVariable String name){
        Student result = bddSimulation.getStudentByName(name);
        if (result!=null){
            return new ResponseEntity<Student>(result,HttpStatus.OK);
        }else{
            return new ResponseEntity("Student not found", HttpStatus.NOT_FOUND);
        }

    }


}
