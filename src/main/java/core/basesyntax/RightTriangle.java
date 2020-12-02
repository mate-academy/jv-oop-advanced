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
    public double findAreaFigure() {
        return (legA * legB) / 2;
    }

    public double findHypotenuse() {
        return Math.sqrt((legA * legA) + (legB * legB));
    }

    @Override
    public String draw() {
        return "Figure: right triangle , area: " + findAreaFigure() + " sq. units, hypotenuse: "
                + findHypotenuse() + " units, color: " + getColor();
    }
}
