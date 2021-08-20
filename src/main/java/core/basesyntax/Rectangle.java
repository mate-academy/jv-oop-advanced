package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSideOfRectangle;
    private int secondSideOfRectangle;

    public Rectangle(int firstSideOfRectangle, int secondSideOfRectangle, Color color) {
        super(color);
        this.firstSideOfRectangle = firstSideOfRectangle;
        this.secondSideOfRectangle = secondSideOfRectangle;
    }

    @Override
    public void drawFigure() {
        System.out.println("Rectangle: "
                + "firstSide = " + firstSideOfRectangle
                + ", secondSide = " + secondSideOfRectangle
                + ", color = " + getColor()
                + ", area = " + calculateArea() + '.');
    }

    @Override
    public double calculateArea() {
        return firstSideOfRectangle * secondSideOfRectangle;
    }
}
