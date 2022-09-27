package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;
    private double area;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void findArea() {
        if (area == 0.0) {
            area = firstLeg * secondLeg * 0.5;
        } else {
            System.out.println("The area has been already calculated");
        }
    }

    @Override
    public String draw() {
        return "Figure: RightTriangle, "
                + "firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg
                + " units, area: " + area
                + " sq.units, " + "color: " + getColor();
    }
}
