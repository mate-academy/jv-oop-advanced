package core.basesyntax;

public class RightTriangle extends Figure implements GetArea {
    private int oppositeSide;
    private int adjacentSide;

    public RightTriangle(int oppositeSide, int adjacentSide, Colour colour) {
        super(colour);
        this.oppositeSide = oppositeSide;
        this.adjacentSide = adjacentSide;
    }

    public double getHipotenuse() {
        return (Math.sqrt(oppositeSide * oppositeSide + adjacentSide * adjacentSide));
    }

    @Override
    public double getArea() {
        return (oppositeSide * adjacentSide / 2);
    }

    @Override
    public void getDraw() {
        System.out.println("Right triangle, area: " + getArea() + " square units, hipotenuse: "
                + getHipotenuse() + " units, color: " + getColour());
    }
}
