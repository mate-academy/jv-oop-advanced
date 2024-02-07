package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(Color color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
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
    public double calculateArea() {
        return this.sideA * this.sideB;
    }

    public String draw() {
        return "Figure: " + FigureName.RECTANGLE.name() + " area: " + calculateArea()
                + " side A: " + this.sideA + " side B: " + this.sideB
                + " color: " + getColor().name();
    }
}
