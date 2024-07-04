package core.basesyntax;

public class RightTriangle extends Figure{
    private int firstLeg;
    private int secondLeg;
    private int hypotenuse;

    public RightTriangle(String color, int firstLeg, int secondLeg, int hypotenuse) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.hypotenuse = hypotenuse;
    }
}
