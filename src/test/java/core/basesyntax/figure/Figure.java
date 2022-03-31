package core.basesyntax.figure;

import core.basesyntax.figure.interfaces.AreaCalculator;
import core.basesyntax.figure.interfaces.FigureDrawer;

public abstract class Figure implements AreaCalculator, FigureDrawer {
    public String color;
    public String name;

    public abstract void getDraw();

    public abstract void setRandomParameter();

}
