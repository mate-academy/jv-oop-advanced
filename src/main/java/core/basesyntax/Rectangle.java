package core.basesyntax;
//прямоугольник (2 стороны)
public class Rectangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public Rectangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }
}
