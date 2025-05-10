package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double area() {
        return (Math.pow(firstLeg, 2) * Math.sqrt(3.0)) / 4;
    }

    @Override
    public void print() {
        System.out.println("Right triangle color " + getColor()
                            + " first leg length " + firstLeg
                            + " second leg length " + secondLeg
                            + " area " + area());
    }
}
