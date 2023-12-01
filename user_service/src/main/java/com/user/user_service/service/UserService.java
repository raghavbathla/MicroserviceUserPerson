package com.user.user_service.service;

import com.user.user_service.dto.PersonDto;
import com.user.user_service.dto.UserDto;
import com.user.user_service.entity.User;

import java.util.List;

public interface UserService {

    List<User> getPerson();

    PersonDto getPersonById(int id);
    User addPerson(UserDto userDto);

    User getById(int id);

    void deleteById(int id);
    User updateById(int id,UserDto userDto);

}
