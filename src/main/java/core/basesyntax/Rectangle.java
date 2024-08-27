package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public Figure createRandomFigure() {
        return new Rectangle(getRandomInt(), getRandomInt());
    }

    @Override
    public void printInformation() {
        System.out.println("Rectangle length: " + length + ", width: " + width
                + " area: " + (width * length) + " Color " + getColor());
    }
}
