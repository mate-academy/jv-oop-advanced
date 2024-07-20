package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return 2 * getRadius() * Math.PI;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: the radius is")
                .append(radius)
                .append(" the area is: ")
                .append(getArea())
                .append(" the color is: ")
                .append(color);
        System.out.println(builder.toString());
    }
}
