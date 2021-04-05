package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int lowerBase;
    private int upperBase;
    private int side;

    public IsoscelesTrapezoid(String name, String color, int lowerBase, int upperBase, int side) {
        super(name, color);
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
        this.side = side;
    }

    public int getLowerBase() {
        return lowerBase;
    }

    public int getUpperBase() {
        return upperBase;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * Math.sqrt(lowerBase * upperBase);
    }

    @Override
    public String draw() {
        return "Figure: " + getName() + ", area: " + getArea()
                + " sq. units, lower base length: " + getLowerBase() + " units, upper base length: "
                + getUpperBase() + " units, side length: " + getSide()
                + " units, color: " + getColor();
    }
}
