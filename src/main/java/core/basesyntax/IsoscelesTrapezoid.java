package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideone;
    private double sidetwo;
    private double sidethree;

    public IsoscelesTrapezoid(double sideone, double sidetwo, double sidethree, String color) {
        super(color);
        this.sideone = sideone;
        this.sidetwo = sidetwo;
        this.sidethree = sidethree;
    }

    @Override
    public double getArea() {
        return ((sideone + sidetwo) / 2) * sidethree;
    }

    @Override
    public void draw() {
        System.out.println("Figure:IsoscelesTrapezoid "
                + "Color:" + getColor()
                + " " + "Area: " + getArea());
    }

    public void setSideOne(double sideOne) {
        sideone = sideOne;
    }

    public void setSideTwo(double sideTwo) {
        sidetwo = sideTwo;
    }

    public void setSideThree(double sideThree) {
        sidethree = sideThree;
    }

    public double getSideOne() {
        return sideone;
    }

    public double getSideTwo() {
        return sidetwo;
    }

    public double getSideThree() {
        return sidethree;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }
}
