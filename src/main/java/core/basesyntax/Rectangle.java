package core.basesyntax;

public class Rectangle extends Figure {

    private double firstLeg;
    private double secondLeg;
    private double thirdLeg;

    public Rectangle(String color, double firstLeg, double secondLeg, double thirdLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.thirdLeg = thirdLeg;
    }
}
