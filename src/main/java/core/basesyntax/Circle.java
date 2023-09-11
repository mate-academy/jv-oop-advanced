package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public int areaCalculation() {
        return radius * radius * (int) Math.PI;
    }

    @Override
    public void ableToDraw() {
        System.out.println("Figure: circle, area: " + areaCalculation()
                + " sq.units, radius: " + radius + " units, color: " + color.name());
    }
}
