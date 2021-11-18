package seleniumTests;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class interview {

	public static void main(String args[]) {

		String s = "aaabbcccd";
		char[] charraraay = s.toCharArray();
		Map<Character, Integer> stringmap = new HashMap<>();
		for (Character c : charraraay)
			if (stringmap.get(c) == null) {
				stringmap.put(c, 1);
			} else {
				stringmap.put(c, stringmap.get(c) + 1);
			}

		Set<Entry<Character, Integer>> entry = stringmap.entrySet();
		for (Entry<Character, Integer> e : entry) {
			System.out.println(e.getKey() + " and value is " + e.getValue());
		}

	}

}
