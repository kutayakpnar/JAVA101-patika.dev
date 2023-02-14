public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int note2;
    double note2Effect;


    public Course(String name,String code,String prefix,double note2Effect){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
        this.note2=0;
        this.note2Effect=note2Effect;




    }
    public void addTeacher(Teacher teacher){
        if(this.prefix.equals(teacher.branch)){
            this.teacher=teacher;
            System.out.println("Teacher is added.");
        }
        else {
            System.out.println(teacher.name+" cannot give this lecture.");
        }

    }

    public void printTeacher(){
        if (this.teacher==null){
            System.out.println("There is no teacher for this course.");
        }
        else {
            System.out.println(teacher.name);
        }


    }

}
