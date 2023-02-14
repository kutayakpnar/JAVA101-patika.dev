public class Main {
    public static void main(String[] args) {
     Course math=new Course("Mathematics","math101","math",0.2);
     Course phy=new Course("Physics","phy101","phy",0.3);
     Course chem=new Course("Chemistry","chem101","chem",0.5);

     Teacher t1=new Teacher("Pisagor","123456","math");
     Teacher t2=new Teacher("Albert Einstein","21312","phy");
     Teacher t3=new Teacher("John Dalton","564565","chem");

     math.addTeacher(t1);
     phy.addTeacher(t2);
     chem.addTeacher(t3);

     Student s1=new Student("Kutay","1",4,math,phy,chem);
     Student s2=new Student("Ali","2",4,math,phy,chem);
     Student s3=new Student("Veli","3",4,math,phy,chem);
     s1.addBulkExamNote(80,90,100,70,85,78);
     s1.isPass();
     s2.addBulkExamNote(0,5,0,0,0,0);
     s2.isPass();
     s3.addBulkExamNote(55,12,22,0,0,0);
     s3.isPass();



    }
}