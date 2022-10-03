package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB, Color color) {
        this.sideA = sideA;
        this.sideB = sideB;
        setColor(color);
    }

    public double getSideA() {
        return  sideA;
    }

    public void getSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void getSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return this.sideA * this.sideB;
    }

    public String draw() {
        return "Figure: " + FigureName.RECTANGLE.name() + " area: " + area() + " sides: " + this.sideA + this.sideB + " color: " + getColor().name();
    }
}
