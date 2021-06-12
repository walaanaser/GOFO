import java.util.*;

public class Admin extends User  {
	
	
	Admin(){
        		
    }
	Admin(int id ,String name,String userPassward ,String userEmail,String Location ,String phoneNumber,String type){
        super( id , name, userPassward , userEmail, Location , phoneNumber,type);        
    }
	
	public boolean createPlayground(String name, String location, int size,int avalibleHour,int price,int cancelationPeriod,boolean book) {
		for(int i=0;i<playgrounds.size();i++) {
			if(name == playgrounds.get(i).name){
				return false;
			}
		}
		Playground pg = new  Playground( name,  location,  size, avalibleHour, price, cancelationPeriod,book );
		playgrounds.add(pg);
		return true;
	}
	public void deletePlayground() {
		
	}

}
