import java.io.Closeable;
import java.io.IOException;
import java.io.File;

abstract class Menu_switch {
	
	protected String about;
    public abstract Menu_switch giveCase();
    protected void Save(String file) throws IOException	{// To trzeba skoñczyæ
    	File f = null;
		f = new File(file);
		f.delete();
    }
    public void Close(Closeable closeable)	{
		try {
			closeable.close();
		}
		catch(IOException ignored){
		}
    	
    }
}
