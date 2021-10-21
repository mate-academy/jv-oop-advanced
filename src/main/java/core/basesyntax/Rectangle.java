package core.basesyntax;

public class Rectangle extends Figure {
    private int lengthRectangle;
    private int breadthRectangle;

    public Rectangle(String color, int lengthRectangle, int breadthRectangle) {
        super(color);
        this.lengthRectangle = lengthRectangle;
        this.breadthRectangle = breadthRectangle;
    }

    @Override
    public double getArea() {
        return lengthRectangle * breadthRectangle;
    }

    @Override
    public void drawInfo() {
        System.out.println(String.format(
                "Figure: %s, area: %s sq.units, lengthRectangle: %d units,"
                + " breadthRectangle: %d units, color: %s",
                getClass().getSimpleName(), getArea(),
                lengthRectangle, breadthRectangle, getColor()));
    }
}
