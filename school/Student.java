package school;

public class Student {

    public String name;
    public double noteOne;
    public double noteTwo;
    public double noteThree;

    public double finalGrade(){
        return noteOne + noteTwo + noteThree;
    }

    public double passOurFailed(){
        if (finalGrade() < 60){
            return 60.0 - finalGrade();
        }
        else{
            return 0;
        }
    }
    public String toString(){
        return String.format("Nota final do aluno %s é %.2f", name, finalGrade());
    }

}
