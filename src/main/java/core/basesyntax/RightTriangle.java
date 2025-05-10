package core.basesyntax;

public class RightTriangle extends Figure {
    private double width;
    private double height;

    public RightTriangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (width * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle, area: "
                + getArea()
                + " sq.units, width: "
                + width + " height: "
                + height + " units, color: "
                + getColor().toString().toLowerCase());
    }
}
