package core.basesyntax;

import java.util.Random;

public class Square implements Figure {
    private final int side = new Random().nextInt(15) + 1;

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public Color getColor() {
        return ColorProducer.getColor();
    }

    @Override
    public String getParametrInfo() {
        return "side length = " + side;
    }
}
