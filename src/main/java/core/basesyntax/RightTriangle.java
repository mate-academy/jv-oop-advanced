package core.basesyntax;

public class RightTriangle extends Figure {
    private int sideA;
    private int sideB;

    public RightTriangle(String color, int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        super.setColor(color);
    }

    @Override
    public double calculateArea() {
        return sideA * sideB / 2;
    }

    @Override
    public void infoDrawer() {
        System.out.println("Figure: right triangle, area: " + calculateArea()
                + " sq.units, sideA: " + sideA + " units, sideB " + sideB
                + " units, color " + getColor());
    }

}
