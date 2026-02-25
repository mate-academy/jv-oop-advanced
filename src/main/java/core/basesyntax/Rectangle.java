package core.basesyntax;

public class Rectangle extends Figure {
    private final double width;
    private final double height;

    public Rectangle(double width, double height, String color) {
        this.setColor(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calcArea() {
        return this.width * this.height;
    }

    @Override
    public void draw() {
        System.out.println("Figure : isosceles trapezoid, "
                + "area: " + calcArea() + " sq. units, "
                + "width :" + width + " units, "
                + "height :" + height + " units, "
                + "color : " + getColor());
    }
}
