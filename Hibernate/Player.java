package Hibernate;

public class  Player{
    
private int id;  
private String firstname;
private String lastname;
private String username;
private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfn() {
        return firstname;
    }

    public void setfn(String fn) {
        this.firstname = fn;
    }

    public String getln() {
        return firstname;
    }

    public void setln(String ln) {
        this.firstname = ln;
    }

    public String getun() {
        return username;
    }

    public void setun(String un) {
        this.username = un;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



}