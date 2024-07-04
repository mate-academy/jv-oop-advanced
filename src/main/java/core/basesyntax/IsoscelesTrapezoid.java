package core.basesyntax;

public class IsoscelesTrapezoid extends Figure{
    private int upperLeg;
    private int lowerLeg;
    private int firstEdge;
    private int secondEdge;

    public IsoscelesTrapezoid(String color, int upperLeg, int lowerLeg, int firstEdge, int secondEdge) {
        super(color);
        this.upperLeg = upperLeg;
        this.lowerLeg = lowerLeg;
        this.firstEdge = firstEdge;
        this.secondEdge = secondEdge;
    }
}
