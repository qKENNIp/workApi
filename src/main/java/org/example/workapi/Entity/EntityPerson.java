package org.example.workapi.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@Getter
@Setter
@Entity
@Table(name = "test_Table")
public class EntityPerson implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String surnem;
    private String mail;
    private String numb;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date = new Date();
    private boolean answer;

    protected EntityPerson() {}

    public EntityPerson(String name, String surnem, String mail, String numb) {
        this.name = name;
        this.surnem = surnem;
        this.mail = mail;
        this.numb = numb;
    }

    public EntityPerson(Integer id , String name, String surnem, String mail, String numb) {
        this.id = id;
        this.name = name;
        this.surnem = surnem;
        this.mail = mail;
        this.numb = numb;
    }

    //    Getters Setter
    public String getDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return formatter.format(date);
    }

}