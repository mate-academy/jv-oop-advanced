package core.basesyntax.entity;

public class Rectangle extends Figure{

    protected double width;
    protected double height;

    public Rectangle(double width, double height, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }


    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq.units, width: " + width + " units, height: "
                + height + "units, color: " + this.color);
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
