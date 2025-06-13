package com.itheima.domain;
import java.util.Date;
public class Milepost {
    private int id;
    private String name;
    private Date launchtime;
    private String depict;
    private int state;
    public Milepost(int id , String name , Date launchtime , String depict, int state){
        this.id = id;
        this.name = name;
        this.launchtime = launchtime;
        this.depict = depict;
        this.state = state;
    }

    public Milepost() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLaunchtime() {
        return launchtime;
    }

    public void setLaunchtime(Date launchtime) {
        this.launchtime = launchtime;
    }

    public String getDepict() {
        return depict;
    }

    public void setDepict(String depict) {
        this.depict = depict;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Milepost{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", launchitme=" + launchitme +
                ", depict='" + depict + '\'' +
                ", state=" + state +
                '}';
    }
}
