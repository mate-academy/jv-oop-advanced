package core.basesyntax;
public class IsoscelesTrapezoid extends Figure implements AreaCalculator, Drawable {
    private double firstBases;
    private double secondBases;
    private double height;

    public IsoscelesTrapezoid(double firstBases, double secondBases, double height, String color) {
        super(color);
        if (firstBases <= 0 || secondBases <= 0 || height <= 0) {
            throw new IllegalArgumentException("All dimensions must be positive");
        }
        this.firstBases = firstBases;
        this.secondBases = secondBases;
        this.height = height;
    }

    @Override
    public double area() {
        return (this.firstBases + this.secondBases) * this.height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + this.area() + " sq. units, first bases: "
                + this.firstBases + " units, second bases: "
                + this.secondBases + " units, color: " + getColor());
    }
}
