package core.basesyntax;

public class Square extends Figure implements AreaCalcualtor {
    private int width;

    public Square(String color, int width) {
        super(color);
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public double findArea() {
        return width * width;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure, square, area " + findArea() + "sq.units, "
                + "width: " + getWidth() + " units, " + " color: " + this.getColor());
    }
}
