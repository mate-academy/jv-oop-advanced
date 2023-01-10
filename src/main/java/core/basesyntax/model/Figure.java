package core.basesyntax.model;

import core.basesyntax.service.AreaCalculator;
import core.basesyntax.service.FigurePainter;
import java.util.Random;

public abstract class Figure implements AreaCalculator, FigurePainter {
    private String color;
    private Random random = new Random();
    private StringBuilder stringBuilder = new StringBuilder();

    public Figure() {

    }

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    public void setStringBuilder(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void draw() {
    }

    @Override
    public double getArea() {
        return 0;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }
}
