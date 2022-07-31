package core.basesyntax;

import java.text.DecimalFormat;
import java.util.Locale;

public class Square extends Figure {
    private int side;

    public Square(int side, Color color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String writeText() {
        DecimalFormat decimalFrmt = new DecimalFormat("#.##");
        return "Figure: square, area = " + decimalFrmt.format(getArea()) + " sq.units, side: "
                + side + " units, color: " + getColor().toString().toLowerCase(Locale.ROOT);
    }
}
