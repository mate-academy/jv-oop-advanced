package core.basesyntax;

public class Circle extends Figure {
    private final int radius;
    private final NameOfFigure name = NameOfFigure.CIRCLE;

    public Circle(Color color, int radius) {
        this.setColor(color);
        this.radius = radius;
    }

    public NameOfFigure getName() {
        return name;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public int areaCalculator() {
        return (int) Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName().name()
                + " area: " + areaCalculator() + " sq.units, radius: "
                + getRadius() + " units, color: " + getColor());
    }
}
