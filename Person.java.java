import java.util.*;
class Person
{
String name ;
int age;
public void setInfo (String name , int age)
{
 this.name = name ;
this.age = age;
}
public void getInfo()
{
System.out.println("The name of person is=" + name+ "& age is "+age);
}
} 

 class Test{
public static void main(String[] args)
{
String n;
int a;
Person o1 = new Person();
Scanner sc = new Scanner(System.in);
System.out.println("Enter the name and age ");
n = sc.nextLine();
a = sc.nextInt();
o1.setInfo(n,a);
o1.getInfo();
sc.close();
}
}
