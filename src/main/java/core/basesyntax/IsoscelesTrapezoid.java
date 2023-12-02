package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int firstParallel;
    private int secondParallel;

    public IsoscelesTrapezoid(String color, int height, int firstParallel, int secondParallel) {
        super(color);
        this.height = height;
        this.firstParallel = firstParallel;
        this.secondParallel = secondParallel;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: isosceles trapezoid, area: %.1f sq. units, "
                        + "height: %d units, first parallel: %d units, "
                        + "second parallel %d units, color: %s\n",
                        getArea(), height, firstParallel, secondParallel, color);
    }

    @Override
    public double getArea() {
        return (firstParallel + secondParallel) / 2 * height;
    }
}
