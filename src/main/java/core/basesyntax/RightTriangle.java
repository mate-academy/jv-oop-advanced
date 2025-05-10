package core.basesyntax;

public class RightTriangle extends Figure {
    private double sideone;
    private double sidetwo;

    public RightTriangle(double sideone, double sidetwo, String color) {
        super(color);
        this.sideone = sideone;
        this.sidetwo = sidetwo;
    }

    @Override
    public double getArea() {
        return (sideone * sidetwo) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure:RightTriangle "
                + "Color:" + getColor()
                + " " + "Area: " + getArea() + " SideOne: "
                + sideone + " SideTwo: " + sidetwo);
    }
}
