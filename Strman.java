import java.util.*;
class Strman{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.println("DEMONSTRATING STRING MANIPULATION METHODS OF String CLASS");
System.out.println("enter a string: ");
String str1=sc.nextLine();
System.out.println("enter another string: ");
String str2=sc.nextLine();
String str3=str1.concat(str2);
System.out.println("After String concatenation: " + str3);
System.out.println("Length of concatnated string is :"+ str3.length());
System.out.println(str3+"converted to uppercase :"+ str3.toUpperCase());
System.out.println(str3+"after replacing all occurence of e top a :"+str3.replace('e','a'));
char ch[]=str3.toCharArray();
for(int i=0;i<ch.length;i++)
System.out.println("character at "+(i+1)+" is "+ch[i]);
System.out.println("Index position of the substring "+str2+" is "+str3.indexOf(str2));
System.out.println("DEMONSTRATING STRING MANIPULATION METHODS OF StringBuffer CLASS");
System.out.println("enter a string: ");
String temp=sc.nextLine();
StringBuffer str=new StringBuffer(temp);
System.out.println("enter another string: ");
String temp1=sc.nextLine();
str.append(temp1);
System.out.println(temp+"after String concatenation: " + str);
System.out.println("Length :"+ str1.length());
System.out.println("enter a substring: ");
String temp2=sc.nextLine();
System.out.println("enter a position where the substring has to be inserted: ");
int pos =sc.nextInt();
str.insert(pos,temp2);
System.out.println("changed string :"+str);
}
}
