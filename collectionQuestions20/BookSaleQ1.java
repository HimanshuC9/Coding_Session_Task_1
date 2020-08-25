package collectionQuestions20;

import java.util.*;

public class BookSaleQ1 
{
	Book b;
	int copiesSold;
	
	public BookSaleQ1(Book b, int copiesSold) 
	{
		super();
		this.b = b;
		this.copiesSold = copiesSold;
	}

	@Override
	public String toString() {
		return "BookSale [b=" + b + ", copiesSold=" + copiesSold + "]";
	}
	
	public static void main(String [] args)
	{
	    Book a =  new Book(1, "xyz", 50.0f);
	    Book a1 = new Book(2, "lmn", 500.0f);
	    Book a2 = new Book(3, "abc", 300.0f);
	    
		BookSaleQ1 b1 = new BookSaleQ1(a, 5); 		//fmi-> BookSale b1 = new BookSale(new Book(1, "xyz", 50.0f), 5); (this is anonymous object creation)
		BookSaleQ1 b2 = new BookSaleQ1(a1, 50);
		BookSaleQ1 b3 = new BookSaleQ1(a2, 4);
		//BookSale b4 = new BookSale(a1, 10);
		//BookSale b5 = new BookSale(a2, 2);
		
		ArrayList <BookSaleQ1> ar = new ArrayList <BookSaleQ1> ();
		ar.add(b1);
		ar.add(b2);
		ar.add(b3);
		//ar.add(b4);
		//ar.add(b5);
		
		
		Map<Integer, Float> hm = new HashMap<Integer, Float>();
		hm.put(1, 50.0f);
		hm.put(2, 500.0f);
		hm.put(3, 300.0f);
		hm.put(4, 230.0f);
		hm.put(5, 150.0f);
		
		
		for (Map.Entry<Integer, Float> en : hm.entrySet())
		{
			for (BookSaleQ1 x:ar)
			{
			
				if(en.getKey() == x.b.bookid)
				{
					Float temp = en.getValue()+ (x.b.price * x.copiesSold);
					hm.put(en.getKey(), temp);
					//System.out.println("x");
				}
				else 
				{
					
					hm.put(x.b.bookid, (x.b.price * x.copiesSold));
				//System.out.println("y");
				}
			}
		System.out.println(en.getKey()+"\t"+ ""+en.getValue());
			System.out.println();
		}
		
		
		
	}
	
	
}
