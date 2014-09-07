
import java.util.Scanner;
//import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Menu
{
    public static void main(String[] args)
    {
  
    	 menu_body.giveMenu();
    	
    	Case_creator create = new Case_creator();
    	
    	Scanner scan = new Scanner(System.in);
    	int signal = scan.nextInt();
    	
    	if (signal==1)
    		create.CaseCreating("Case1");
    	else if (signal==2)
    		create.CaseCreating("Case2");
    	else
    		System.out.println("Bad option try again");
       

    }
}