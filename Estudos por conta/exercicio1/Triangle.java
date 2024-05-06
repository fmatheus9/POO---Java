package exercicio1;
public class Triangle {
    public double x1,x2,x3, p, area;

    public Triangle(double x1, double x2, double x3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getX3() {
        return x3;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public double Area(){
        p = (x1+x2+x3) / 2;
        area =  Math.sqrt(this.p * (this.p-x1) * (this.p-x2) *(this.p-x3));
        return area;
    }

}
