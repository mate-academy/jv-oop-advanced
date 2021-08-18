package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculator, InfoFigure {
    private final String name = "right triangle";
    private int firstLeg;
    private int secondLeg;


    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return this.firstLeg * this.secondLeg * 0.5;
    }

    @Override
    public void draw() {
        System.out.println(this.name + ", area: "
                + getArea() + " sq.units, "
                + this.firstLeg + " units, "
                + this.secondLeg + " units, "
        );
    }
}
