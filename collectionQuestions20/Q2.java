package collectionQuestions20;
import java.util.*;
public class Q2 
{
	public static void main(String[] args) 
	{
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
		List <String> l = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter the elements: ");
//		while(sc.hasNext())
//		{
//			l.add(sc.next());
//		}
		//l.add(sc.next());
		
		l.add("abc");
		l.add("def");
		l.add("ghi");
		l.add("lmn");
		l.add("xyz");
		
		lhm.put("abc", 1);
		lhm.put("def", 2);
		lhm.put("ghi", 3);
		lhm.put("lmn", 4);
		lhm.put("xyz", 5);
		
//		for(int i=0; i<l.size(); i++)
//		{
//			for(int j=0; j<l.size(); j++)
//			{
//				if(l.get(i).equals(lhm.get(j)))
//				{
//					System.out.println("true");
//				}else 
//					System.out.println("false");
//			}	
//		}
		
		
		int count = 0;
		for(String s : l)
		{
			for(Map.Entry<String, Integer> s1 : lhm.entrySet())
			{
				if(s.contentEquals(s1.getKey()))
				{
					count++;
					//System.out.println("true");
				}
			}
		}
		
		
		if(count>1)
		{
			System.out.println("true");
		}else
			System.out.println("false");

	}

}

