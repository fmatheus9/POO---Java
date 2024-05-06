package exercicio3;
public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double Area(){
        return this.height * this.width;
    }
    public double Perimeter(){
        return this.height * 2 + this.width * 2;
    }
    public double Diagonal(){
        return Math.sqrt(this.width*this.width + this.height*this.height);
    }
}
