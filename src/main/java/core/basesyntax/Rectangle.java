package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle() {
    }

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public Rectangle(String color) {
        super(color);
    }

    @Override
    public float getArea() {
        return (float) (firstSide * secondSide);
    }

    @Override
    public String draw() {
        return super.toString()
                + ", area: " + getArea()
                + " sq.units, first side: " + firstSide
                + " units, second side: " + secondSide + " units";
    }
}
