package core.basesyntax.model;

public class RightTriangle extends Figure {
    private double lengthLeg;
    private double height;
    private ColorSupplier colorRightTriangle = new ColorSupplier();

    public RightTriangle(String color, double lengthLeg, double height) {
        super(color);
        this.lengthLeg = lengthLeg;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getLengthLeg() {
        return lengthLeg;
    }

    public ColorSupplier getColorRightTriangle() {
        return colorRightTriangle;
    }

    @Override
    public double CalculateArea() {
        return lengthLeg * height;
    }

    @Override
    public void draw() {
        new StringBuilder().append("Figure: Right_triangle, area: ")
                .append(CalculateArea())
                .append(" sq.units, side: ")
                .append(getLengthLeg())
                .append(" units, height: ")
                .append(getHeight())
                .append(", color: ")
                .append(getColorRightTriangle().getRandomColor());
    }
}
