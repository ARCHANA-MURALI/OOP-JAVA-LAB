import java.util.Scanner;
class Publisher
{
	String pub_name;
	Publisher(String name)
	{
	pub_name=name;
	}
}
class Book extends Publisher
{
	String nbook,author;
	float price;
	Book(String pname,String aname,String bname,float price)
	{
		super(pname);
		nbook=bname;
		author=aname;
		this.price=price;
	}
}
class Literature extends Book
{
	Literature(String bname,String aname,String pname,float p1)
	{
		super(pname,aname,bname,p1);
	}
	void display1()
	{
		System.out.println("Publisher name: " + pub_name);
		System.out.println("Name of the book: : " + nbook);
		System.out.println("Author name: " + author);
		System.out.println("Price of book: " + price);
	}
}
class Fiction extends Book
{
	Fiction(String bname,String aname,String pname,float p2)
	{
		super(pname,aname,bname,p2);
	}
	void display2()
	{
		System.out.println("Publisher name: " + pub_name);
		System.out.println("Name of the book: " + nbook);
		System.out.println("Author name: " + author);
		System.out.println("Price of book: " + price);
	}
}
class Hierin
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter details of the book(literature): ");
		System.out.println("Name of book: ");
		String b1name=sc.nextLine();
		System.out.println("Name of author: ");
		String a1name=sc.nextLine();
		System.out.println("Publisher name: ");
		String p1name=sc.nextLine();
		System.out.println("Price: ");
		float p1=sc.nextFloat();
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter details of the book(fiction): ");
		System.out.println("Name of book: ");
		String b2name=s.nextLine();
		System.out.println("Name of author: ");
		String a2name=s.nextLine();
		System.out.println("Publisher name: ");
		String p2name=s.nextLine();
		System.out.println("Price: ");
		float p2=s.nextFloat();
		System.out.println(" ");
		
		System.out.println("Book Details : ");
		Literature l=new Literature(b1name,a1name,p1name,p1);
		l.display1();
		System.out.println(" ");
		
		System.out.println("Book Details : ");
		Fiction f=new Fiction(b2name,a2name,p2name,p2);
		f.display2();
	}
}

