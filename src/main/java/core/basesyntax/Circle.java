package core.basesyntax;

public class Circle extends Figure {
    public int radius;

    @Override
    public void toDraw() {
        System.out.println("Figure: circle, area: "
                + getArea()
                + "sq. units, radius: "
                + radius
                + "units, color: "
                + color);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
