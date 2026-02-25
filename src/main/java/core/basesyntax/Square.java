package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(double side, String color) {
        this.setColor(color);
        this.side = side;
    }

    @Override
    public double calcArea() {
        return this.side * this.side;
    }

    @Override
    public void draw() {
        System.out.println("Figure : isosceles trapezoid, "
                + "area: " + calcArea() + " sq. units, "
                + "side :" + side + " units, "
                + "color : " + getColor());
    }
}
