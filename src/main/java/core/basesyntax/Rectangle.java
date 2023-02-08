package core.basesyntax;

public class Rectangle extends Figure {
    private final double bigSide;
    private final double smallSide;

    public Rectangle(Color color, double bigSide, double smallSide) {
        this.setColor(color);
        this.bigSide = bigSide;
        this.smallSide = smallSide;
    }

    @Override
    public double area() {
        return bigSide * smallSide;
    }

    @Override
    public void printInformation() {
        System.out.println("Figure: rectangle, area: "
                + area() + " sq.units, bigSide and smallSide: "
                + bigSide + " and " + smallSide
                + " units, color: " + getColor().name());
    }
}
