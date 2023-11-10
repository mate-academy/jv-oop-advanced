package core.basesyntax.model;

import core.basesyntax.model.enums.Color;

public class Rectangle extends Figure {

    private Integer sideA;
    private Integer sideB;

    public Rectangle(Color color, Integer sideA, Integer sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public Double calculateArea() {
        return (double) (sideA * sideB);
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + calculateArea() + " sq. units, sideA: "
                + sideA + " units, sideB: "
                + sideB + " units, color: "
                + getColor().toString().toLowerCase());
    }
}
