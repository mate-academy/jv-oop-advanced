package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public void getDetails() {
        System.out.println(getColor() + " " + " circle with radius " + radius + " and area of "
                + getArea());
    }
}
