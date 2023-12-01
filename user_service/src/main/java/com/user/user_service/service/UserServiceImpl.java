package com.user.user_service.service;

import com.user.user_service.dto.PersonDto;
import com.user.user_service.dto.ResponseDto;
import com.user.user_service.dto.UserDto;
import com.user.user_service.entity.User;
import com.user.user_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

   @Autowired
    private UserRepository userRepository;

   @Autowired
   private RestTemplate restTemplate;



    @Override
    public List<User> getPerson() {
        return userRepository.findAll();
    }

    @Override
    public User addPerson(UserDto personDto) {
        User personEntity = new User(personDto);

        return userRepository.save(personEntity);
    }

    @Override
    public User getById(int id) {
      //  List<PersonDto> personDtos = this.restTemplate.getForObject("localhost:8080/api/v1/person/"+id,List.class);
        return userRepository.findById(id).orElseThrow();
    }

    @Override
    public PersonDto getPersonById(int id) {
        ResponseEntity<ResponseDto> personDtos = this.restTemplate.getForEntity("http://localhost:8090/api/v1/person/"+id,ResponseDto.class);
        return (PersonDto) personDtos.getBody().getData();
    }

    @Override
    public void deleteById(int id) {
        User personEntity = this.getById(id);
        userRepository.delete(personEntity);
    }

    @Override
    public User updateById(int id, UserDto personDto) {
        User personEntity = this.getById(id);
        personEntity.updateUser(personDto);
//        personEntity.setEmail(personDto.getEmail());

        return userRepository.save(personEntity);
    }
}
