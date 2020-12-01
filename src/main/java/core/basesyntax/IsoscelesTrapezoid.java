package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int side;
    private int topWidth;
    private int downWidth;
    private double height;
    private double diagonal;

    public IsoscelesTrapezoid(String color, int side, int topWidth, int downWidth) {
        super(color);
        this.side = side;
        this.topWidth = topWidth;
        this.downWidth = downWidth;
        draw();
    }

    @Override
    public void draw() {
        area = (topWidth + downWidth) * Math.sqrt(4 * (side * side)
                - (downWidth * downWidth - 2 * topWidth * downWidth + topWidth * topWidth)) / 4;
        diagonal = Math.sqrt(side * side + topWidth * downWidth);
        height = Math.sqrt(4 * (side * side) - (downWidth * downWidth - 2
                * topWidth * downWidth + topWidth * topWidth)) / 2;
    }

    @Override
    public String toString() {
        return "Figure: isosceles trapezoid, area: " + area + " sq. units, diagonal: "
                + diagonal + ", top width: " + topWidth + ", down width: " + downWidth
                + ", sides: " + side + ", height: " + height + ", color: " + color;
    }
}
