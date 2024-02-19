package core.basesyntax;

public class Square extends Figure {
    private double sideSize;

    public Square(String color, double sideSize) {
        super(color);
        this.sideSize = sideSize;
    }

    public double getSideSize() {
        return sideSize;
    }

    public void setSideSize(double sideSize) {
        this.sideSize = sideSize;
    }

    @Override
    public double calculateArea() {
        return sideSize * sideSize;
    }

    @Override
    public String draw() {
        return "Figure: Square, "
                + "area: " + calculateArea() + " sq. units, "
                + "side: " + getSideSize() + " units, "
                + "color: " + this.getColor();
    }
}
