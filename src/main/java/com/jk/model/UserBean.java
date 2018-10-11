package com.jk.model;

import java.io.Serializable;
/**
 * 类描述：    
 * 创建人：LDW
 * 创建时间：2018/10/11 20:41  
 * 修改人：LDW
 * 修改时间：2018/10/11 20:41     
 * 修改备注：       
 * @version ：1.0    
 */
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
