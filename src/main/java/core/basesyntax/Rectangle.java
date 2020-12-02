package core.basesyntax;

import java.util.Random;

public class Rectangle implements Figure {
    private final int sideA = new Random().nextInt(15) + 1;
    private final int sideB = new Random().nextInt(15) + 1;

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public Color getColor() {
        return ColorProducer.getColor();
    }

    @Override
    public String getParametrInfo() {
        return "side A = " + sideA + ", B = " + sideB;
    }
}
