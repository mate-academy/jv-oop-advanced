package core.basesyntax.figures;

import java.text.DecimalFormat;

public class Circle extends Figure {
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#.00");
    private static final int SQUARE_POWER = 2;
    private int radius;

    public Circle(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
        super.area = calculateArea();
    }

    @Override
    public double calculateArea() {
        return Double.parseDouble(DECIMAL_FORMAT
                .format(Math.PI * Math.pow(radius, SQUARE_POWER)));
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(", radius: " + radius + " units");
    }
}
