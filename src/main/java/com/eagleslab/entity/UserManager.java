package com.eagleslab.entity;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.stereotype.Component;

@Component
public class UserManager {
    private String uname;
    private int uage;
    private String usex;
    private String province;
    private String email;

    @Override
    public String toString() {
        return "UserManager{" +
                "uname='" + uname + '\'' +
                ", uage=" + uage +
                ", usex='" + usex + '\'' +
                ", province='" + province + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getUage() {
        return uage;
    }

    public void setUage(int uage) {
        this.uage = uage;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
