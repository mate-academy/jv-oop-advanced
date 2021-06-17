package core.basesyntax;

public class Square extends Figure {
    private double size;

    public Square(String color, double size) {
        super(color);
        this.size = size;
    }

    @Override
    public double getArea() {
        return size * size;
    }

    @Override
    public String getPrinting() {
        return "Square, area: " + getArea()
                + " sq. units, size " + size + " units, color: " + getColor();
    }
}
