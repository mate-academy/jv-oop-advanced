package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int side;
    private int topWidth;
    private int downWidth;
    private double height;
    private double diagonal;

    public IsoscelesTrapezoid(Color color, int side, int topWidth, int downWidth) {
        super(color);
        this.side = side;
        this.topWidth = topWidth;
        this.downWidth = downWidth;
        calculate();
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, diagonal: " + diagonal + ", top width: "
                + topWidth + ", down width: " + downWidth
                + ", sides: " + side + ", height: " + height + ", color: " + getColor());
    }

    @Override
    public void calculate() {
        setArea((topWidth + downWidth) * Math.sqrt(4 * (side * side)
                - (downWidth * downWidth - 2 * topWidth * downWidth + topWidth * topWidth)) / 4);
        diagonal = Math.sqrt(side * side + topWidth * downWidth);
        height = Math.sqrt(4 * (side * side) - (downWidth * downWidth - 2
                * topWidth * downWidth + topWidth * topWidth)) / 2;
    }

    public int getSide() {
        return side;
    }

    public int getTopWidth() {
        return topWidth;
    }

    public int getDownWidth() {
        return downWidth;
    }

    public double getHeight() {
        return height;
    }

    public double getDiagonal() {
        return diagonal;
    }
}
