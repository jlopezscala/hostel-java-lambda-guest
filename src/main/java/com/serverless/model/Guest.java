package com.serverless.model;


import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "guest")
public class Guest {

    @DynamoDBHashKey(attributeName="dni")
    private String dni;

    @DynamoDBAttribute(attributeName="lastname")
    private String lastname;

    @DynamoDBAttribute(attributeName="name")
    private String name;

    @DynamoDBAttribute(attributeName="city")
    private String city;

    @DynamoDBAttribute(attributeName="country")
    private String country;

    @DynamoDBAttribute(attributeName="phone")
    private long phone;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}
