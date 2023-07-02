package core.basesyntax.figures;

import core.basesyntax.behaviour.AreaCalculator;
import core.basesyntax.behaviour.Dwarable;

public abstract class Figure implements Dwarable, AreaCalculator {
    private final String color;
    private final String className = this.getClass().getSimpleName();

    public Figure(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.print("The " + className + " has color: " + color);
    }
}
