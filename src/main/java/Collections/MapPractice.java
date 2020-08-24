package AssignmentForFun.src.main.java.Collections;

import java.util.*;
import java.util.Map.Entry;

public class MapPractice {

    public Object findValueOf(Map map, Object key) {
        return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {
    	
    	ArrayList<Object> objArr = new ArrayList<Object>();
    	Iterator it = map.entrySet().iterator();
    	while (it.hasNext()) {
			Map.Entry<Object,Object> m= (Entry<Object, Object>) it.next();
			if(m.getValue().equals(value)) {
				objArr.add(m.getKey());
			}
    	}
    	Object[] res = new Object[objArr.size()];
    	int index = 0;
    	for(Object obj: objArr) {
    		res[index] = obj;
    		index++;
    	}
    	
//    	for (Object key : map.keySet()) { 
//    		  System.out.println("Key = " + key); 
//    		} 
//    	for (Object val : map.values()) { 
//    		 if(val.equals(value)) {
//    			 
//    		 }
//    		}
        return res;
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
    	HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
    	
    	if(size==0) {
    		return hmap;
    	}
    	hmap.put(1, 1);
    	if(size==1) {
    		
    		return hmap;
    	}
    	hmap.put(2, 1);
    	if(size == 2) {
    		return hmap;
    	}
    	if(size>2) {
    		for(int i=3;i<size+1;i++) {
        		hmap.put(i, hmap.get(i-1)+hmap.get(i-2));
        	}
    	}
        return hmap;
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
    	HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
    	if(size==0) {
    		return hmap;
    	}
    	hmap.put(1, first);
    	if(size==1) {
    		return hmap;
    	}
    	hmap.put(2, second);
    	if(size == 2) {
    		return hmap;
    	}
    	if(size>2) {
    		for(int i=3;i<size+1;i++) {
        		hmap.put(i, hmap.get(i-1)+hmap.get(i-2));
        	}
    	}
        return hmap;
    }
    
	/*
	 * public static void main(String[] args) { MapPractice mp =new MapPractice();
	 * mp.fibonacciTree(10); }
	 */
}
