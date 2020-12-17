package com.superarilo.arilo.entity;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User_Data
{
    @Id
    private String username;
    private String userpwd;
    private String usersex;
    private String useremail;
    private int userid;

    @Override
    public String toString() {
        return "User_Data{" +
                ", username='" + username + '\'' +
                ", userpwd='" + userpwd + '\'' +
                ", usersex='" + usersex + '\'' +
                ", useremail='" + useremail + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
}
