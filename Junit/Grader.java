package Junit;

public class Grader {

    public char Result(int marks){
        if(marks<0){
            throw new IllegalArgumentException("Marks should be greater than 0");
//            return 'F';
        }
        if(marks<60){
            return 'F';
        }
        if(marks<70){
            return 'D';
        }
        if(marks<80){
            return 'C';
        }
        if(marks<90){
            return 'B';
        }
        if(marks<=100){
            return 'A';
        }else{
            throw new IllegalArgumentException("Marks should be less than or equal to 100");
        }
    }
}
