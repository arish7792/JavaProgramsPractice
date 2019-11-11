package practiceTest;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		    	int N =2;
		        int stones1[] = {1,2,3,0,2};
		        
		        List<Integer> list = new ArrayList<Integer>();
		        for(int i=0; i<stones1.length; i++){
		            list.add(i,stones1[i]);
		        }
		        
		        System.out.println("list is "+list);
		        
		        int result =0;
		        
		        
		        while(list.size()>=N){
		        int min = Integer.MAX_VALUE;
		        int index = 0;
		        for(int i=0; i<list.size()-N+1; i++){
		            int temp_total = 0;
		            for(int j=i; j<i+N; j++){
		                temp_total = temp_total+ list.get(j);
		            }
		            if(temp_total<min){
		                min = temp_total;
		                index = i;
		            }
		        }
		        
		        int x = N;
		        while(x>0){
		            System.out.println("removing "+list.get(index) +" at "+index);
		            list.remove(list.get(index));
		            x--;
		        }
		            System.out.println(list); 
		        //System.out.println(index);
		        System.out.println("Adding "+min+" at "+index);
		        list.add(index,min);
		        result = result+min;
		         System.out.println(list);   
		            
		        }  
		        
		        int final_result = -1;
		        
		        if(list.size()==1){
		            final_result = result;
		        }
		        
		        System.out.println(final_result);
		    }
		

	}


