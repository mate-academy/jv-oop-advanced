package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figures {
    private double lengthSize1;
    private double lengthSize2;
    private double lengthSize3;

    public IsoscelesTrapezoid(String color,
                              double lengthSize1,
                              double lengthSize2,
                              double lengthSize3) {
        super(color);
        this.lengthSize1 = lengthSize1;
        this.lengthSize2 = lengthSize2;
        this.lengthSize3 = lengthSize3;
    }

    public double getLengthSize1() {
        return lengthSize1;
    }

    public void setLengthSize1(double lengthSize1) {
        this.lengthSize1 = lengthSize1;
    }

    public double getLengthSize2() {
        return lengthSize2;
    }

    public void setLengthSize2(double lengthSize2) {
        this.lengthSize2 = lengthSize2;
    }

    public double getLengthSize3() {
        return lengthSize3;
    }

    public void setLengthSize3(double lengthSize3) {
        this.lengthSize3 = lengthSize3;
    }

    @Override
    public double getMeasure() {
        return ((lengthSize1 + lengthSize2) / 2) * lengthSize3;
    }

    @Override
    public void displayInfo() {
        System.out.println("Figure IsoscelesTrapezoid, measure: " + getMeasure()
                + ", Color: " + getColor());
    }
}


