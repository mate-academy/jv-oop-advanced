package core.basesyntax;

public class Square extends Figure {
    private double size;

    public Square(String color, double size) {
        super(color);
        this.size = size;
    }

    @Override
    public double calculateArea() {
        return size * size;
    }

    @Override
    public void printer() {
        System.out.println("Figure: square, area: "
                + calculateArea()
                + " sq.units, side: "
                + size
                + " units, color: "
                + color);
    }
}
