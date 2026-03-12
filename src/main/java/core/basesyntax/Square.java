package core.basesyntax;

public class Square extends Figure {
    private double side;

    Square(double side) {
        this.side = side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public double area() {
        return side*side;
    }
    @Override
    public String getSpecificProperties() {
        return "side: " + side;
    }
}
