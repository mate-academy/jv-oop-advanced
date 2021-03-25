package core.basesyntax;

public class Rectangle extends Figure {
    private double side1;
    private double side2;

    public Rectangle() {

    }

    public Rectangle(double side1, double side2, String color) {
        this.side1 = side1;
        this.side2 = side2;
        setColor(color);
        setFigureName("rectangle");
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }

    @Override
    public String drawFigure() {
        return "Figure: " + getFigureName() + ", area: " + getArea() + " sq. units"
                + ", first side: " + side1 + ", second side: " + side2
                + " units, color: " + getColor();
    }

    @Override
    public Figure getRandomFigure() {
        return new Rectangle((int)(Math.random() * 100),
                                  (int)(Math.random() * 100), ColorSupplier.randomColor());
    }

}
