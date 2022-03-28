package core.basesyntax.figures;

import core.basesyntax.Colors;
import core.basesyntax.Figure;
import core.basesyntax.FigureArea;

public class Rectangle extends Figure implements FigureArea {
    private int oneSide;
    private int secondSide;

    public Rectangle(Colors color, int oneSide, int secondSide) {
        super(color);
        this.oneSide = oneSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return oneSide * secondSide;
    }

    @Override
    public void messageInfo() {
        System.out.println("Figure: rectangle, area: " + Math.rint(getArea())
                + " sq.units, one side: " + oneSide + " units, second side: " + secondSide
                + " units, color: " + getColor());
    }

    public int getOneSide() {
        return oneSide;
    }

    public void setOneSide(int oneSide) {
        this.oneSide = oneSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }
}
