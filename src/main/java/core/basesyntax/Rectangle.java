package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
    
    public void draw() {
        System.out.println("Figure - rectangle, color - " + getColor()
                + ", area - " + getArea()
                + ", first side - " + sideA
                + ", second side - " + sideB);
    }
    
    public double getArea() {
        return sideA * sideB;
    }
}
