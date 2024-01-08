package model;

import core.basesyntax.ColorSupplier;

import java.text.DecimalFormat;
import java.util.Random;

public class IsoscelesTrapezoid extends ColorSupplier implements Figure, Draw {
    private int baseOne;
    private int baseTwo;
    private int height;
    private String color;

    public IsoscelesTrapezoid() {
        this.baseOne = new Random().nextInt(4) + 1;;
        this.baseTwo = new Random().nextInt(4) + 1;;
        this.height = new Random().nextInt(4) + 1;;
        this.color = getRandomColor();
    }


    @Override
    public double getArea() {
        return 0.5*(baseOne * baseTwo) * height;
    }

    @Override
    public void draw() {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Name: IsoscelesTrapezoid, baseOne: " + baseOne + ", baseTwo: "
                + baseTwo + ", height:" + height + ", area: " + df.format(getArea())
                + ", color: " + color);
    }
}
