package model;

import core.basesyntax.ColorSupplier;

import java.text.DecimalFormat;
import java.util.Random;

public class Rectangle extends ColorSupplier implements Figure, Draw{
    private int widht;
    private int height;
    private String color;

    public Rectangle() {
        this.widht = new Random().nextInt(4) + 1;
        this.height = new Random().nextInt(4) + 1;
        this.color = getRandomColor();
    }

    @Override
    public double getArea() {
        return widht * height;
    }

    @Override
    public void draw() {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Name: rectangle, widht: " + widht + ", height: " + height + ", area: " + df.format(getArea()) + ", color: " + color);

    }
}
