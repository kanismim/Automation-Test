package Task;


public class Profile {
	int gender; 
	String firstName; 
	String lastName; 
	String password;
	String email;
	int days; 
	int months;
	int years;
	String company;
	String address1;
	String address2;
	String city;
	int state;
	String postcode;	
	String mobile;
	
	public Profile(int gender, 
	String firstName, 
	String lastName, 
	String password, 
	int days, 
	int months,
	int years,
	String company,
	String address1,
	String address2,
	String city,
	int state,
	String postcode,	
	String mobile) {
		
		this.gender= gender; 
		this.firstName =firstName; 
		this.lastName =lastName; 
		this.password= password; 
		this.days= days; 
		this.months= months;
		this.years= years;
		this.company= company;
		this.address1= address1;
		this.address2 =address2;
		this.city= city;
		this.state =state;
		this.postcode= postcode;	
		this.mobile= mobile;
		
	}
}
