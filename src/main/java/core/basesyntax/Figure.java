package core.basesyntax;

import core.basesyntax.interfaces.AreaCounter;
import core.basesyntax.interfaces.Drawable;

public abstract class Figure implements Drawable, AreaCounter {
    public abstract String draw();

    public abstract double area();

}
