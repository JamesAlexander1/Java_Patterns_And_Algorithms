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
			
			try {
				
				BufferedReader reader = new BufferedReader(new FileReader(file));
				String line;
				//StringBuilder builder = new StringBuilder();
				
				for(int i = 0; i < num; i ++){
					
					if((line = reader.readLine()) == null){
						break;
					}else{
						array[i] = new StringDto(line);
					}
				}
				
				
				
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			//throw exception
		}
	
		
		
		return array;
	}
}
