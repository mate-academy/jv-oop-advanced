package core.basesyntax;

import java.text.DecimalFormat;

public class Square extends Figure {
    private DecimalFormat decimalFormat = new DecimalFormat("#.##");
    private double sideLength;

    public Square(double sideLength, String color) {
        super.setColor(color);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public static Square createSquare(double sideLength, String color) {
        return new Square(sideLength, color);
    }

    @Override
    public void getArea() {
        double area = sideLength * sideLength;
        System.out.println("Figure: square, area: " + decimalFormat.format(area)
                + " sq.units, side: " + decimalFormat.format(sideLength)
                + " units, color: " + getColor());
    }
}

