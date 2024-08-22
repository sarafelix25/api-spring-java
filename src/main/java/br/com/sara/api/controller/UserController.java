package br.com.sara.api.controller;

import br.com.sara.api.dto.UserDto;
import br.com.sara.api.entity.User;
import br.com.sara.api.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/user")
public class UserController {

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private UserService service;

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> findById(@PathVariable Integer id) {
        return ResponseEntity.ok().body(mapper.map(service.findById(id), UserDto.class));
    }
}
