package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double firstParallel;
    private final double secondParallel;
    private final int height;

    public IsoscelesTrapezoid(String color, double firstParallel,
                              double secondParallel, int height) {
        super(color);
        this.firstParallel = firstParallel;
        this.secondParallel = secondParallel;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstParallel + secondParallel) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid"
                + ", area: " + getArea()
                + " sq.units, first parallel: " + firstParallel
                + " units, second parallel: " + secondParallel
                + " units, height: " + height
                + " units, color: " + getColor());
    }
}
