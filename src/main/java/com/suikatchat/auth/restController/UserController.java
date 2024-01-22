package com.suikatchat.auth.restController;

import com.suikatchat.auth.dao.document.User;
import com.suikatchat.auth.model.dto.GetUserDTO;
import com.suikatchat.auth.model.dto.PostUserLoginDTO;
import com.suikatchat.auth.model.mapper.GetUserMapper;
import com.suikatchat.auth.model.mapper.PostUserLoginMapper;
import com.suikatchat.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("users")
    public ResponseEntity<List<GetUserDTO>> getUsers() {
        List<User> users = userService.getUsers();
        List<GetUserDTO> userDTOS = new ArrayList<>();
        for (User user : users) {
            userDTOS.add(GetUserMapper.documentToDto(user));
        }
        return ResponseEntity.ok(userDTOS);
    }

    @PostMapping("users/login")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity addUser(@RequestBody PostUserLoginDTO userDTO) {
        User user = PostUserLoginMapper.DtoToDocument(userDTO);
        userService.createUser(user);
        return ResponseEntity.ok(user);
    }
}
