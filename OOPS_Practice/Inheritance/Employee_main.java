class Employee{
    int employee_id;
    double employee_salary;
    Employee(int id,double salary){
        this.employee_id=id;
        this.employee_salary=salary;
    }
    
    void display(){
        System.out.println("employee_id:"+employee_id);
        System.out.println("employee_salary:"+employee_salary);
    }
}
class Developer extends Employee
{
    String developer_name;
    Developer(int id,double salary,String name){
        super(id,salary);
        this.developer_name=name;
    }
    void display(){
        super.display();
        System.out.println("developer_name:"+developer_name);
    }
}
class Tester extends Employee{
    String Tester_name;
    Tester(int id,double salary,String name){
        super(id, salary);
        this.Tester_name=name;
    }
    
    void display(){
        super.display();
        System.out.println("tester_name:"+Tester_name);
    }
}
class Employee_main{
    public static void main(String[] args) {
        Developer d1=new Developer(101,20000,"gayathri");
        Tester t1=new Tester(102,30000,"sneha");
        d1.display();
        t1.display();
    }
}
