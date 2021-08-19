package core.basesyntax;

public class RightTriangle extends Figure {
    private int firsLeg;
    private int secondLeg;

    public RightTriangle(String color, int firsLeg, int secondLeg) {
        super.setColor(color);
        super.setName("right triangle");
        this.firsLeg = firsLeg;
        this.secondLeg = secondLeg;
    }

    public int getFirsLeg() {
        return firsLeg;
    }

    public void setFirsLeg(int firsLeg) {
        this.firsLeg = firsLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firsLeg * secondLeg / 2.0;
    }

    @Override
    public void drow() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq.units, "
                    + "firstLeg: " + firsLeg + " units, " + "secondLeg: "
                    + secondLeg + " units, " + "color: " + getColor());
    }
}
