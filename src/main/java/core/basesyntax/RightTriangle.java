package core.basesyntax;

public class RightTriangle extends Figure {

    private double side;
    private double height;

    public RightTriangle(double side, double height, String color) {
        super(color);
        this.side = side;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * side * height;
    }

    @Override
    public String draw() {
        return "Figure : Right Triangle, area : "
                + getArea()
                + ", side : "
                + side
                + ", height : "
                + height
                + ", color : "
                + super.getColor();
    }
}
