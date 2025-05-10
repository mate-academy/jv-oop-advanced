package core.basesyntax;

public class Rectangle extends Figure {
    private int rectangleFirstSide;
    private int rectangleSecondSide;

    public Rectangle(String color, int rectangleFirstSide, int rectangleSecondSide) {
        super(color);
        this.rectangleFirstSide = rectangleFirstSide;
        this.rectangleSecondSide = rectangleSecondSide;
    }

    @Override
    public double getArea() {
        return (rectangleFirstSide * rectangleSecondSide);
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, rectangleFirstSide = " + rectangleFirstSide
                + ", rectangleSecondSide = " + rectangleSecondSide + ", area = " + getArea()
                + ", color: " + getRandomColor());
    }
}
