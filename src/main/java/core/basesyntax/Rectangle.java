package core.basesyntax;

public class Rectangle extends Figure  implements AreaFigure{
    float firstLeg = 5;
    float secondLeg = 4;

    public Rectangle() {}
    public Rectangle(float firstLeg, float secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public float area() {
        return firstLeg * secondLeg;
    }

    public String toString() {
        return "Figure: rectangle, area: " + area()
                + " sq.units, firstLeg: " + firstLeg
                + " sq.units, secondLeg: " + secondLeg
                + " units, color: " + color;
    }
}
