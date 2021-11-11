package seleniumTests;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class opentextQuestion2 {
	static String given=  "austria Europe".replace(" ", "");

	public static void main(String[] args) {
		char[] givenchar =  	given.toCharArray();
		Map<Character,Integer> m=  new HashMap<>();
		for(char c :givenchar)
		{
			if(m.get(c) == null) {
				m.put(c, 1);
			}
			else {
				m.put(c, m.get(c)+1);
			}
		}
		Set<Entry<Character,Integer>>  entryset= m.entrySet();
		for(Entry<Character, Integer> entry :entryset)
		{
			
	            System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
	        
		}
		
		String inputStr ="austria Europe".replace(" ", "");

        for(char i :inputStr.toCharArray()){
        if ( inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
            System.out.println("First non-repeating character is: "+i);
            break;
        }
        }
		
		

	}

}
