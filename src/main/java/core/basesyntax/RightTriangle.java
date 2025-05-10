package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, first leg: " + firstLeg + ", second leg: "
                + secondLeg + ", hypotenuse: " + getHypotenuse() + ", area: "
                + this.getArea() + "color: " + getColor());
    }

    private double getHypotenuse() {
        return Math.sqrt(Math.pow(firstLeg, 2) + Math.pow(secondLeg, 2));
    }
}
