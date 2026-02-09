package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstBases;
    private double secondBases;
    private double height;

    public IsoscelesTrapezoid(double firstBases, double secondBases, double height, String color) {
        super(color);
        if (firstBases <= 0 || secondBases <= 0 || height <= 0) {
            return;
        }
        this.firstBases = firstBases;
        this.secondBases = secondBases;
        this.height = height;
    }

    public double getFirstBases() {
        return firstBases;
    }

    public void setFirstBases(double firstBases) {
        if (firstBases <= 0) {
            return;
        }
        this.firstBases = firstBases;
    }

    public double getSecondBases() {
        return secondBases;
    }

    public void setSecondBases(double secondBases) {
        if (secondBases <= 0) {
            return;
        }
        this.secondBases = secondBases;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            return;
        }
        this.height = height;
    }

    @Override
    public double area() {
        return (this.getFirstBases() + this.getSecondBases()) * this.getHeight() / 2;
    }

    @Override
    public void draw() {
        System.out.println(" Figure: isosceles trapezoid, area: "
                + this.area() + "sq. units, first bases: "
                + this.getFirstBases() + " units, secondLeg: "
                + this.getSecondBases() + " units, color: " + getColor());
    }
}
