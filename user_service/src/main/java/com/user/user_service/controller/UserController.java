package com.user.user_service.controller;


import com.user.user_service.dto.PersonDto;
import com.user.user_service.dto.ResponseDto;
import com.user.user_service.dto.UserDto;
import com.user.user_service.entity.User;
import com.user.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    UserService personResponse;
    @GetMapping("/")
    public ResponseEntity<ResponseDto> getPerson(){
        List<User> personEntities = personResponse.getPerson();
        return new ResponseEntity<ResponseDto>(new ResponseDto("Success",personEntities), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<ResponseDto> addData(@RequestBody UserDto personDto){
        User personEntity = personResponse.addPerson(personDto);
        return new ResponseEntity<ResponseDto>(new ResponseDto("Success",personEntity), HttpStatus.OK);
    }
    @GetMapping("/{userid}")
    public ResponseEntity<ResponseDto> getUserById(@PathVariable("userid") int personId){
        User personEntities = personResponse.getById(personId);
        return new ResponseEntity<ResponseDto>(new ResponseDto("Success",personEntities), HttpStatus.OK);
    }
    @PutMapping("/{userid}")
    public ResponseEntity<ResponseDto> updatePerson(@PathVariable("userid") int personId, @RequestBody UserDto personDto){
        User personEntities = personResponse.updateById(personId,personDto);
        return new ResponseEntity<ResponseDto>(new ResponseDto("Success",personEntities), HttpStatus.OK);
    }

    @DeleteMapping("/{userid}")
    public ResponseEntity<ResponseDto> delete(@PathVariable("userid") int personId){
        personResponse.deleteById(personId);
        return new ResponseEntity<ResponseDto>(new ResponseDto("Success","Deleted"), HttpStatus.OK);
    }

    @GetMapping("/person/{personid}")
    public ResponseEntity<ResponseDto> getPersonById(@PathVariable("personid") int personId){
      PersonDto personDtos = personResponse.getPersonById(personId);
        return new ResponseEntity<ResponseDto>(new ResponseDto("Success",personDtos), HttpStatus.OK);
    }

}
