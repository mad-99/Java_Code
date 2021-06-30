import java.util.Scanner;
class Book{
	private int bookNo;
	private String title;
	private String author;
	private float price;
	public static int count=0;
	Book(int bookNo,String title,String author,float price){
		this.setBookNo(bookNo);
		if(title.length()>4) {
			this.setTitle(title);
		}
		else {
			System.out.println("title name must be greater then 4 character");
		}
		this.setAuthor(author);
		if(price>1 && price<5000) {
			this.setPrice(price);
		}
		else {
			System.out.println("price must be between 1 to 5000");
		}
		count++;
	}
	
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public static int getCount() {
		return count;
	}
}
public class BookDetails {

	public static void main(String[] args) {
		System.out.println("enter the values in book b1");
		Scanner scan =new Scanner(System.in);
		System.out.println("enter book no.");
		int no = scan.nextInt();
		//b1.setBookno(no);
		System.out.println("enter  book title");
		String title = scan.next();
		//b1.setTitle(title);
		System.out.println("enter book author");
		String author = scan.next();
		//b1.setAuthor(author);
		System.out.println("enter book price");
		float price = scan.nextFloat();
		//b1.setPrice(price);
		Book b1 =new Book(no,title,author,price);
		System.out.println("enter the values in book b2");
		Scanner scan1 =new Scanner(System.in);
		System.out.println("enter book no.");
		int no1 = scan1.nextInt();
		//b1.setBookno(no);
		System.out.println("enter  book title");
		String title1 = scan1.next();
		//b1.setTitle(title);
		System.out.println("enter book author");
		String author1 = scan1.next();
		//b1.setAuthor(author);
		System.out.println("enter book price");
		float price1 = scan1.nextFloat();
		//b1.setPrice(price);
		Book b2 =new Book(no1,title1,author1,price1);
		System.out.println(b1.getBookNo());
		System.out.println(b1.getTitle());
		System.out.println(b1.getAuthor());
		System.out.println(b1.getPrice());
		System.out.println(b2.getBookNo());
		System.out.println(b2.getTitle());
		System.out.println(b2.getAuthor());
		System.out.println(b2.getPrice());
		
		System.out.println("total book = "+Book.getCount());
		// TODO Auto-generated method stub

	}

}
