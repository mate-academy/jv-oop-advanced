package core.basesyntax;

public class Circle extends Figures {
    private int radius;
    private final String name = "circle";

    public Circle() {
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public void draw(Figures figure) {
        System.out.println(figure);
    }

    @Override
    public String toString() {
        return "Figure: " + name + ", area: " + getArea() + " sq.units, radius: " + radius
                + " units, color: " + getColor();
    }
}
