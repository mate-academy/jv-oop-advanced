package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topSide;
    private int downSide;
    private int side;
    private double height;

    public IsoscelesTrapezoid(Colour colour, int topSide, int downSide, int side) {
        super(colour);
        this.topSide = topSide;
        this.downSide = downSide;
        this.height = (2 * calculateArea()) / (topSide + downSide);
        this.perimeter = 2 * side + topSide + downSide;
    }

    @Override
    public double calculateArea() {
        return (topSide + downSide) * (downSide - topSide) * Math.tan(Math.PI / 4) / 4;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + calculateArea()
                + " sq.units, top side: " + getTopSide() + ", down side: "
                + getDownSide() + ", perimeter: " + getPerimeter() + ", height: "
                + height + ", colour: " + getColour());
    }

    public int getTopSide() {
        return topSide;
    }

    public int getDownSide() {
        return downSide;
    }

    public int getSide() {
        return side;
    }
}

