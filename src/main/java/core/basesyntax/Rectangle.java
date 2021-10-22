package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        super.setColor(color);
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    @Override
    public void infoDrawer() {
        System.out.println("Figure: rectangle, area: " + calculateArea() + " sq.units, sideA: "
                + sideA + " units, sideB " + sideB + " units, color " + getColor());
    }
}
