package com.nagp.assignment.user.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.nagp.assignment.user.db.User;

public class UserDto extends CreateUserDto {

    private int id;

    @JsonCreator
    public UserDto(@JsonProperty("id") final int id,
                   @JsonProperty("firstName") final String firstName,
                   @JsonProperty("lastName") final String lastName,
                   @JsonProperty("age") final int age,
                   @JsonProperty("gender") final String gender,
                   @JsonProperty("email") final String email,
                   @JsonProperty("phoneNumber") final String phoneNumber,
                   @JsonProperty("address") final String address) {
        super(firstName, lastName, age, gender, email, phoneNumber, address);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static UserDto fromUser(User user) {
        return new UserDto(user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getAge(),
                user.getGender(),
                user.getEmail(),
                user.getPhoneNumber(),
                user.getAddress());
    }
}
