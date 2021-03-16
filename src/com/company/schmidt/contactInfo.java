package com.company.schmidt;


public class contactInfo {
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public contactInfo(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContactInfo" + "\nname=" + name + '\n' + "email=" + email + '\n';
    }

}
