package practiceTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class debrajWalmart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c_nodes = 5;
		int c_edges = 4;
		int c_from[] = {1,2,1,4};
		int c_to[] = {2,3,3,5};
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> temp_list1 = new ArrayList<Integer>();
		temp_list1.add(c_from[0]);
		temp_list1.add(c_to[0]);
		list.add(temp_list1);
		System.out.println(list);
		Set<Integer> set = new HashSet<Integer>();
		set.add(c_from[0]);
		set.add(c_to[0]);
		ArrayList<Integer> final_list1 = new ArrayList<Integer>();
		
		int xx = Math.max(c_from[0], c_to[0]);
		int yy = xx+1;
		while(yy<=c_nodes) {
			xx=xx+yy;
			yy=yy+1;
		}
		final_list1.add(xx);
		
		
		
		for(int i=1;i<c_edges ; i++) {
			ArrayList<Integer> temp_list = new ArrayList<Integer>();
			temp_list.add(c_from[i]);
			temp_list.add(c_to[i]);
			//System.out.println(temp_list);
			int flag =0;

				for(int j=0; j<list.size(); j++) {
					for(int x=0 ;x<list.get(j).size(); x++) {
						if(list.get(j).get(x)==temp_list.get(0)) {
							if(!list.get(j).contains(temp_list.get(1))) {
								list.get(j).add(temp_list.get(1));
								set.add(temp_list.get(1));
								flag =1;
							}
						}
						if(list.get(j).get(x)==temp_list.get(1)) {
							if(!list.get(j).contains(temp_list.get(0))) {
								list.get(j).add(temp_list.get(0));
								set.add(temp_list.get(0));
								flag=1;
							}
						}
					}
				}
				
				if(flag==0) {
					if(set.contains(temp_list.get(0)) && !set.contains(temp_list.get(1))) {
						set.add(temp_list.get(1));
						temp_list.remove(0);
					}
					if(set.contains(temp_list.get(1)) && !set.contains(temp_list.get(0))) {
						set.add(temp_list.get(0));
						temp_list.remove(1);
						
					}
					if(temp_list.size()>=2) {
						if(set.contains(temp_list.get(1)) && set.contains(temp_list.get(0))) {
							set.add(temp_list.get(1));
							set.add(temp_list.get(0));
							temp_list.remove(0);							
							temp_list.remove(0);
							
						}
					}				 
					list.add(temp_list);
						
					}
				
				

				System.out.println(list);
				
				
				}				
			
		System.out.println(final_list1);
		}
		
		
		}
		

	


