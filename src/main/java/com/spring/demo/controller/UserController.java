package com.spring.demo.controller;

import com.spring.demo.dto.UserDto;
import com.spring.demo.entity.User;
import com.spring.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @created: 02/01/2024 - 10:10 PM
 * @author: dungna
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/get-all")
    public ResponseEntity<?> getUser() {
        List<User> list = userService.getAllUser();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteUser(@RequestParam String id) {
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/add-user")
    public ResponseEntity<?> addUser(@RequestBody UserDto userDto) {
        User entity = new User(); // đối tượng dùng để thao tác với cơ sở dữ liệu
        // Đối tượng userDto để làm việc với giao diện

        // Chuyển đổi từ Dto (Data Transfer Object) sang đối tượng entity
        entity.setName(userDto.getName());
        entity.setAge(userDto.getAge());
        entity.setAddress(userDto.getAddress());

        Long id; // data trả ra
        id = userService.addUser(entity);


        return new ResponseEntity<>(id, HttpStatus.OK);
    }


    @PutMapping("/edit-user")
    public ResponseEntity<?> editUser(@RequestParam String id, @RequestBody UserDto userDto) {
        User userEntity = userService.getUserById(id); // lấy đối tượng cần thay đổi trong database

        String nameChange = userDto.getName();
        System.out.println("name cần thay đổi là: " + nameChange);

        userEntity.setName(nameChange);
        Long result = userService.addUser(userEntity);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
