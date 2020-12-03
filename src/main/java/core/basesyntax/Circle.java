package core.basesyntax;

import java.util.Random;

public class Circle extends Figure {
    private int radius = 0;

    public void setData() {
        while (radius < 3) {
            this.radius = new Random().nextInt(300);
        }
    }

    @Override
    public String getName() {
        return "circle";
    }

    @Override
    public double getArea() {
        setData();
        return radius * radius * Math.PI;
    }

    @Override
    public void printUniqueParameters() {
        System.out.print("diameter: " + radius * 2 + " units,");
    }
}
