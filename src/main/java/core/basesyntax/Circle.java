package core.basesyntax;

public class Circle extends Figure {
    private double randomRadius;

    Circle(String color, double randomRadius) {
        super(color);
        this.randomRadius = randomRadius;
    }

    @Override
        String printFigureType() {
        return "Figure: circle,";
    }

    @Override
    public double printArea() {
        return Math.PI * randomRadius * randomRadius;
    }

    @Override
    public void draw() {
        System.out.println(printFigureType()
                + " area: "
                + printArea()
                + " sq.units, radius: "
                + randomRadius
                + " units, color: "
                + getColor());
    }
}
