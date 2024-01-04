package com.spring.demo.dto;

/**
 * @created: 04/01/2024 - 8:45 PM
 * @author: dungna
 */
public class UserDto {
    private String name;
    private String address;
    private Long age;

    public UserDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
