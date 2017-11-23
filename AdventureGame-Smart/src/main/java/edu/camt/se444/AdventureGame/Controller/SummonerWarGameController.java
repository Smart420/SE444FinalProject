package edu.camt.se444.AdventureGame.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.camt.se444.AdventureGame.model.SwUser;

import edu.camt.se444.AdventureGame.services.SwUserService;


@RestController
public class SummonerWarGameController {
	
	@Autowired
	SwUserService swuserService;
	
	public void setUsers(SwUserService swuserService){
		this.swuserService = swuserService;
	}
	@RequestMapping("/User")
	public ArrayList<SwUser> getAllUser(){
		return swuserService.getAllUser();
	}
	@RequestMapping("/User/name")
	public SwUser getUser(@PathVariable String x){
		return swuserService.getUser(x);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/User")
	public void addUser(@RequestBody SwUser t){
		swuserService.addUser(t);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/User/{id}")
	public void updateUser(@PathVariable String name , @RequestBody SwUser User){
		swuserService.updateUser(name, User);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/User/{name}")
	public void deleteUser(@PathVariable String name ){
		swuserService.deleteUser(name);
	}
	
	

}
