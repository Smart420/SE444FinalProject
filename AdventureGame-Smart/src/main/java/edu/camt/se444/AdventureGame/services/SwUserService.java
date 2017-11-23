package edu.camt.se444.AdventureGame.services;

import java.util.ArrayList;



import org.springframework.stereotype.Service;

import edu.camt.se444.AdventureGame.model.SwUser;


@Service
public class SwUserService {
	 ArrayList<SwUser> User = new ArrayList<SwUser>();

	    public SwUserService(){
	    	SwUser u1 = new SwUser(01,"Username01","pass789","name01",20);
	    	SwUser u2 = new SwUser(02,"Username02","pass123","name02",21);
	    	SwUser u3 = new SwUser(03,"Username03","pass456","name03",23);

	        User.add(u1);
	        User.add(u2);
	        User.add(u3);
	    }

	    public ArrayList<SwUser> getAllUser() {
	        return User;
	    }
	   
	    
	    public SwUser getUser(String name){
	        return (SwUser) User.stream().filter(t -> t.getName().equals(name)).findFirst().get();
	    }
	   
	    public void addUser(SwUser u){
	        this.User.add(u);
	    }
	    public void updateUser(String name,SwUser user){
	        int i = 0;
	        for (SwUser u: User){
	            if(u.getName().equals(name)){
	                User.set(i,user);
	            }
	            i++;
	        }
	    }
	    public void deleteUser(String name){
	        User.removeIf(t -> t.getName().equals(name));
	    }
	    
	}