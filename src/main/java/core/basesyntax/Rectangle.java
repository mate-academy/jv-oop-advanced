package core.basesyntax;

public class Rectangle extends Figure {
    private final double bigSide;
    private final double smallSide;

    public Rectangle(Color color, double bigSide, double smallSide) {
        setColor(color);
        this.bigSide = bigSide;
        this.smallSide = smallSide;
    }

    @Override
    public double calculateArea() {
        return bigSide * smallSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + calculateArea() + " sq.units, bigSide and smallSide: "
                + bigSide + " and " + smallSide
                + " units, color: " + getColor().name());
    }
}
