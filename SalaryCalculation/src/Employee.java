public class Employee {
    String name;
    double salary;
    int workHours;
    double hireYear;


    Employee(String name,double salary,int workHours,double hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }
    double tax(){
        double tax=0;
        if(this.salary<=1000){
            System.out.println("No tax.");
            return 0;

        }
        else{
            tax=this.salary*0.03;
            //System.out.println("TOTAL TAX: "+tax);

        }
        return tax;
    }
    double bonus(){
        double bonus = 0;
        if(this.workHours>40){
            bonus += (workHours-40)*30;

        }
        System.out.println("Bonus:"+bonus);
        return bonus;

    }
    double raiseSalary(){
        double totalYear=2021-this.hireYear;
        double raise=0;
        if (totalYear<=9){
            raise=this.salary*0.05;

        }
        else if (totalYear>9 && totalYear<=19){
            raise=this.salary*0.10;

        }
        else if (totalYear>19){
            raise=this.salary*0.15;

        }
        return raise;
    }
    public String toString(){
        return "Name: "+this.name+"\n"+
        "Total Salary without Tax: "+(this.salary-this.tax()+this.bonus())+"\n"+
        "Maaş artışı:"+this.raiseSalary()+"\n"+
        "Salary with Tax and Bonus:"+(this.salary+this.raiseSalary())+"\n"+
        "Work Hours: "+this.workHours+"\n"+
        "Hire year: "+this.hireYear+"\n";

    }
}
