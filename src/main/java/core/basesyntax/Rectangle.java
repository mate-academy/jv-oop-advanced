package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateFigureArea() {
        return width * length;
    }

    @Override
    public void printInformation() {
        System.out.println("Rectangle length: " + length + ", width: " + width
                + " area: " + calculateFigureArea() + " Color " + getColor());
    }
}
