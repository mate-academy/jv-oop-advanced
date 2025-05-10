package core.basesyntax.figure;

public class IsoscelesTrapezoid extends Figure {
    private int firstParallel;
    private int secondParallel;
    private int side;

    public IsoscelesTrapezoid(int firstParallel, int secondParallel, int side, String color) {
        super(color);
        this.firstParallel = firstParallel;
        this.secondParallel = secondParallel;
        this.side = side;
    }

    public int getFirstParallel() {
        return firstParallel;
    }

    public int getSecondParallel() {
        return secondParallel;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        double area = Math
                .sqrt((firstParallel - secondParallel + 2 * side)
                        * (secondParallel - firstParallel + 2 * side))
                * ((firstParallel + secondParallel) / 4);
        return (double) Math.round(area * 100) / 100;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, "
                + "area: " + getArea() + " sq. units, "
                + "first parallel: " + firstParallel + " units, "
                + "second parallel: " + secondParallel + " units, "
                + "side: " + side + " units");
    }
}
