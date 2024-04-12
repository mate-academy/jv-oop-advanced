package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private final double firstParallel;
    private final double secondParallel;
    private final double height;

    public IsoscelesTrapezoid(Color color, double firstParallel,
                              double secondParallel, double height) {
        super(color);
        this.firstParallel = firstParallel;
        this.secondParallel = secondParallel;
        this.height = height;
    }

    public double getFirstParallel() {
        return firstParallel;
    }

    public double getHeight() {
        return height;
    }

    public double getSecondParallel() {
        return secondParallel;
    }

    @Override
    public double findArea() {
        return ((firstParallel + secondParallel) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area:" + findArea()
                + " sq. units, firstParallel: " + getFirstParallel()
                + ", secondParallel: " + getSecondParallel()
                + ", height: " + getHeight()
                + ", color: " + getColor());
    }
}
