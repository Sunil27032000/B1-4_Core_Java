package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Example20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map =new HashMap<Integer,String>();
		map.put(100, "Sunil");
		map.put(99, "sandeep");
		map.put(98, "Rocky");
		map.put(97, "anil");
		map.put(96, "Babu");
		System.out.println(map);
		map.remove('b');
		for(Entry<Integer, String> Entry:map.entrySet())
		{
			System.out.println(((java.util.Map.Entry<Integer, String>) map).getKey()+" "+((java.util.Map.Entry<Integer, String>) map).getValue());
		}
	}

}
