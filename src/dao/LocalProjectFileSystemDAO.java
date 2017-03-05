package dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import dto.StringDto;

public abstract class LocalProjectFileSystemDAO {

	
	public static StringDto[] getArray(Integer num, String filepath){
		
		StringDto[] array = new StringDto[num];
		
		File file = new File(filepath);
		
		if(file.exists()){
			
			BufferedReader reader = null;
			try {
				
				//initialize connection to file in local project directory
				reader = new BufferedReader(new FileReader(file));
				String line;
				
				
				//read line by line into array.
				
				for(int i = 0; i < num; i ++){
					
					if((line = reader.readLine()) == null){
						break;
					}else{
						array[i] = new StringDto(line);
					}
				}
				
				
				
			}catch (FileNotFoundException e) {
				
				e.printStackTrace();
			
				
			} catch (IOException e) {
				
				e.printStackTrace();
				
			}finally{
				
				//close file connection regardless of method returning exception or not.
				
				if(reader != null){
					
					
					try {
						reader.close();
					} catch (IOException e) {
						
						
						e.printStackTrace();
					}
				}
			}
			
			
		}else{
			//throw exception
		}
	
		
		
		return array;
	}
}
