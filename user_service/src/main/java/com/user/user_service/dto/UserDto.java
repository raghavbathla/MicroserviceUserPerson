package com.user.user_service.dto;

public class UserDto {

    private String department;
    private String skill;


    public UserDto(String department, String skill) {
        this.department = department;
        this.skill = skill;
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
}
