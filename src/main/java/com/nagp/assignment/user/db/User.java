package com.nagp.assignment.user.db;

import com.nagp.assignment.user.api.UserDto;

public class User {

    private int id;

    private String firstName;

    private String lastName;

    private int age;

    private String gender;

    private String email;

    private String phoneNumber;

    private String address;

    public User() {
    }

    public User(final int id,
                final String firstName,
                final String lastName,
                final int age,
                final String gender,
                final String email,
                final String phoneNumber,
                final String address) {
        this(firstName, lastName, age, gender, email, phoneNumber, address);
        this.id = id;
    }

    public User(final String firstName,
                final String lastName,
                final int age,
                final String gender,
                final String email,
                final String phoneNumber,
                final String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(final String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }


}
