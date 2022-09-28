package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void findArea() {
        if (getArea() == 0.0) {
            setArea(firstLeg * secondLeg * 0.5);
        } else {
            System.out.println("The area has been already calculated");
        }
    }

    @Override
    public String draw() {
        return "Figure: RightTriangle, "
                + "firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg
                + " units, area: " + getArea()
                + " sq.units, " + "color: " + getColor();
    }
}
