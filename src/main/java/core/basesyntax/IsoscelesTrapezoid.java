package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double side;

    public IsoscelesTrapezoid(String color, double firstBase, double secondBase, double side) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.side = side;
    }

    public double getFirstBase() {
        return firstBase;
    }

    public void setFirstBase(double firstBase) {
        this.firstBase = firstBase;
    }

    public double getSecondBase() {
        return secondBase;
    }

    public void setSecondBase(double secondBase) {
        this.secondBase = secondBase;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        if (secondBase >= firstBase) {
            return ((firstBase + secondBase) / 4) * Math.sqrt(4 * (side * side)
                    - Math.pow(((firstBase - secondBase)), 2));
        } else {
            return ((firstBase + secondBase) / 4) * Math.sqrt(4 * (side * side)
                    - Math.pow(((secondBase - firstBase)), 2));
        }
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid"
                + ", firstBase = " + firstBase + " units"
                + ", secondBase = " + secondBase + " units"
                + ", side = " + side + " units"
                + ", area = " + getArea() + " units"
                + ", color = " + getColor());
    }
}
