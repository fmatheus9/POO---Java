package exercicio5;
public class Student {
    private String name;
    private double n1,n2,n3;

    public Student(String name, double n1, double n2, double n3) {
        this.name = name;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }
    public void finalGrade(){
        double finalGrade = this.n1+this.n2+this.n3;
        System.out.println("Final grade = " + finalGrade);
        if (finalGrade < 60.00){
            System.out.println("Failed");
            System.out.println("Missing " + (60.00 - finalGrade) + " points.");
        }
        else {
            System.out.println("Pass");
        }
    }
}
