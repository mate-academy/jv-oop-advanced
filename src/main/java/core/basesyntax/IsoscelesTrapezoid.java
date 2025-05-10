package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double firstParallel;
    private final double secondParallel;
    private final double height;

    public IsoscelesTrapezoid(String color, double firstParallel,
                              double secondParallel, double height) {
        super(color);
        this.firstParallel = firstParallel;
        this.secondParallel = secondParallel;
        this.height = height;
    }

    public double getFirstParallel() {
        return firstParallel;
    }

    public double getSecondParallel() {
        return secondParallel;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return ((firstParallel + secondParallel) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure : " + "isosceles trapezoid," + " area : " + calculateArea()
                + " sq.units " + ",first parallel : " + getFirstParallel() + " units,"
                + " second parallel : " + getSecondParallel() + " units,"
                + " height :" + getHeight() + ", color : " + getColor());
    }
}
