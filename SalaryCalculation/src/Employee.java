public class Employee {
    String name;
    double salary;
    int workHours;
    double hireYear;
    double salaryW;

    Employee(String name,double salary,int workHours,double hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
        this.salaryW=salary;
    }
    void tax(){
        double tax;
        if(this.salary<=1000){
            System.out.println("No tax.");
            tax=0;

        }
        else{
            tax=this.salary*0.03;
            System.out.println("TOTAL TAX: "+tax);
            this.salaryW=this.salaryW-tax;
        }
    }
    void bonus(){
        double bonus = 0;
        if(this.workHours>40){
            bonus += (workHours-40)*30;
            this.salaryW+=bonus;
        }
        System.out.println("Bonus:"+bonus);
    }
    void raiseSalary(){
        double totalYear=2021-this.hireYear;
        if (totalYear<=9){
            this.salary+=this.salary*0.05;
            System.out.println("Raise salary:"+ this.salary*0.05);
        }
        else if (totalYear>9 && totalYear<=19){
            this.salary+=this.salary*0.10;
            System.out.println("Raise salary:"+ this.salary*0.1);
        }
        else if (totalYear>19){
            this.salary+=this.salary*0.15;
            System.out.println("Raise salary:"+ this.salary*0.15);
        }
    }
    public String toString(){
        return "Name: "+this.name+"\n"+
        "Total Salary without Tax: "+this.salary+"\n"+
        "Salary with Tax and Bonus:"+this.salaryW+"\n"+
        "Work Hours: "+this.workHours+"\n"+
        "Hire year: "+this.hireYear+"\n";

    }
}
