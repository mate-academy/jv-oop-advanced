package core.basesyntax;

public class Square extends Figure {
    private double line;

    public Square(String color, double line) {
        super(color);
        this.line = line;
    }

    public double getLine() {
        return line;
    }

    @Override
    public double getArea() {
        return Math.pow(line, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, "
                + "area " + getArea() + " sq. units, "
                + "side: " + line + " Color " + getColor().toLowerCase());
    }
}
