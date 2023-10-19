import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Donations {
    int numIndividual, numBusiness, numOther;
    double amtIndividual, amtBusiness, amtOther;
	
	public void processdonations(String cat, double amt){
		 if (cat.equals("<individual donation")) {
	            if (amt >= 0) {
	                numIndividual++;
	                amtIndividual += amt;
	            } else {
	                numIndividual--;
	                amtIndividual -= amt;
	            }
	            System.out.println(cat + " donation amount: " + amt);
	            
	        } else if (cat.equals("<business donation")) {
	            if (amt >= 0) {
	                numBusiness++;
	                amtBusiness += amt;
	            } else {
	                numBusiness--;
	                amtBusiness -= amt;
	            }
	            System.out.println(cat + " donation amount: " + amt);
	        } else {
	            if (amt >= 0) {
	                numOther++;
	                amtOther += amt;
	            } else {
	                numOther--;
	                amtOther -= amt;
	            }
	            System.out.println(cat + " donation amount: " + amt);
	        }
	    }

	    public void getStats() {
	        System.out.println("Number of donations for Individual:" + numIndividual);
	        System.out.println("Total donations for Individual: $" + amtIndividual);
	        System.out.println("Number of donations for Business:" +numBusiness);
	        System.out.println("Total donations for Business: $" + amtBusiness);
	        System.out.println("Number of donations for Other:" + numOther);
	        System.out.println("Total donations for Other: $" + amtOther);
	    }
	}