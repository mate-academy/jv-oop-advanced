package core.basesyntax.figures;

import core.basesyntax.Colors;
import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.Drawwable;

public abstract class Figure implements Drawwable, AreaCalculator {
    protected Colors color;

    public void setColor(Colors color) {
        this.color = color;
    }
}
