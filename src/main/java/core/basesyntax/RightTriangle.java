package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLine;
    private double secondLine;

    public RightTriangle(String name, Color color,
                         double firstLine, double secondLine) {
        super(name, (firstLine * secondLine) / 2, color);
        this.firstLine = firstLine;
        this.secondLine = secondLine;
    }

    public double findHypotenuse() {
        return Math.sqrt(Math.pow(firstLine, 2) + Math.pow(secondLine, 2));
    }

    @Override
    public void print() {
        System.out.println("   " + getName() + "   " + getArea()
                + "   " + getColor() + "   " + findHypotenuse());
    }
}
