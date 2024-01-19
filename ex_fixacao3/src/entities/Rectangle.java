package entities;

public class Rectangle {

    public double width;
    public double height;

    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }

    public double getArea(){
        return this.width * this.height;
    }

    public double getPerimeter(){
        return 2 * (this.width + this.height);
    }

    public double getDiagonal(){
        return Math.sqrt(Math.pow(this.width,2) + Math.pow(this.height, 2));
    }


}
