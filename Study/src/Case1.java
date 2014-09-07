import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Case1 extends Menu_switch {
	public Case1()
    {
    about = "What you want to delete: \n  ";
    }
	public static void Edit(){
		FileReader pl=null;
		String what;
		String sCurrentLine="";
		Scanner scan = new Scanner(System.in);
		what = scan.nextLine();
		try{
		pl = new FileReader("src/pliczek");
	} catch (FileNotFoundException e) {
	       System.out.println("B£¥D PRZY OTWIERANIU PLIKU!");
	       System.exit(1);
	   }
		BufferedReader bfr = new BufferedReader(pl);
		try{
			while((sCurrentLine = bfr.readLine()) != null){
				//sCurrentLine = bfr.readLine();
				System.out.println(sCurrentLine);
				sCurrentLine = sCurrentLine.replaceAll(what, "");
				writer.save_me(sCurrentLine);

				//System.out.println(sCurrentLine);
			}
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
        try {
			Save("src/pliczek");
		} catch (IOException e) {
			e.printStackTrace();
		}
        //Close(Edit().bfr); To trzeba ogarn¹æ bo coœ nie bangla
        return this;
    }

}
