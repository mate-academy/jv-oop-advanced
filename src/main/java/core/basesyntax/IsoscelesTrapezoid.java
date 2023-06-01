package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int height;

    public IsoscelesTrapezoid(int firstBase, int secondBase, int height, Color color) {
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.color = color;
        this.figureType = FigureType.ISOSCELESTRAPEZOID;
    }

    @Override
    public double getArea() {
        return (this.secondBase + this.firstBase) * 0.5 * this.height;
    }

    @Override
    public void getFigureInfo() {
        //Figure: square, area: 25.0 sq.units, side: 5 units, color: blue
        System.out.println("Figure: " + this.figureType + ", area: "
                + this.getArea() + " sq.units, firstBase: " + this.firstBase
                + " units, secondLeg: " + this.secondBase + " units, height: "
                + this.height + " units, color: " + this.color);
    }
}
