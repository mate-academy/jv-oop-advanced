package core.basesyntax;

public class Circle extends Figure implements FigureDetailer {
    private String name = "circle";
    private int radius;
    private Color color;

    public Circle(int radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public void getDetails() {
        System.out.println(getColor() + " " + name + " with radius " + radius + " and area of "
                + getArea());

    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }
}
