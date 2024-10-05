package com.dasrado.school.java.uf5.project.mvc.model;

public enum Type {
    array_list("ArrayList"), treeset("TreeSet");

    private String type;

    Type(String type){
        this.type = type;
    }

    private String getType(){
        return type;
    }
}
