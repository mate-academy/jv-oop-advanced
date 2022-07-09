package core.basesyntax;

public class Circle extends  Figure {
    int radius;

    public Circle(String color, int radius) {
        super("circle", color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void Draw() {
        System.out.println("Figure: " + getName() + " square: " + getSquare() + " radius: " + getRadius() +
                " color: " + getColor());
    }

    @Override
    double getSquare() {
        return Math.PI * getRadius() * getRadius();
    }
}
