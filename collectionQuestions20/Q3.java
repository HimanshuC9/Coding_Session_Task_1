package collectionQuestions20;
import java.util.*;
public class Q3 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(10);			//1 to lastnumber
		ll.add(2);
		ll.add(9);
		
		
		Collections.sort(ll);
		System.out.println(ll);  //[2,9,10]
		int n= ll.getLast();
		
		for(int i=ll.getFirst(); i< n ; i++)
		{	
			if(!ll.contains(i))
			{
				ll.add(i);
			}
				
			
//			if(i != ll.get(i))
//			{
//				System.out.println(i);
//				
//			}else;
		}System.out.println(ll);
	}

}
