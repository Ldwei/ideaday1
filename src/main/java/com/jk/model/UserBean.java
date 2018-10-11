package com.jk.model;

import java.io.Serializable;

public class UserBean extends Page implements Serializable {

    private static final long serialVersionUID = 13974673595083302L;

    private Integer id;

    private String  name;

    private Integer sex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
