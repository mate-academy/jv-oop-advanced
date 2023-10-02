package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements FigureValues {
    private final double side1;
    private final double side2;
    private final double height;

    public IsoscelesTrapezoid(String color, double side1, double side2, double height) {
        super(color);
        this.figureType = "isosceles trapezoid";
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
        this.area = 0.5 * (side1 + side2) * height;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + figureType + ", area: " + area + " sq.units, side 1: "
                + side1 + ", side 2: " + side2 + ", height: " + height + ", color: " + color);
    }
}
