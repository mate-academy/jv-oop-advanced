package core.basesyntax;

public class Rhombus extends Figure {
    private double angle;
    private double side;

    public Rhombus(double angle, double side, String color) {
        super(color);
        this.angle = angle;
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.ceil(side * side
                * Math.sin(Math.toRadians(angle)) * 10) / 10;
    }

    @Override
    public void draw() {
        System.out.println(" Figure: rhombus"
                + ", area: " + calculateArea()
                + " sq.units, side: " + side
                + " units, angle: " + angle
                + " units, color: " + getColor());
    }

}
