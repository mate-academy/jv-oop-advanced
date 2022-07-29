package core.basesyntax;

public class Square extends Figure {
    private double firstLeg;


    public Square(Color color, double firstLeg) {
        super(color);
        this.firstLeg = firstLeg;
    }

    @Override
    public double getArea() {
        return firstLeg;
    }


    @Override
    public String draw() {
        return "Figure: Square, " + "square=" + getArea() +"sq.units, firstLeg=" + firstLeg
                + "units, color=" + getColor() + '.';
    }
}

