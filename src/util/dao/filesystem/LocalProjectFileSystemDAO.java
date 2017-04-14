package util.dao.filesystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import structure.linkedlist.node.StringListNode;

public abstract class LocalProjectFileSystemDAO {

	
	public static StringListNode[] getArray(Integer num, String filepath){
		
		StringListNode[] array = new StringListNode[num];
		
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
						array[i] = new StringListNode(line);
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
