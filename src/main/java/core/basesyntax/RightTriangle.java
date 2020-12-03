package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure {
    private int size = 0;
    private int base;
    private double height;

    private void setData() {
        while (base < 20) {
            this.base = new Random().nextInt(50);
        }
        while (size < base / 2) {
            this.size = new Random().nextInt(75);
        }
        this.height = (double) Math.sqrt(Math.pow(size, 2) - Math.pow(base, 2) / 4);
    }

    @Override
    public String getName() {
        return "rightTriangle";
    }

    @Override
    public double getArea() {
        setData();
        return height * base / 2;
    }

    @Override
    public void printUniqueParameters() {
        System.out.print("bisector: " + String.format("%.1f", height) + " units,");
    }
}
