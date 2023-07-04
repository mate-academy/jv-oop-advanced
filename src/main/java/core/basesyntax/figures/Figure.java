package core.basesyntax.figures;

import core.basesyntax.behaviour.AreaCalculator;
import core.basesyntax.behaviour.Dwarable;
import core.basesyntax.constants.ColorName;

public abstract class Figure implements Dwarable, AreaCalculator {
    private final ColorName color;

    public Figure(ColorName color) {
        this.color = color;
    }

    public void draw() {
        String className = this.getClass().getSimpleName();
        System.out.print("The " + className + " has color: " + color);
    }
}
