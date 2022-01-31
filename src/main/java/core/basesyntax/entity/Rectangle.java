package core.basesyntax.entity;

public class Rectangle extends Figure{

    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
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
