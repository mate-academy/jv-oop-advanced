package core.basesyntax;

public class Rectangle extends Figure implements FigureProperties {
    private int sideA;
    private int sideB;
    ColorSupplier colorSupplier = new ColorSupplier();

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String toString() {
        return "Figure: rectangle. SideA: " + sideA + " mm." + " SideB: " + sideB +
                "mm. Area: " + getArea() + " sq.mm. Color: " + colorSupplier.getRandomColor();
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

}
