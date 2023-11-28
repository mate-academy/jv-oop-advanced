package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure : rightTriangle, area: " + calculateArea() + " sq.units, "
                + "firstLeg: " + firstLeg + " units, " + "secondLeg: " + secondLeg + " units, "
                + "color: " + color);
    }

    @Override
    public double calculateArea() {
        int result = (firstLeg * firstLeg) + (secondLeg * secondLeg);
        return (int) Math.sqrt(result);
    }
}

