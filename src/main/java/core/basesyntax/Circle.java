package org.example;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Circle extends Figure {
    private final double radius;
    private final DecimalFormat decimalFormat = new DecimalFormat("#.##");

    {
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
    }

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Shape: circle, area: " + decimalFormat.format(area())
                + "sq. units, radius: " + radius
                + " sq. units, color: " + getColor());
    }
}
