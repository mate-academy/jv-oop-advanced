package core.basesyntax;

public class RightTriangle extends Figure {

    private String color;
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        this.color = color;
        if (firstLeg <= 0 || secondLeg <= 0) {
            System.out.println("Some of parameters is less than one");
            return;
        }
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (double) (firstLeg * secondLeg) / 2;
    }

    @Override
    public String draw() {
        return "Figure: "
                + "right triangle, "
                + "area: " + getArea() + " sq. units, "
                + "firstLeg: " + firstLeg + " units, "
                + "secondLeg: " + secondLeg + " units, "
                + "color: " + color;
    }

}
