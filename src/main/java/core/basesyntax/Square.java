package core.basesyntax;

public class Square extends Figure {
    private int sideLength;

    public Square(Colors color, int uniLength) {
        super(color);
        this.sideLength = uniLength;
    }

    @Override
    public void obtainArea() {
        double area = Math.pow(sideLength, 2);
        setArea(area);
    }

    @Override
    public String draw() {
        String figureInfo = "Figure: " + getName()
                + ", area: " + getArea()
                + " sq. units, side length: " + getSideLength()
                + " units, color: " + getColor();

        return figureInfo;
    }

    public int getSideLength() {
        return sideLength;
    }
}
