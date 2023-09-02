package core.basesyntax;

public class Circle extends FigureAbstract {
    private static final Circle CIRCLE = new Circle();
    private int radius;
    private int area;

    public Circle() {
    }

    protected Circle(String color, int radius) {
        super(color);
        this.radius = radius;
        area = getArea();
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                +
                CIRCLE.getClass().getSimpleName().toLowerCase()
                +
                ", area: " + area
                +
                ", radius: " + radius
                +
                ", color: " + getColor());
    }
}
