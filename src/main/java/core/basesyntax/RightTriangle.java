package core.basesyntax;

public class RightTriangle extends Figure implements FigureInterface {

    public int firstLeg, secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public double calculateArea() {
        return (double) firstLeg * secondLeg / 2;
    }

    @Override
    public void drawInfo() {
        System.out.println("Figure: right triangle, area: " + calculateArea() +
                " sq.units, first leg: " + firstLeg + " units, second leg: " + secondLeg + " units, color: " + color);
    }
}
