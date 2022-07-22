package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public int getArea() {
        return firstSide * secondSide;
    }

    @Override
    public String draws() {
        return "Figure: Rectangle, area: " + getArea() + " sq. units, firstSide: " + firstSide
                + " units, secondSide: " + secondSide + " units, color: "
                + new ColorSupplier().getRandomColor();
    }

    @Override
    public String toString() {
        return draws();
    }
}
