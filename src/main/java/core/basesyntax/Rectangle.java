package core.basesyntax;

public class Rectangle extends Figure {
    private int widthRectangle;
    private int heightRectangle;

    public Rectangle(int widthRectangle, int heightRectangle, String color) {
        this.widthRectangle = widthRectangle;
        this.heightRectangle = heightRectangle;
        setColor(color);
    }

    @Override
    public double getArea() {
        return widthRectangle * heightRectangle;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, width: "
                + widthRectangle + " units, height: " + widthRectangle
                + " units, color: " + getColor());
    }
}
