package edu.camt.se444.AdventureGame.model;

public class User {
    private int id;
    private String name;
    private String user;
    private String password;
    private String email;
    
    
    public User (int id, String name , String user , String password , String email){
        super();
        this.id = id;
        this.name = name;
        this.user = user;
        this.password = password;
        this.email = email;
    }

    public User(){
        super();
        this.id = 0;
        this.name = "";
        this.user = "";
        this.password = "";
        this.email = "";
    }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getUser() { return user; }
    public void setUser(String user) { this.user = user; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
}
