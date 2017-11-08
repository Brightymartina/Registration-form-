package com.example.regform;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.http.ResponseEntity;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

import com.example.regform.registration;
import com.example.regform.registrationService;


@RestController
// @CrossOrigin(origins = "http://localhost:10001", maxAge = 3600)
@CrossOrigin(origins = "*")
@RequestMapping("reg")
public class registrationController {

    @Autowired
    private registrationService registrationservice;

    @GetMapping("/get")
    public @ResponseBody ResponseEntity<List<registration>> all() {
        return new ResponseEntity<>(registrationservice.getAll(), HttpStatus.OK);
    }

    @PostMapping("/post")
    public ResponseEntity<?> post(@RequestBody registration r, UriComponentsBuilder ucBuilder) {
        System.out.println("Enter1");
        registrationservice.save(r);
        System.out.println("Enter2");
        HttpHeaders headers = new HttpHeaders();
        System.out.println("Enter3");
        headers.setLocation(ucBuilder.path("/get/{id}").buildAndExpand(r.getId()).toUri());
        System.out.println("Enter4");
        return new ResponseEntity<>(headers, HttpStatus.CREATED);

    }

    @GetMapping("/get/{id}")
    public @ResponseBody ResponseEntity<?> getById(@PathVariable int id) {

        registration r = registrationservice.find(id);
        return new ResponseEntity<>(r, HttpStatus.OK);

    }

    @PutMapping("/put/{id}")
    public ResponseEntity<?> put(@PathVariable int id, @RequestBody registration r) {

        registrationservice.save(r);
        return new ResponseEntity<>(r, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {
        //Event currentevent = eventService.find(eventId);
        registrationservice.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


} 