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
                + " " + "Area: " + getArea() + " SideOne: "
                + sideone + " SideTwo: " + sidetwo + " SideThree: " + sidethree);
    }
}
