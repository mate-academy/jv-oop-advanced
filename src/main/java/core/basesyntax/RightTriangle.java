package core.basesyntax;

import java.awt.*;

public class RightTriangle extends Figure{
    private double firstLeg;
    private double secondLeg;
    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }
}
