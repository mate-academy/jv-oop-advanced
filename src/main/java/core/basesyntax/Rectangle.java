package core.basesyntax;

public class Rectangle extends Figure implements AreaObtainer, InfoPrinter {
    private int sideA;
    private int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        setColor(color);
    }

    @Override
    public double areaCalculater() {
        return sideA * sideB;
    }

    @Override
    public void infoDrawer() {
        System.out.println("Figure: rectangle, area: " + areaCalculater() + " sq.units, sideA: "
                + sideA + " units, sideB " + sideB + " units, color " + getColor());
    }
}
