package core.basesyntax;

public class Square extends Figure {
    private final int singleSide;

    public Square(int singleSide, String color) {
        super.setColor(color);
        this.singleSide = singleSide;
    }

    @Override
    public double getArea() {
        return Math.pow(singleSide, 2);
    }

    @Override
    public String draw() {
        return "Figure: square, "
                + "area: " + getArea() + " sq.units, "
                + "side: " + singleSide + " units, "
                + "color: " + super.getColor().toLowerCase();
    }
}
