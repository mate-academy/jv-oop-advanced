package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double circleArea = Math.PI * radius * radius;
        return getFormat("#.##", circleArea);
    }

    @Override
    public void draw() {
        System.out.println("Figure name: " + FigureName.CIRCLE.name().toLowerCase()
                + ", area: " + getArea() + " sq. units, color: " + getColor().toLowerCase());
    }
}
