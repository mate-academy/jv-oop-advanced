package core.basesyntax.figures;

import core.basesyntax.figures.behaviour.Drawable;
import core.basesyntax.figures.behaviour.State;

public class RightTriangle extends State implements Drawable {//Trójkąt Prostokątny
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public String draw() {
        return "Figure: RightTriangle, " +
                "firstLeg: " + firstLeg +
                ", secondLeg: " + secondLeg +
                ", color: " + color;
    }
}
