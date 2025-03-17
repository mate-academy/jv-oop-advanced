package core.basesyntax.figures;

import core.basesyntax.ColorSupplier;

import java.util.Random;

public class Square extends Rectangle {
    public Square(String color, double wall) {
        super(color, wall, wall);
    }

    public Square() {
        super(new ColorSupplier().getRandomColor(), 0, 0);
        double wall = new Random().nextInt(9)+1;
        this.setFirstWall(wall);
        this.setSecondWall(wall);
    }

    @Override
    public void draw() {
        String sb = "Figure: Square, Color: " + getColor() + ", Wall: " + getFirstWall() + ", Area: " + getArea();

        System.out.println(sb);
    }
}
