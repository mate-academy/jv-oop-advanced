package core.basesyntax;

public class Triangle extends Figure {
    private double hypotenuse;

    public Triangle(double hypotenuse, String color) {
        super(color, "triangle");
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * hypotenuse * hypotenuse;
    }

    @Override
    public String drawFigure() {
        return "Figure: " + getFigureName() + ", area: " + getArea() + " sq. units"
                + ", hypotenuse: " + hypotenuse + " units, color: " + getColor();
    }
}
