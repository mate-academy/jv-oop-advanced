package core.basesyntax;

public class Rectangle extends Figure implements AreaDrawable {
    private int side1;
    private int side2;

    public Rectangle(String color, int side1, int side2) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return (side1 * side2);
    }

    @Override
    public void drawTheFigure() {
        System.out.println("Figure: rectangle, side1 = " + side1
                + ", side2 = " + side2 + ", area = " + getArea()
                + ", color: " + getRandomColor());
    }
}
