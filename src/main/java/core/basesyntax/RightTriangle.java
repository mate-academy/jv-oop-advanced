package core.basesyntax;

public class RightTriangle extends Figure{
    private String color;
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, String color1, int firstLeg, int secondLeg) {
        super(color);
        this.color = color1;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }
}
