package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(String color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public double getArea() {
        return getSideA() * getSideB();
    }

    @Override
    public String draw() {
        System.out.println(("Figure: Square, area: " + getArea()
                + " sq.units, size side A: " + getSideA()
                + " sq.units, size side B: " + getSideB()
                + " units, color: " + getColor()));
        return null;
    }
}
