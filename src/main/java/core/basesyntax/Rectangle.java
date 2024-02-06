package core.basesyntax;

public class Rectangle extends Figure {
    private int widthRectangle;
    private int heightRectangle;

    public Rectangle(String color, int widthRectangle, int heightRectangle) {
        super(color);
        this.widthRectangle = widthRectangle;
        this.heightRectangle = heightRectangle;
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
