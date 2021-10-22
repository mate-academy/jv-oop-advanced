package core.basesyntax;

public class Rectangle extends Figure {
    private float firstLeg;
    private float secondLeg;

    public Rectangle(float firstLeg, float secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public float getArea() {
        return firstLeg * secondLeg;
    }

    public String draw() {
        return "Figure: rectangle, area: " + getArea()
                + " sq.units, firstLeg: " + firstLeg
                + " sq.units, secondLeg: " + secondLeg
                + " units, color: " + getColor();
    }
}
