package core.basesyntax;

public class Square extends Figure implements AreaCalculator, Drawing {
    private double side;
    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public double getArea() {
        return side * side;
    }
    @Override
    public void draw() {
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", color='" + color + '\'' +
                '}';
    }
}
