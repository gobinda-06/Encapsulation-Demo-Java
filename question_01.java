class Demo
{
    int salary;
    String name; // when you ano declare any value  but you decalre a string by default it is decalre  as NULL

    public int getsalary()
    {
        return salary;
    }

    public String getname()
    {
        return name;
    }
    public void setname(String n)
    {
        name=n;
    
    }   
}

public class question_01
{
    public static void main(String[]args)
    {
        Demo d1=new Demo();
         d1.setname("Alexa");
        d1.salary=45000; 
        System.out.println("Name is : "+d1.getname());
        System.out.println("Salary is : "+d1.getsalary());


    }
}