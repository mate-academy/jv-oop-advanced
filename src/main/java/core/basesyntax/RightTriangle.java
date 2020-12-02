package core.basesyntax;

public class RightTriangle extends Figure {
    private int legA;
    private int legB;

    public RightTriangle(Color color,int legA, int legB) {
        super(color);
        this.legA = legA;
        this.legB = legB;
    }

    @Override
    public double areaFigure() {
        return (legA * legB) / 2;
    }

    public double hypotenuse() {
        return Math.sqrt((legA * legA) + (legB * legB));
    }

    @Override
    public String drawn() {
        return "Figure: right triangle , area: " + areaFigure() + " sq. units, hypotenuse: "
                + hypotenuse() + " units, color: " + getColor();
    }
}
