package core.basesyntax;

public abstract class Circle extends AbstractFigure {

    private final double radius;

    public Circle(double radius, Color color) {
        super(color);
        this.radius = radius;
    }

    public Circle(double radius) {

        this(radius, AbstractFigure.getRandomColor());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, square: "
                + getArea() + " sq. m., radius: "
                + radius + " unit, color: "
                + color);
    }
}

