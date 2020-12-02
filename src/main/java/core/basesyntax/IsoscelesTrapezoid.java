package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topWigth;
    private int bottomWigth;
    private int side;

    public IsoscelesTrapezoid(int topWigth, int bottomWigth, int side, Color color) {
        super(color);
        this.bottomWigth = bottomWigth;
        this.topWigth = topWigth;
        this.side = side;
    }

    public int getSide() {
        return this.side;
    }

    @Override
    public double getArea() {
        return (this.topWigth + this.bottomWigth) / 2 * Math.sqrt(Math.pow(this.side,2)
                 - Math.pow(this.bottomWigth - this.topWigth, 2) / 4);
    }

    @Override
    public void draw() {
        System.out.println("Isosceles Trapezoid, area: " + getArea() + " sq.units, side length: "
                + getSide() + " units, color: " + getColor());
    }
}
