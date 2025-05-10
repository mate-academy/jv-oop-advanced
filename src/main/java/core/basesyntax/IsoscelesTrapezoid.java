package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstParallel;
    private double secondParallel;
    private double height;

    public IsoscelesTrapezoid(double firstParallel,
                              double secondParallel,
                              double height,
                              String color) {
        super(color);
        this.firstParallel = firstParallel;
        this.secondParallel = secondParallel;
        this.height = height;
    }

    @Override
    public double obtainTheArea() {
        return ((firstParallel + secondParallel) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + obtainTheArea()
                + " sq.units, firstParallel: " + this.firstParallel + " units, secondParallel: "
                + this.secondParallel + " units, height: " + this.height
                + " units, color: " + super.getColor().toLowerCase());
    }
}
