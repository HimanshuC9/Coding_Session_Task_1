package collectionQuestions20;

public class Book
{
	int bookid;
	String author;
	float price;
	
	public Book()
	{}
	
	public Book(int bookid, String author, float price)
	{
		this.bookid = bookid;
		this.author = author;
		this.price = price;
	}
	
	@Override
	public String toString()
	{
		return "[Book id= " + bookid + " Author name- " + author + " Price = " + price+"]";
	}

}
