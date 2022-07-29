package core.basesyntax;

public class Square extends Figure {
    private double firstLeg;
    private double secondLeg;

    public Square(double firstLeg, double secondLeg, Color color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }
}

