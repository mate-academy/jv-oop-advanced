package core.basesyntax.figures;

import core.basesyntax.figures.behaviour.Drawable;
import core.basesyntax.figures.behaviour.State;

public class IsoscelesTrapezoid extends State implements Drawable {//Trapez równoramienny
    private int upSide;
    private int downSide;
    private int height;

    public IsoscelesTrapezoid(String color, int upSide, int downSide, int height) {
        super(color);
        this.upSide = upSide;
        this.downSide = downSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((upSide + downSide) * height) / 2;
    }

    @Override
    public String draw() {
        return "Figure: IsoscelesTrapezoid, " +
                "upSide: " + upSide +
                ", downSide: " + downSide +
                ", height: " + height +
                ", color: " + color;
    }
}
