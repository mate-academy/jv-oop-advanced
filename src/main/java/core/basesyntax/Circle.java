package core.basesyntax;

public class Circle extends Figures implements Drawable {
    private int radius;

    public Circle(Colors color, int area, int radius) {
        super(color, area);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle has been drawn");
    }

    @Override
    public String toString() {
        return "Shape: circle, area: "
                + getArea() + " sq. units, radius: "
                + getRadius() + " units, color: " + getColor().toLowerCase();
    }
}

//radius