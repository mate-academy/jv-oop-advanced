package core.basesyntax;

import java.text.DecimalFormat;

public class Square extends Figure {
    private static final DecimalFormat decimalFormat = new DecimalFormat("#.##");
    private int side;

    public Square(String color,int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        String formattedArea = decimalFormat.format(getArea());
        System.out.println("Figure: " + this.getClass().getSimpleName() + ", Area: "
                + formattedArea + " sq.units, side: "
                + side + " Units, Color: " + super.getColor());
    }
}
