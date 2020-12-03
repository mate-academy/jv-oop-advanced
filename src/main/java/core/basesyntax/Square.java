package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private int sizeSide = 0;

    private void setSideLength() {
        while (sizeSide < 5) {
            this.sizeSide = new Random().nextInt(50);
        }
    }

    @Override
    public String getName() {
        return "square";
    }

    @Override
    public double getArea() {
        setSideLength();
        return sizeSide * sizeSide;
    }

    @Override
    public void printUniqueParameters() {
        System.out.print("side length: " + sizeSide + " units,");
    }
}
