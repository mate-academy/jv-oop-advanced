package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int firstParallel;
    private int secondParallel;

    public IsoscelesTrapezoid(int height, int firstParallel, int secondParallel, String color) {
        super(color);
        this.height = height;
        this.firstParallel = firstParallel;
        this.secondParallel = secondParallel;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, height: " + height + " units, "
                + "first parallel: " + firstParallel + " units,"
                + " second parallel " + secondParallel + " units," + " color: " + color);
    }

    @Override
    public double getArea() {
        return ((double)(firstParallel + secondParallel) / 2) * height;
    }
}
