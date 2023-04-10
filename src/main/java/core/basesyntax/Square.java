package core.basesyntax;

public class Square implements Figure{

    private double leg;

    private String color;

    public Square(String color, double leg) {
        this.color = color;
        this.leg = leg;
    }
    public double getLeg() {
        return leg;
    }

    @Override
    public double getArea() {
        return leg * leg;
    }
    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, leg: " + leg + " units, color: " + color);
    }
}
