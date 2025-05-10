package core.basesyntax;

public class Rectangle extends Figure {
    private double sideone;
    private double sidetwo;

    public Rectangle(double sideone, double sidetwo, String color) {
        super(color);
        this.sideone = sideone;
        this.sidetwo = sidetwo;
    }

    @Override
    public double getArea() {
        return sideone * sidetwo;
    }

    @Override
    public void draw() {
        System.out.println("Figure:Rectangle " + "Color:"
                + getColor() + " " + "Area: " + getArea() + " SideOne: "
                + sideone + " SideTwo: " + sidetwo);
    }
}
