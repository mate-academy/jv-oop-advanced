package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure {
    private int length = 0;
    private int width = 0;

    private void setData() {
        while (width < 5) {
            this.width = new Random().nextInt(100);
        }
        while (length < width) {
            this.width = new Random().nextInt(100);
        }
    }

    @Override
    public String getName() {
        return "rectangle";
    }

    @Override
    public double getArea() {
        setData();
        return length * width;
    }

    @Override
    public void printUniqueParameters() {
        System.out.print("diagonal: "
                + (double) Math.sqrt(Math.pow(length, 2) * Math.pow(width, 2)) + " units,");
    }
}
