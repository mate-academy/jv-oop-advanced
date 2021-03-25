package core.basesyntax;

public class Triangle extends Figure {
    private double hypotenuse;

    public Triangle() {

    }

    public Triangle(double hypotenuse, String color) {
        this.hypotenuse = hypotenuse;
        setColor(color);
        setFigureName("triangle");
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

    @Override
    public Figure getRandomFigure() {
        return new Triangle((int)(Math.random() * 100), ColorSupplier.randomColor());
    }
}
