package core.basesyntax;

public class Square extends Figure {
    private double firstLeg;


    public Square(double firstLeg, Color color) {
        super(color);
        this.firstLeg = firstLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * 0.01;
    }


    @Override
    public String draw() {
        return "Figure: Square, " + "square=" + getArea() +", firstLeg=" + firstLeg
                + ", color=" + getColor() + '.';
    }
}

