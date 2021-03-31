package core.basesyntax;

public class Triangle extends Figure implements Shape {
    private int firstLeg;
    private int secondLeg;

    public Triangle(int firstLeg, int secondLeg, Color color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    void draw() {
        System.out.println("I am " + color.toString().toLowerCase()
                + " triangle, my hypotenuse is "
                + String.format("%.2f", Math.sqrt(firstLeg * firstLeg + secondLeg * secondLeg))
                + " and my area is " + String.format("%.2f", getArea()));
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }
}
