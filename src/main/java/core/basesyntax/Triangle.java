package core.basesyntax;

public class Triangle extends Figure {
    private double hypotenuse;

    public Triangle(double hypotenuse, String figureColor) {
        super("Triangle", figureColor);
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * hypotenuse * hypotenuse;
    }

    @Override
    public String drawFigure() {
        return "Figure: " + getFigureName() + ", area: " + getArea()
                + " sq. units, hypotenuse length: " + hypotenuse
                + "units, color: " + getFigureColor();
    }
}
