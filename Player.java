import java.util.*;

public class Player extends User {
	int eWallet;
	//public  static ArrayList<Player> players  = new ArrayList<>();
	
	Player() {
	}

	Player(int id, String name, String userPassward, String userEmail, String Location, String phoneNumber,String type) {
		super(id, name, userPassward, userEmail, Location, phoneNumber, type);

	}

	public void bookPlayground(String location , int hours) {
		
		for(int i=0;i<playgrounds.size();i++) {
			if(playgrounds.get(i).location == location && playgrounds.get(i).avalibleHour >= hours && playgrounds.get(i).book == false ) {
				System.out.println("Name: "+playgrounds.get(i).name+" Location:  " +playgrounds.get(i).location );
				System.out.println("------ booking sucess  --------- ");
				playgrounds.get(i).book = true;
			}
		}
	}

	public void canelBook() {

	}

	public void createFavTeam() {

	}

	public void displayPlayground() {

	}

	public void viewEwallet() {

	}

}
