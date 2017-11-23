package edu.camt.se444.AdventureGame.model;

import java.util.ArrayList;

public class SwUser {
	int id ;
    String username;
    String password;
    String name;
    int age;
    
    
    
    public SwUser(int id , String username , String password ,String name,int age){
        super();
        this.id=id ;
        this.username=username;
        this.password=password;
        this.name=name;
        this.age=age;
    }
    public SwUser(){
        super();
        this.id=0 ;
        this.username="";
        this.password="";
        this.name="";
        this.age=0;
    }
    public void setId(int id){
    	this.id=id;
    }
    public int getId(){
    	return id;
    }
    public void setUsername(String username){
    	this.username=username;
    }
    public String getUsername(){
    	return username;
    }
    public void setPassword(String password){
    	this.password=password;
    }
    public String getPassword(){
    	return password;
    }
    public void setName(String name){
    	this.name=name;
    }
    public String getName(){
    	return name;
    }
    public void setAge(int age){
    	this.age=age;
    }
    public int getAge(){
    	return age;
    }
    

}
