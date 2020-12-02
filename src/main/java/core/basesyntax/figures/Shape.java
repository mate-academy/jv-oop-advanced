package core.basesyntax.figures;

import core.basesyntax.RandomNumber;

public abstract class Shape implements Figure {
    protected String color;

    public Shape() {
        this.color = Figure.generateColors().get(RandomNumber.getRandomNumber(3));
    }

}
