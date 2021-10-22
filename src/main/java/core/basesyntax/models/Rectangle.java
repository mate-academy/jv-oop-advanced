package core.basesyntax.models;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getSquare() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println(String.format(
                "Figure: Rectangle, "
                        + "Area: %s, "
                        + "First side: %d, "
                        + "Second side: %d, "
                        + "Color: %s",
                        getSquare(), firstSide, secondSide, getColor()));
    }
}
