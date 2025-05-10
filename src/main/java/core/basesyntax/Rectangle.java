package core.basesyntax;

public class Rectangle extends Figure {
    private final int firstSide;
    private final int secondSide;

    public Rectangle(String color, int sizeOne, int sizeTwo) {
        super(color);
        this.firstSide = sizeOne;
        this.secondSide = sizeTwo;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: "
                + getArea()
                + " sq.units, first side: "
                + getFirstSide()
                + " units, second side: "
                + getSecondSide()
                + " units, color: "
                + getColor().toLowerCase());
    }
}
