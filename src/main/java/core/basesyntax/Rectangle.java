package core.basesyntax;

public class Rectangle extends Figure {
    private double firstLine;
    private double secondLine;

    public Rectangle(String name, Color color, double firstLine, double secondLine) {
        super(name, firstLine * secondLine, color);
        this.firstLine = firstLine;
        this.secondLine = secondLine;
    }

    public double differenceBetweenLines() {
        return this.firstLine - this.secondLine;
    }

    @Override
    public void print() {
        System.out.println("   " + getName() + "   " + getArea()
                + "   " + getColor() + "  " + differenceBetweenLines());
    }
}
