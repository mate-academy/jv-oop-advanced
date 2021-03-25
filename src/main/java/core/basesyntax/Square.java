package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square() {

    }

    public Square(double side, String color) {
        this.side = side;
        setColor(color);
        setFigureName("square");
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String drawFigure() {
        return "Figure: " + getFigureName() + ", area: " + getArea() + " sq. units"
                + ", side: " + side + " units, color: " + getColor();
    }

    @Override
    public Figure getRandomFigure() {
        return new Square((int)(Math.random() * 100), ColorSupplier.randomColor());
    }
}
