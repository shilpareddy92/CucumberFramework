package seleniumTests;

public class opentextQuestion3 {
	
	static String str = "This is for the add that we have seen in amazon.The category:"
			+ "apparel and the slightly more demand category:makeup along with category:"
			+ "furniture and the list goes to category:"
			+ "mobiles";
	
	public static void main(String[] args) {
		String[] splitted=  str.split("category:");
		
		for(int i=1;i<splitted.length;i++) {
			//System.out.println(splitted[i]);
			String[] targetted = splitted[i].split(" ");
			for(int j=0;j<targetted.length;j++) {
				System.out.println(targetted[0]);
				break;;
			}
		}
	}

}
