package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    Rectangle(Color color,int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public String toString() {
        return "Figure: rectangle, "
                + "area: " + getArea() + " sq.units, "
                + "sideA: " + sideA + " units, "
                + "sideB: " + sideB + " units, "
                + "color: " + getColor().toString().toLowerCase();
    }
}
