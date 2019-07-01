//File Name : Person.java
//Its Executed in the main class (StorageFile.java)
//Original Code by: Kithinji A. Muriungi
//Reg. No. EC/09/14
//kamkith@gmail.com
//@kithinji_muriungi
//JAMII CHAMA SYSTEM 

class Person
{
	String name;
	String id;
        String gender;
        String account;
        String membership;
	
        
	public void setName(String name) {
		this.name = name;
	}
        public String getName() {
		return name;
	}
	
        public void setGender(String gender) {
		this.gender = gender;
	}
        public String getGender() {
		return gender;
	}
        
        public void setAccount(String account) {
		this.account = account;
	}
        public String getAccount() {
		return account;
	}
        
        
        public void setMembership(String membership) {
		this.membership = membership;
	}
        public String getMembership() {
		return membership;
	}
        
	public void setId(String id) {
		this.id = id;
	}
        
        public String getId() {
		return id;
        }
	public String msg()
	{
		return this.name+"      "+this.gender+"     "+this.id+"     "+this.account+"     "+this.membership;
	}
}
