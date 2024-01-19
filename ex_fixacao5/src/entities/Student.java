package entities;

public class Student {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public Student(String name, double grade1, double grade2, double grade3){
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public double  getFinalGrade(){
        return this.grade1 + this.grade2 + this.grade3;
    }

    public void  verifyPass(){
        if(getFinalGrade() >= 60){
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", 60 - getFinalGrade());
        }
    }


}
