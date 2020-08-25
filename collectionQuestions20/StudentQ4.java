package collectionQuestions20;
import java.util.*;
public class StudentQ4 
{
	int sid;
	String name;
	String course;
	static HashMap<StudentQ4, Integer> hm = new HashMap<StudentQ4, Integer>();
	
	public StudentQ4() {}
	public StudentQ4(int sid, String name, String course)
	{
		this.sid = sid;
		this.name = name;
		this.course = course;
	}
	
	public void addInMap()
	{
		StudentQ4 s1 = new StudentQ4(1, "abc", "java");
		StudentQ4 s2 = new StudentQ4(2, "def", "angular");
		StudentQ4 s3 = new StudentQ4(3, "ghi", "java");
		StudentQ4 s4 = new StudentQ4(4, "jkl", "angular");
		StudentQ4 s5 = new StudentQ4(5, "mno", "java");
		
//		HashMap<StudentQ4, Integer> hm = new HashMap<StudentQ4, Integer>();
		hm.put(s1, 50);
		hm.put(s2, 60);
		hm.put(s3, 40);
		hm.put(s4, 70);
		hm.put(s5, 70);
	}
	
	public void passedStudents()
	{
		HashSet<StudentQ4> hsj = new HashSet<StudentQ4>();
		HashSet<StudentQ4> hsa = new HashSet<StudentQ4>();
		
		for(Map.Entry<StudentQ4, Integer> f : hm.entrySet())
		{
			if(f.getValue()>= 50 && f.getKey().course.equals("java"))
			{
				hsj.add(f.getKey());
			}else if(f.getValue() >=
					60 && f.getKey().course.equals("angular"))
			{
				hsa.add(f.getKey());
			}
		}
		System.out.println(hsj);
		System.out.println(hsa);
	}
		
	public static void main(String[] args) 
	{
		
		
		StudentQ4 o = new StudentQ4();
		o.addInMap();
		o.passedStudents();
		
	}
	@Override
	public String toString() {
		return "StudentQ4    [sid=" + sid + ", name=" + name + ", course=" + course + "]   "+ "";
	}

}
