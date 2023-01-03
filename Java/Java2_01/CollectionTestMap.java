package Java2_01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CollectionTestMap {

		static void hashmap_test() {
			HashMap<String, Integer> map = new HashMap<>();
			map.put("GET커피", 1800);
			map.put("도리토스", 1500);
			map.put("포켓몬빵", 1000);
			map.put("하리보젤리", 1500);
			
			//value를 가져올 때
			Collection<Integer> co = map.values();
			for (Integer integer : co) {
				System.out.println(co);
			}
			
			//key와 value를 모두 가져올 때
			Set<String> keys = map.keySet();
			Iterator<String> iter = keys.iterator();			
			while (iter.hasNext()) {
				String key = iter.next();
				System.out.println(key);
				System.out.println(map.get(key));
			}
			
			if (map.containsKey("하리보젤리")) {
			int result = map.get("하리보젤리");
			System.out.println(result);
			}
						
		}		
		
		
	public static void main(String[] args) {
		hashmap_test();

	}

}
