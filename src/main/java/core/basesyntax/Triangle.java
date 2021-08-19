package core.basesyntax;

public class Triangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public Triangle(int firstLeg, int secondLeg, Color color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public void draw() {
        System.out.println("I am " + getColor()
                + " triangle, my hypotenuse is "
                + String.format("%.2f", Math.sqrt(firstLeg * firstLeg + secondLeg * secondLeg))
                + " and my area is " + String.format("%.2f", getArea()));
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }
}
