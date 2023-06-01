package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int side, int height, Color color) {
        this.firstLeg = side;
        this.secondLeg = height;
        this.color = color;
        this.figureType = FigureType.RIGHTTRIANGLE;
    }

    @Override
    public double getArea() {
        return this.secondLeg * this.firstLeg * 0.5;
    }

    @Override
    public void getFigureInfo() {
        //Figure: square, area: 25.0 sq.units, side: 5 units, color: blue
        System.out.println("Figure: " + this.figureType + ", area: "
                + this.getArea() + " sq.units, firstLeg: " + this.firstLeg + " units, secondLeg: "
                + this.secondLeg + " units, color: " + this.color);
    }
}
