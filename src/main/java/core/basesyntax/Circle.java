package core.basesyntax;

public class Circle extends Figure implements Drawable {
    private int radius;

    public Circle(int radius, String color, String nameFigure) {
        super(color, nameFigure);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getNameFigures() + ", area: " + getArea()
                + " sq. units, radius: " + getRadius() + " units, color: " + getColor());
    }
}
