package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double SideOne;
    private double SideTwo;
    private double SideThree;

    public IsoscelesTrapezoid(double SideOne, double SideTwo, double SideThree, String color) {
        super(color);
        this.SideOne = SideOne;
        this.SideTwo = SideTwo;
        this.SideThree = SideThree;
    }

    @Override
    public double getArea() {
        return ((SideOne + SideTwo) / 2) * SideThree;
    }

    @Override
    public void draw() {
        System.out.println("Figure:IsoscelesTrapezoid "
                + "Color:" + getColor()
                + " " + "Area: " + getArea());
    }
}
