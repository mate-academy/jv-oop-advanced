package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator, InformationPrinter {
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
    
    public void drawIt() {
        System.out.println("Figure - rectangle, color - " + getColor()
                + ", area - " + getArea()
                + ", first side - " + getSideA()
                + ", second side - " + getSideB());
    }
    
    public double getArea() {
        return sideA * sideB;
    }
}
