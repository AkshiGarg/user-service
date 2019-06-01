package com.nagp.assignment.user.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.nagp.assignment.user.db.User;

public class CreateUserDto {

    private String firstName;

    private String lastName;

    private int age;

    private String gender;

    private String email;

    private String phoneNumber;

    private String address;

    @JsonCreator
    public CreateUserDto(@JsonProperty("firstName") final String firstName,
                   @JsonProperty("lastName") final String lastName,
                   @JsonProperty("age") final int age,
                   @JsonProperty("gender") final String gender,
                   @JsonProperty("email") final String email,
                   @JsonProperty("phoneNumber") final String phoneNumber,
                   @JsonProperty("address") final String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public static User toUser(CreateUserDto userDto) {
        return new User(userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getAge(),
                userDto.getGender(),
                userDto.getEmail(),
                userDto.getPhoneNumber(),
                userDto.getAddress());
    }
}
