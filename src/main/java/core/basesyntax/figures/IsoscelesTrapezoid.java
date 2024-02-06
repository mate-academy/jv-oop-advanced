package core.basesyntax.figures;

import core.basesyntax.temp.Figure;

public class IsoscelesTrapezoid extends Figure {

    @Override
    public void calculatingSquare() {
        setBasisA(getFields()[2]);
        setBasisB(getFields()[3]);
        setHeight(getFields()[4]);
        setFigureArea((getBasisA() + getBasisB()) / 2 * getHeight());
    }

    @Override
    public String toString() {
        return "Isosceles trapezoid, area: " + getFigureArea() + ", basisA: " + getBasisA()
               + ", basisB: " + getBasisB() + ", height: " + getHeight() + ", color: " + getColor();
    }
}
