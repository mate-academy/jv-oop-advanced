package core.basesyntax;

public class RightTriangle extends Figure {

    private double side;
    private double base;

    public RightTriangle(double side, double base, String color) {
        super(color);
        this.side = side;
        this.base = base;
    }

    @Override
    public double getArea() {
        return (side + base) / 2;
    }

    public double getHypotenuse() {
        return Math.round(Math.hypot(base, side));
    }

    @Override
    public void draw() {
        System.out.println(getClass().getSimpleName() + ", area : " + getArea()
                + " sq. units, " + "Its' hypotenuse is " + getHypotenuse()
                + " units , color: " + getColor().toLowerCase());
    }

}
