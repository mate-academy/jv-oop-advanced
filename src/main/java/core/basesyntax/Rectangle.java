package core.basesyntax;

public class Rectangle extends Figure {
    private double heightRectangle;
    private double width;

    public Rectangle(String color, double heightRectangle, double width) {
        super(color);
        this.heightRectangle = heightRectangle;
        this.width = width;
    }

    @Override
    public double getArea() {
        return heightRectangle * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, height: "
                + heightRectangle + "units, width: " + width + " units, color: " + getColor());
    }
}
