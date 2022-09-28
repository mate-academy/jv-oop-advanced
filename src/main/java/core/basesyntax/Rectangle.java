package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, sideA: " + getSideA()
                + " units, sideB: " + getSideB() + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        double area = sideA * sideB;
        return Math.ceil(area * 10) / 10;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }
}
