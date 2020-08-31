package AssignmentForFun.src.main.java.DansDilemma;

import java.util.ArrayList;
import java.util.HashSet;

public class DansDilemma {
	int d2 ;
	int d3 ;
	int dn ;

    public Integer dilemmaOfTwo(Double input1, Double input2) {
    	double sum = (input1+input2);
    	double product = (input1*input2);
    	
    	double sub1 = (input1-input2);
    	double sub2 = (input2-input1);
    	
    	double quotients1=(input2/input1);
    	double quotients2=(input1/input2);
    	
    	HashSet<Double> hset = new HashSet<Double>();
    	hset.add(sum);
    	hset.add(product);
    	hset.add(sub1);
    	hset.add(sub2);
    	if(input1!=0) {hset.add(quotients1);}
    	if(input2!=0) hset.add(quotients2);
    	
    	
        return hset.size();
    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
    	ArrayList<Double> arr = new ArrayList<Double>();
    	arr.add(input1);
    	arr.add(input2);
    	arr.add(input3);
    	HashSet<Double> hset = new HashSet<Double>();
    
    	for(int i =0; i<arr.size();i++) {
    		
    		
    		// count index from last to i+1
    		for(int j=arr.size()-1;j>i;j--) {
    			// sum
    			hset.add(arr.get(i)+arr.get(j));
    			// sub / differences
    			hset.add(arr.get(i)-arr.get(j));
    			
    			hset.add(arr.get(j)-arr.get(i));
    			
    			// products
    			hset.add(arr.get(i)*arr.get(j));
    			
    			// divided / quotients : careAbout /0
    			if(arr.get(i)!=0) {hset.add(arr.get(j)/arr.get(i));}
    			if(arr.get(j)!=0) {hset.add(arr.get(i)/arr.get(j));}
    			
    			

    		}
    	}
    	
        return hset.size();
    }

    public Integer dilemmaOfN(Double... args){
    	HashSet<Double> hset = new HashSet<Double>();
    
    	for(int i =0; i<args.length;i++) {    		
    		// count index from last to i+1
    		for(int j=args.length-1;j>i;j--) {
    			// sum
    			hset.add(args[i]+args[j]);
    			// sub / differences
    			hset.add(args[i]-args[j]);
    			
    			hset.add(args[j]-args[i]);
    			
    			// products
    			hset.add(args[i]*args[j]);
    			
    			// divided / quotients 
    			if(args[i]!=0) {
    				hset.add(args[j]/args[i]);
    			}
    			if(args[j]!=0) {
    				hset.add(args[i]/args[j]);
    			}
    		}
    	}

        return hset.size();
    }
    
//    public static void main(String[] args) {
//		DansDilemma dd = new DansDilemma();
//		
//		
//		System.out.println(dd.dilemmaOfTwo(0d, 0d));
//		
//	}
}
