package collectionQuestions20;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentQ8
{
	int sid;
	String sName;
	List <String> hobbies;
	
	public StudentQ8() {}

	public StudentQ8 (int sid, String sName, List<String> hobbies)
	{
		this.sid = sid;
		this.sName = sName;
		this.hobbies = hobbies;
	}
	
	public static void main(String[] args) 
	{
		
		
		StudentQ8 st [];
		HashMap <String, List<StudentQ8>> hm = new HashMap<String, List<StudentQ8>>();
		
		Set s = hm.entrySet();
		
//		for(Map.Entry<String, List<StudentQ8>> e : hm.entrySet())
//		{
//			if()
//		}
//				
//		
//		for(int i=0; i<hm.size() ; i++)
//		{
//			hm.g
//		}
		System.out.println(s);

	}

}
