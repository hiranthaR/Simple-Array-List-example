/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.array.list.example;

/**
 *
 * @author Hirantha
 */
public class User {
    
    int id;
    String username,address,phone_number;
    
    //alt+insert  -> constructer + getters and setters

    public User(int id, String username, String address, String phone_number) {
        this.id = id;
        this.username = username;
        this.address = address;
        this.phone_number = phone_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
