package AssignmentForFun.src.main.java.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
    	ArrayList<Integer> res = (ArrayList<Integer>) list1.clone();
    	for(int i:list2) {
    		res.add(i);
    	}
        return res;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
    	int sum =0;
    	for(int i: list1) {
    		sum += i;
    	}
    	for(int i: list2) {
    		sum += i;
    	}
        return sum;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
    	ArrayList<Integer> res = (ArrayList<Integer>) original.clone();
    	
    	// find this function .removeAll() on Google
    	res.removeAll(Collections.singleton(toRemove));
//    	for(int i : original) {
//    		if(i == toRemove) {
//    			res.remove(i);
//    		}else {
//				continue;
//			}
//    	}
        return res;
    }

    public boolean happyList(ArrayList<String> original) {
    	// flag : how many compare we need, if compare is happy we -1, otherwise continue.
    	// finally if happy flag==0
    	if(original.size()==0) {
    		return true;
    	}
    	int flag = original.size()-1;
    	
    	for (int i = 0; i < original.size(); i++) {
    		if(i<original.size()-1) {
    			String tempStr = original.get(i);
    			String tempStrNext = original.get(i+1);
    			
    			// only compare with next string, cause we compare with former one before
    			for(int j = 0;j<tempStr.length();j++) {
    				if(tempStrNext.indexOf(tempStr.charAt(j))!= -1) {
    					// thereFore it is happy with next
    					flag--;
    					break;
    				};
    			}
    		}else if(i== original.size()-1){
				continue;
			}
			
		}
    	
        return flag==0? true: false;
    }
}
