package collectionQuestions20;
import java.util.*;
public class StudentQ6 
{
	int rollno;
	String name;
	int marks;
	
	public StudentQ6() {}

	public StudentQ6(int rollno, String name, int marks)
	{
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	
	public static void main(String[] args) 
	{
		StudentQ6 s1 = new StudentQ6 (1, "abc", 50);
		StudentQ6 s2 = new StudentQ6 (2, "def", 50);
		StudentQ6 s3 = new StudentQ6 (3, "ghi", 40);
		StudentQ6 s4 = new StudentQ6 (4, "jkl", 40);
		StudentQ6 s5 = new StudentQ6 (5, "mno", 90);
		StudentQ6 s6 = new StudentQ6 (6, "pqr", 90);
		StudentQ6 s7 = new StudentQ6 (7, "stu", 90);
	
		Set <StudentQ6> s = new HashSet <StudentQ6> ();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		s.add(s6);
		s.add(s7);
		
		
		Map <Integer, List> hm = new HashMap <Integer, List> ();
//		hm.put(50, null);
//		hm.put(60, null);
//		hm.put(90, null);
		
		Iterator<StudentQ6> itr = s.iterator();
		while(itr.hasNext())
		{
			StudentQ6 x = itr.next();
			
			if(hm.containsKey(x.marks))
			{
				List<Integer> t=hm.get(x.marks);
				t.add(x.rollno);
				hm.put(x.marks, t);
				
			}
			else
			{
				ArrayList<Integer> al=new ArrayList<>();
				al.add(x.rollno);
				hm.put(x.marks, al);
				
			}
				
			
		}
		System.out.println(hm);
		
		
		

	}

}
