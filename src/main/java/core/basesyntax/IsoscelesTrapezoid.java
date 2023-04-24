package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double randomUpperBase;
    private double randomLowerBase;
    private double randomHeight;

    IsoscelesTrapezoid(String color, double randomBase, double randomHeight) {
        super(color);
        randomUpperBase = randomBase;
        randomLowerBase = randomBase;
        this.randomHeight = randomHeight;
    }

    @Override
    String printFigureType() {
        return "Figure: trapezoid";
    }

    @Override
    public double printArea() {
        return (randomLowerBase + randomUpperBase) * randomHeight / 2;
    }

    @Override
    public void draw() {
        System.out.println(printFigureType()
                + ", area: "
                + printArea()
                + " sq.units, upperBase: "
                + randomUpperBase
                + " units, lowerBase: "
                + randomLowerBase
                + " units, height: "
                + randomHeight
                + ", color: "
                + getColor());
    }
}
