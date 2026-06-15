package core.basesyntax;

public class RightTriangle extends Figure{
    private Double legOne;
    private Double legTwo;

    public RightTriangle(String color, Double legOne, Double legTwo) {
        super(color);
        this.legOne = legOne;
        this.legTwo = legTwo;
    }
}
