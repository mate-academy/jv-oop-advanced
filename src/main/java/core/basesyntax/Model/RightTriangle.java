package core.basesyntax.Model;

public class RightTriangle extends Figures {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getMeasure() {
        return firstLeg * secondLeg;
    }

    @Override
    public void displayInfo() {
        System.out.println("Figure RightTriangle, measure: " + getMeasure()
                                                             + ", Color: " + getColor());
    }
}

