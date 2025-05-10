package core.basesyntax;

public class Rectangle extends Figure {
    private double fistside;
    private double secondside;

    public Rectangle(double fistside, double secondSide, String color) {
        this.fistside = fistside;
        this.secondside = secondside;
        super.color = color;
    }

    @Override
    public double getArea() {
        return this.fistside * this.secondside;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: Rectangle, Area: " + this.getArea() + "Sides: "
                + this.fistside + ";" + this.secondside + " color:" + super.color);
    }
}
