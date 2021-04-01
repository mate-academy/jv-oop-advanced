package core.basesyntax;

public class Rectangle extends Figure {
    private double side1;
    private double side2;
    private double side3;

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setRectangle(double side1, double side2, double side3) {
        if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    }

    @Override
    public void calculateArea() {
        setArea((side1 + side2 + side3) / 2);
    }

    @Override
    public void draw() {
        System.out.println("Hello, my name is Rectangle, my area: " + getArea()
                + " my side: " + side1 + " " + side2 + " " + side3 + " my color: " + getColor());
    }
}
