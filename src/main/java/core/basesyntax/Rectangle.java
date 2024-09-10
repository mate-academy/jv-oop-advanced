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
    public void returnInfo() {
        System.out.println("Figure: rectangle, area: " + sideA * sideB
                + " sq.units, sideA: " + sideA + ", sideB: " + sideB
                + " units, color: " + getColor());
    }
}
