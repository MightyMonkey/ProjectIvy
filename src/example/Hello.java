
package example;

import org.apache.commons.lang.WordUtils;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class Hello {
    public static void main(String[] args) throws IOException {
        String  message = "hello ivy !";
        System.out.println("standard message : " + message);
        System.out.println("capitalized by " + WordUtils.class.getName() 
                                + " : " + WordUtils.capitalizeFully(message));
	int monmax=0;
	int i,nb,j;
	CSVReader reader;
	try {
		reader = new CSVReader(new FileReader("data.csv"),',');
	

	 	List<String[]> myEntries= reader.readAll();

		for(i=0;i<myEntries.size();i++){
			for(j=0;j<myEntries.get(i).length;j++){
				nb=Integer.parseInt(myEntries.get(i)[j]);
				System.out.println("Nombre lu: "+nb);
				if(nb>monmax){
					monmax=nb;
				}
			}
		}
		System.out.println("Nombre max lu: "+monmax);
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
}
        
