package core.basesyntax;

public class RightTriangle extends Figure{
    double firstLeg;
    double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() +
                " sq. units, firstLeg: " + firstLeg +
                " units, secondLeg: " + secondLeg +
                " units, color: " + color);
    }
}
