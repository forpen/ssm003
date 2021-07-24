package com.jjz.pojo;

import java.io.Serializable;

/**
 * (Myuser)实体类
 *
 * @author makejava
 * @since 2021-07-24 16:01:16
 */
public class MyUser implements Serializable {
    private static final long serialVersionUID = 175760839704883288L;

    private Integer uid;

    private String uname;

    private String usex;


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

}
