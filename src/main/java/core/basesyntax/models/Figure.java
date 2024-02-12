package core.basesyntax.models;

import core.basesyntax.interfaces.FigureBehavior;
import java.util.Random;

public abstract class Figure implements FigureBehavior {
    public static final Random RANDOM = new Random();
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    abstract double getArea();
}
