package core.basesyntax;

public class Rectangle extends Figure implements FigureValues {
    private final double side1;
    private final double side2;

    public Rectangle(String color, double side1, double side2) {
        super(color);
        this.figureType = "rectangle";
        this.side1 = side1;
        this.side2 = side2;
        this.area = side1 * side2;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + figureType + ", area: " + area + " sq.units, side1: "
                + side1 + ", side2: " + side2 + ", color: " + color);
    }
}
