/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Timestamp;

/**
 *
 * @author Administrator
 */
public class Customer {
    private int id;
private String first_name;
private String last_name;
private Timestamp dob;
private Timestamp doj;
private String address;
private String mobile;
private String tel;
private String membership;
private int weight;
private int height;
private String marketingChannel;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Timestamp getDob() {
        return dob;
    }

    public void setDob(Timestamp dob) {
        this.dob = dob;
    }

    public Timestamp getDoj() {
        return doj;
    }

    public void setDoj(Timestamp doj) {
        this.doj = doj;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



public String validate()
{
    if(first_name==null||first_name.equals(""))
    return "first name cannot be blank";
    
    return null;
    
}

    
}
