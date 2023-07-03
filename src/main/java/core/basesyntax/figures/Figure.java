package core.basesyntax.figures;

import core.basesyntax.behaviour.AreaCalculator;
import core.basesyntax.behaviour.Dwarable;
import core.basesyntax.constants.ColorName;

public abstract class Figure implements Dwarable, AreaCalculator {
    private final ColorName color;
    private final String className = this.getClass().getSimpleName();

    public Figure(ColorName color) {
        this.color = color;
    }

    public void draw() {
        System.out.print("The " + className + " has color: " + color);
    }
}
