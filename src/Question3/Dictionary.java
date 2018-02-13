package Question3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Dictionary {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		boolean fileExist = doesFileExist("..\\General_Scripting\\Data\\testdata.txt");
		
			if(fileExist) {
				 File file = new File("..\\General_Scripting\\Data\\testdata.txt");
				 BufferedReader br = new BufferedReader(new FileReader(file));
				 String st;
				 
				  try {
					while ((st = br.readLine()) != null) {
					    String[] word = st.split("–");
					    System.out.println(word[0]);
					    
					    String[] meaning = word[1].split(",");
					    for (String means : meaning) {
					    	System.out.println(means.trim());
					    }
	
				  }} catch (IOException e) {
					e.printStackTrace();
				  }
			}
		}
	
	public static boolean doesFileExist(String path) {
		try {
		File f = new File(path); 
		  if(f.exists() && f.isFile()) {
			  return true;
		  }
		}catch(Exception e){
			 e.printStackTrace();
		}
		return false;
	}

}
