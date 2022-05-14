package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientDetailsController {
    @Autowired
    HospitalManagementSystemRepo hmsr ; 

    @GetMapping("/")
public ResponseEntity <?> home(){
   return ResponseEntity.ok(this.hmsr.findAll());
}

@GetMapping("/home/hospitalManagementSystem")
public void newUser(@RequestBody HospitalManagementSystem hospitalManagementSystem) {
  this.hmsr.save(hospitalManagementSystem);
 }

}