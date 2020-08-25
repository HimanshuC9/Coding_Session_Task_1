package collectionQuestions20;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeQ9 
{
	String name;
	int eid;
	int mgrid;
	
	public EmployeeQ9() {}
	
	public EmployeeQ9(String name, int eid, int mgrid)
	{
		this.name = name;
		this.eid = eid;
		this.mgrid = mgrid;
	}
	
	public static void main(String[] args) 
	{
		EmployeeQ9 e1 = new EmployeeQ9("himanshu", 1, 0);
		EmployeeQ9 e2 = new EmployeeQ9("umesh", 2, 1);
		EmployeeQ9 e3 = new EmployeeQ9("bhagyashree", 3, 1);
		EmployeeQ9 e4 = new EmployeeQ9("shubham", 4, 2);
		EmployeeQ9 e5 = new EmployeeQ9("veeneet", 5, 3);
		
		
		ArrayList<EmployeeQ9> ar = new ArrayList();
		ar.add(e1);
		ar.add(e2);
		ar.add(e3);
		ar.add(e4);
		ar.add(e5);
		
		for(int i=0; i<ar.size(); i++)
		{
			for(int j=0; j<ar.size(); j++)
			{
			
				if(ar.get(i).mgrid == ar.get(j).eid)
				{
					System.out.println(ar.get(i).name+" "+ar.get(j).name);
				}
			}
		}
		
		
	}

	@Override
	public String toString() {
		return "EmployeeQ9 [name=" + name + ", eid=" + eid + ", mgrid=" + mgrid + "]";
	}

}
