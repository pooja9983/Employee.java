importjava.io.*;
class Employee
{
private string name,address;
private int year,salary;
public Employee(string n,int y,int sal,string add);
name=n;
year=y;
salary=sal;
address=add;
}
public String getName(){
return name;
}
public int getyear(){
return year;
}
public int getsalary(){
return salary;
}public string getaddress(){
return address;
}
}
class  Emp{
public static void main(String[]args){
Employee E1 =new Employee("Robert",1994,500000," 64c-wallstreet");
Employee E2 =new Employee("sam",2000,700000," 68c-wallstreet");
Employee E3 =new Employee("john",1999,570000," 24c-wallstreet");
System.out.println(" Name\tyearof joining\tsalary\taddress");
}