package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int edge;
    private int upperBase;
    private int lowerBase;

    public IsoscelesTrapezoid(String color, int edge, int upperBase, int lowerBase) {
        super(color);
        this.edge = edge;
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
    }

    public int getEdge() {
        return edge;
    }

    public void setEdge(int edge) {
        this.edge = edge;
    }

    public int getUpperBase() {
        return upperBase;
    }

    public void setUpperBase(int upperBase) {
        this.upperBase = upperBase;
    }

    public int getLowerBase() {
        return lowerBase;
    }

    public void setLowerBase(int lowerBase) {
        this.lowerBase = lowerBase;
    }

    @Override
    public double getArea() {
        return ((getUpperBase() + getLowerBase() / 2) * Math.sqrt((getEdge() * getEdge())
                - ((getLowerBase() - getUpperBase()) * (getLowerBase() - getUpperBase()) / 4)));
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, area: " + getArea() + " sq.units,"
                + " edge: " + getEdge() + " units, "
                + " lowerBase: " + getLowerBase() + " units, " + " upperBase: "
                + getUpperBase() + " units, " + "color: " + getColor());
        ;
    }
}
