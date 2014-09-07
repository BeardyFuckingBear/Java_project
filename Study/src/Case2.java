import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Case2 extends Menu_switch {
	public Case2()
    {
    about = "Removing whitespaces: \n  ";
    }
	public void Edit(){
		FileReader pl=null;
		//String what;
		String sCurrentLine="";
		//Scanner scan = new Scanner(System.in);
		//what = scan.nextLine();
		try{
		pl = new FileReader("src/pliczek");
	} catch (FileNotFoundException e) {
	       System.out.println("B£¥D PRZY OTWIERANIU PLIKU!");
	       System.exit(1);
	   }
		BufferedReader bfr = new BufferedReader(pl);
		try{
			sCurrentLine = bfr.readLine();
			System.out.println(sCurrentLine);
			sCurrentLine = sCurrentLine.replaceAll(" ", "");
			writer.save_me(sCurrentLine);
			} catch (IOException e){
			e.printStackTrace();
		} finally {
			try {
                if (bfr != null)bfr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
		}
	}
    public Menu_switch  giveCase()
    {   
        System.out.println(about);
        Edit();
     //   Save();
       // Close();
        return this;
    }

}
