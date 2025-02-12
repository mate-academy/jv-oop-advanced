package core.basesyntax;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Square extends Figure implements Interface {
    private final double side;
    private final String name = "square";
    private final String color;
    private BigDecimal bd;

    Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    public double getArea() {
        bd = BigDecimal.valueOf(side * side);
        bd = bd.setScale(1, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea()
                + " sq. units, side: " + side + " units, color: " + color);
    }
}
