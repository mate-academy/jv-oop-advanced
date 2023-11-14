package core.basesyntax;

public class RightTriangle extends Figure {
    private double line;
    private double height;

    public RightTriangle(String color, double line, double height) {
        super(color);
        this.line = line;
        this.height = height;
    }

    public double getLine() {
        return line;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return line * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle "
                + "area: " + getArea() + " sq. units, "
                + "length: " + line + " units, "
                + "height: " + height + " units, "
                + "color: " + getColor().toLowerCase());
    }
}
