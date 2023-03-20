class Rectangle
{
double length;
int breadth;
void setData()
 {
   System.out.println("variables are...");
   length=12.48;
   System.out.println("Length is: "+length);
   breadth=13;
   System.out.println("Breadth is: "+breadth);
  }
  
void getArea()
{
   double area;
   area=length*breadth;
   System.out.println("Area of rectangle: "+area);
}

public static void main(String args[])
{
Rectangle r1=new Rectangle();
r1.setData();
r1.getArea();
}
}
