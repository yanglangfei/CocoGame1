package com.ylf.jucaipen.cocogame1.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2015/12/17.
 */
public class Person implements Serializable {

   private  String name;
    private  String logoPath;

    public Person(String name, String logoPath) {
        this.name = name;
        this.logoPath = logoPath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }
}
