package core.basesyntax.model;

public class RightTriangle extends Figure {
    private double leg;
    private double height;

    public RightTriangle(String color, double leg, double height) {
        super(color);
        this.leg = leg;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getLengthLeg() {
        return leg;
    }

    @Override
    public double calculateArea() {
        return leg * height / 2;
    }

    @Override
    public void draw() {
        new StringBuilder().append("Figure: Right_triangle, area: ")
                .append(calculateArea())
                .append(" sq.units, side: ")
                .append(getLengthLeg())
                .append(" units, height: ")
                .append(getHeight())
                .append(", color: ")
                .append(getColor());
    }
}
