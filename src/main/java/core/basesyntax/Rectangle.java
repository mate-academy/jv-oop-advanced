package core.basesyntax;

import java.text.DecimalFormat;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        double area = Math.PI * sideA * sideB;
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        String formattedArea = decimalFormat.format(area).replace(',', '.');
        return Double.parseDouble(formattedArea);
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, "
                + "side a: " + sideA + " units, side b: " + sideB
                + " units, color: " + getColor());
    }
}
