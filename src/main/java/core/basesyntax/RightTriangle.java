package core.basesyntax;

public class RightTriangle extends Figure {
    private int side;

    public RightTriangle(Colors color, int uniLength) {
        super(color);
        this.side = uniLength;
    }

    @Override
    public void obtainArea() {
        double area = (side * side) / 2;
        setArea(area);
    }

    @Override
    public String draw() {
        String figureInfo = "Figure: " + getName()
                + ", area: " + getArea()
                + " sq. units, side length: " + getSide()
                + " units, color: " + getColor();

        return figureInfo;
    }

    public int getSide() {
        return side;
    }
}
