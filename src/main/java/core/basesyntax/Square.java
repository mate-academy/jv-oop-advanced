package core.basesyntax;

import java.text.DecimalFormat;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        double area = side * side;
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        String formattedArea = decimalFormat.format(area).replace(',', '.');
        return Double.parseDouble(formattedArea);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, "
                + "upper side: " + side + " units, color: " + getColor());
    }
}
