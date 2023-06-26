package java8.Functionalinterface;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
    String ename;
    int salary;
    int experience;
    Employee(String name,int sal,int exp){
        ename=name;
        salary=sal;
        experience=exp;

    }


}

public class PreDefined2 {
    public static void main(String[] args) {

        Employee emp=new Employee("Swathi",35000,1 );

        Predicate<Employee> pr=e->(e.salary>30000&&e.experience>3);
        System.out.println(pr.test(emp));

        ArrayList<Employee>al=new ArrayList();
        al.add(new Employee( "swathi",50000,5));
        al.add(new Employee( "swathi",10,20));
        al.add(new Employee( "swathi",10,20));
        al.add(new Employee( "swathi",10,20));

        for(Employee e:al)
        {
            if(pr.test(e)){
                System.out.println(e.ename+" "+e.salary);
            }
        }


    }
}
