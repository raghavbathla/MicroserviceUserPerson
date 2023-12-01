package com.user.user_service.entity;

import com.user.user_service.dto.UserDto;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name= "user")
public class User {
@Id
@GeneratedValue(strategy= GenerationType.AUTO)
    private int userId;
    private String department;
    private String skill;

  //  List<Contact> contacts = new ArrayList<Contact>();



    public void updateUser(UserDto userDto){
        this.department = userDto.getDepartment();
        this.skill = userDto.getSkill();
    }
    public User(UserDto userDto) {
    this.updateUser(userDto);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public User() {
    }

    //    public List<Contact> getContacts() {
//        return contacts;
//    }
//
//    public void setContacts(List<Contact> contacts) {
//        this.contacts = contacts;
//    }
}
