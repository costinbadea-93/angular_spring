package com.example.domain;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

/**
 * Created by gatomulesei on 12/14/2016.
 */

@Entity
public class Breach extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public enum Type{
        GAMBLED,
        ENTERED;
    }

}