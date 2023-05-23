package core.basesyntax;

public class Rectangle extends Figure {
    private int firstLength;
    private int secondLength;

    public Rectangle(int firstLength, int secondLength, String color) {
        this.firstLength = firstLength;
        this.secondLength = secondLength;
        super.setColor(color);
    }

    @Override
    public double getArea() {
        return (double) firstLength * secondLength;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: rectangle, area: " + getArea()
                        + "sq.units, firstLeg: " + firstLength
                        + " units, secondLeg: " + secondLength
                        + " units, color: " + super.getColor()
        );
    }
}
