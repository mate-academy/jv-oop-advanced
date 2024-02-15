package core.basesyntax.figure;

import core.basesyntax.supplier.Color;

public class Square extends Figure {
    private final double side;

    public Square(double side, Color randomColor, String name) {
        super(randomColor, name);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * 2;
    }

    @Override
    public void draw() {
        String formatedResult = "Figure: " + getFigureName()
                + System.lineSeparator()
                + "area: " + side + " sq. units"
                + System.lineSeparator()
                + "a: " + side + " units"
                + System.lineSeparator()
                + "color: " + getColor();
        System.out.println(formatedResult);
    }
}
