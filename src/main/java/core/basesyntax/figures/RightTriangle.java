package core.basesyntax.figures;

public class RightTriangle extends AbstractFigure {
    private int firstLeg;
    private int secondLeg;
    private String color;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        setFirstLeg(firstLeg);
        setSecondLeg(secondLeg);
        this.color = color;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    @Override
    public String color() {
        return color;
    }

    @Override
    public String getSize() {
        return "firstLeg: " + getFirstLeg() + " units, " + "secondLeg: "
                + getSecondLeg() + " units, ";
    }

    @Override
    public double area() {
        return (double) (firstLeg * secondLeg) / 2;
    }
}
