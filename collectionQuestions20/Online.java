package collectionQuestions20;

import java.util.ArrayList;

public class Online 
{
	public static void main(String[] args) 
	{
		ArrayList ar = new ArrayList();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		int count=0;
		for(int i=0; i<ar.size(); i++)
		{
			count++;
		}
		System.out.println(count );
	}

}
