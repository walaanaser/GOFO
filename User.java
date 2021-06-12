import java.util.*;

public class User {
    int userId;
	String name;
	String userPassward;
	String userEmail;
	String location ;
	String phoneNumber;
	String type;
	
	//public  static ArrayList<Player> players  = new ArrayList<>();
	//public  static ArrayList<PlaygroundOwner> owners  = new ArrayList<>();
	public static List<Playground> playgrounds  = new ArrayList<Playground>();
	
	User(){
		
	}
	User(int id ,String name,String userPassward ,String userEmail,String Location ,String phoneNumber,String type){
		this.userId = id;
		this.name = name;
		this.userPassward = userPassward;
		this.userEmail = userEmail;
		this.location = Location;
		this.phoneNumber = phoneNumber;	
		this.type=type;
	}
	
	//public void signUp(int id ,String name,String userPassward ,String userEmail,String Location ,String phoneNumber) { }
	 public boolean signUp(String userEmail ,ArrayList<User> u) {
		 for(int i=0;i<u.size();i++) {
			 if(userEmail == u.get(i).userEmail) {
				 return false;
			 }
		 }
		 return true;	
	}
    public  boolean login(String userEmail ,String userPassward,ArrayList<User> u) {    	
    	 for(int i=0;i<u.size();i++) {
			 if(userEmail == u.get(i).userEmail && userPassward == u.get(i).userPassward) {
				 return true;
			 }
		 }
		 return false;
	}
    public void Displayplaygrounds() {
    	for(int i=0;i<playgrounds.size();i++) {
    		System.out.print("Name:    "+playgrounds.get(i).name +"   price: "+playgrounds.get(i).price );
    		if(playgrounds.get(i).book) {
    			System.out.print(","+"  Booked  " );
    		}
    		else {
    			System.out.print(","+"  Still Free  " );
    		}
    		System.out.println();
    	}
    	
		
   	}
	
}
