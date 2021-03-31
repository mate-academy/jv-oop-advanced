package core.basesyntax;

public class Triangle extends Figure {
    private double hypotenuse;

    public Triangle(double hypotenuse, String color) {
        super("Triangle", color);
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * hypotenuse * hypotenuse;
    }

    @Override
    public String draw() {
        return "Figure: " + getFigureName() + ", area: " + getArea()
                + " sq. units, hypotenuse length: " + hypotenuse
                + "units, color: " + getFigureColor();
    }
}
