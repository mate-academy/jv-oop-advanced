package core.basesyntax;

public class Circle extends Figures {
    private int radius;

    public Circle(Colors color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Circle has been drawn");
    }

    @Override
    public String toString() {
        return "Shape: circle, area: "
                + getArea() + " sq. units, radius: "
                + radius + " units, color: " + getColor().toLowerCase();
    }
}
