package core.basesyntax;

public class Circle extends FigureAbstract {
    private int radius;
    private int area;

    protected Circle(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
        area = getArea();
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                +
                getName()
                +
                ", area: " + area
                +
                ", radius: " + radius
                +
                ", color: " + getColor());
    }
}
