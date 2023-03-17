package core.basesyntax;

import java.util.Random;

public class Square extends AbstractFigure {
    private final Random random = new Random();

    public Square(String color) {
        super(color);
    }

    @Override
    public String draw() {
        double side = random.nextDouble() * 10;
        double area = side * side;
        return String.format("Figure: square, area: %s sq.units, side: %s units",
               String.format("%.2f", area), String.format("%.2f", side));
    }
}


