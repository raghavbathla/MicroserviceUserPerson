package com.user.user_service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonDto {

    public PersonDto(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }


    //@JsonProperty("name")
    private String name;

  // @JsonProperty("email")
    private String email;

    //@JsonProperty("Person_Id")
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PersonDto() {
    }
}
