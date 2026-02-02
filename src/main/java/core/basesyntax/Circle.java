package core.basesyntax;

public class Circle extends Figure {
    private int radius;
    private Color enumColor;

    public Circle(int radius, String enumColor) {
        super(enumColor.toString());
        this.radius = radius;

    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Color getEnumColor() {
        return enumColor;
    }

    public void setEnumColor(Color enumColor) {
        this.enumColor = enumColor;
    }

    @Override
    public void draw() {
        System.out.print("Figure:" + "circle," + "area:" + getArea() + "sq. units ");
        System.out.println("radius:" + this.radius + "units," + "Color:" + getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

}
