package collectionQuestions20;
import java.util.*;
import java.util.Map.Entry;

public class StudentQ10 
{
	int sid;
	String sName;

	public StudentQ10() {}

	public StudentQ10(int sid, String sName) 
	{
		this.sid = sid;
		this.sName = sName;
	}

	@Override
	public String toString() {
		return "StudentQ10 [sid=" + sid + ", sName=" + sName + "]";
	}
	
	public static void main(String[] args) 
	{
		ArrayList<CoursesQ10> al = new ArrayList();
		al.add(new CoursesQ10 (1, "Singing"));
		al.add(new CoursesQ10 (2, "Dancing"));
		
		ArrayList<CoursesQ10> al1 = new ArrayList();
		al1.add(new CoursesQ10 (3,"Drawing"));
		al1.add(new CoursesQ10 (4,"Running"));
		
		ArrayList<CoursesQ10> al2 = new ArrayList<>();
		al2.add(new CoursesQ10 (5,"Dancing"));
		al2.add(new CoursesQ10 (6,"Trekking"));
		
		
		StudentQ10 s1 = new StudentQ10(1,"abc");
		StudentQ10 s2 = new StudentQ10(2,"def");
		StudentQ10 s3 = new StudentQ10(3,"ghi");
		StudentQ10 s4 = new StudentQ10(4,"jkl");
		StudentQ10 s5 = new StudentQ10(5,"mno");
		StudentQ10 s6 = new StudentQ10(6,"pqr");
		
		
		Map<StudentQ10, List<CoursesQ10>> m = new HashMap<>(); 
		m.put(s1, al);
		m.put(s2, al1);
		m.put(s3, al2);
		m.put(s4, al1);
		m.put(s5, al2);
		m.put(s6, al2);
			
		Map<Integer, List<StudentQ10>> m2 = new HashMap<> ();
		
//		Set s = m.entrySet();
//		for(Map.Entry<CoursesQ10, List<StudentQ10>> i : s)
		
		//Iterator itr = ((ArrayList<CoursesQ10>) m).iterator();
		
		for(Map.Entry<StudentQ10, List<CoursesQ10>> i : m.entrySet())
		{
			List<CoursesQ10> c=i.getValue();
			
			for(CoursesQ10 ct:c)
			{
				if(m2.containsKey(ct.cid))
				{
					List<StudentQ10> tp=m2.get(ct.cid);
					tp.add(i.getKey());
					m2.put(ct.cid, tp);
				}
				else
				{
					ArrayList<StudentQ10> ar = new ArrayList();
					ar.add(i.getKey());
					m2.put(ct.cid, ar);
				}
			}
		}System.out.println(m2);
		

	}

}
