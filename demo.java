import java.util.*;
class Date
{
    int month;
    int date;
    int year;
    Date(int date,int month,int year)
    {
        this.date=date;
        this.month=month;
        this.year=year;
    }
    Date()
    {
        date=0;
        month=0;
        year=0;
    }
}
class Person
{
    private String name;
    private Date dob;
    Person(String n,Date d)
    {
        name=n;
        dob=new Date(d.date,d.month,d.year);
    }
    String getname()
    {
        return name;
    }
    Date getdob()
    {
        return dob;
    }
    void setname(String s)
    {
        name=s;
    }
    void setdob(Date d)
    {
        dob = new Date(d.date,d.month,d.year);
    }
}
class Author extends Person
{
    private String email;
    private char gender;
    private int nob;
    Author(String name,Date d,String e,char g,int n)
    {
        super(name,d);
        email=e;
        gender=g;
        nob=n;
    }
    public String toString()
    {
        Date d = new Date();
        d=getdob();
        return(getname()+" "+d.date+" "+d.month+" "+d.year+" "+email+" "+gender+" "+nob);
    }
}
public class Demo
{
    public static void main(String [] args)
    {
        Date d=new Date(18,8,2000);
        Author a = new Author("Abc",d,"abc",'m',1000);
        System.out.println(a);
    }
}
