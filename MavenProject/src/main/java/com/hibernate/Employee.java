package com.hibernate;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
class Employee{
    @Id
    private int eid;
    private String name;
    private int sal;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }

}