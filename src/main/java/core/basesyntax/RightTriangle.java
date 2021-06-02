package core.basesyntax;

public class RightTriangle extends Figure implements GetArea {

    private double side;
    private double height;

    public RightTriangle(double side, double height) {
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
