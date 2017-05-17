package java.persistence;
import java.business.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class NfsgDao {
	private final String dbpath = "../data/";
	
	public List<Nfsg> getNfsg (String cpf) throws Exception {
		List<Nfsg> list = new ArrayList<>();
		
		try{
			File file = new File(dbpath + cpf + "-nf.csv");
			BufferedReader reader = null;
			
			if(!file.exists()) { 
			    throw new Exception();
			}
			
			try{
				reader = new BufferedReader(new FileReader(file));
			    String text = null;
	
			    while ((text = reader.readLine()) != null) {
			    	System.out.println(text);
			    }
		    } catch (Exception ex){
				
			} finally{
				if (reader != null) {
		            reader.close();
		        }
			}
			
		} catch (Exception ex){
			
		}
		
		
		
		return list;
	}
}
