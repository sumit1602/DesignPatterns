package com.company;

class Employee{
   private  String designation;

    public Employee(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}

interface Accecissable{
    void access();
}


class Record implements Accecissable{
    protected Employee employee;

    public Record(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void access() {
        System.out.println("Access the record");
    }
}
class recordProxy extends Record{

    public recordProxy(Employee record) {
        super(record);
    }

    @Override
    public void access() {
        if(employee.getDesignation()!="Admin"){
            System.out.println("you cannot access");
        }
        else
        {
            System.out.println("you can access");
        }
        super.access();
    }
}
public class Q8Proxy {
    public static void main(String[] args) {
        Employee sumit = new Employee("Admin");
        Accecissable car = new recordProxy(sumit) ;
        car.access();

    }
}
