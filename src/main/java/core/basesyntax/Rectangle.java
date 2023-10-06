package core.basesyntax;

public class Rectangle extends Figure {
    private double rectangleSideOne;
    private double rectangleSideTwo;

    public Rectangle(Color color, double rectangleSideOne, double rectangleSideTwo) {
        super(color);
        this.rectangleSideOne = rectangleSideOne;
        this.rectangleSideTwo = rectangleSideTwo;
    }

    @Override
    public double countArea() {
        return getRectangleSideOne() * getRectangleSideTwo();
    }

    public double getRectangleSideOne() {
        return rectangleSideOne;
    }

    public double getRectangleSideTwo() {
        return rectangleSideTwo;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + countArea() + " sq.units, sides: "
                + getRectangleSideOne() + " units, "
                + getRectangleSideTwo() + " units, color: "
                + getColor());
    }
}
