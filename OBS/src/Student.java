public class Student {
    String name;
    String stuNo;
    int classes;
    Course c1,c2,c3;
    double average;
    boolean isPass;

    public Student(String name,String stuNo,int classes, Course c1,Course c2,Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.isPass=false;



    }
    public  void calcAverage(){
        double c2Average=((this.c2.note2 * this.c2.note2Effect) + (this.c2.note * (1 - this.c2.note2Effect)));
        double c3Average=((this.c3.note2 * this.c3.note2Effect) + (this.c3.note * (1 - this.c3.note2Effect)));
        double c1Average = ((this.c1.note2 * this.c1.note2Effect) + (this.c1.note * (1 - this.c1.note2Effect)));

        this.average=(c1Average+c2Average+c3Average)/3;


    }
    public  boolean isCheckPass(){
        calcAverage();
        System.out.println(this.average);
        return this.average>55;

    }
    public void addBulkExamNote(int c1,int c2,int c3,int c4,int c5,int c6){
        if(c1>=0 && c1<=100){
            this.c1.note=c1;
            this.c1.note2=c2;

        }
        if(c2>=0 && c2<=100){
            this.c2.note=c3;
            this.c2.note2=c4;

        }
        if(c3>=0 && c3<=100){
            this.c3.note=c5;
            this.c3.note2=c6;

        }
    }
    public void printNote(){
        System.out.println("Student:"+this.name);
        System.out.println("C1 note:"+this.c1.note);
        System.out.println("C1 note2:"+this.c1.note2);
        System.out.println("C2 note:"+this.c2.note);
        System.out.println("C2 note2:"+this.c2.note2);
        System.out.println("C3 note:"+this.c3.note);
        System.out.println("C3 note2:"+this.c3.note2);
    }
    public void isPass(){
        this.isPass=isCheckPass();
        if(this.isPass){
            System.out.println("Successful.");
        }else {
            System.out.println("Unsuccessful.");
        }
    }

}
