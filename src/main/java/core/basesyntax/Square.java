package core.basesyntax;

public class Square extends Figure {
    private double firstLine;

    public Square(String name, Color color, double firstLine) {
        super(name, firstLine * firstLine, color);
        this.firstLine = firstLine;
    }

    public double findPerimeter() {
        return firstLine * 4;
    }

    @Override
    public void print() {
        System.out.println("   " + getName() + "   " + getArea()
                + "   " + getColor() + "   " + findPerimeter());
    }
}
