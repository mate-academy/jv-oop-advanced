package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return (double) sideA * sideB;
    }

    @Override
    public String drawer() {
        return "Figure: rectangle, area: " + (int) (Math.random() * getArea())
                + " sq.units, sideA: " + sideA + " units, sideB "
                + sideB + " units, color: " + getColor();
    }
}
