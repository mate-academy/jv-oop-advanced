package core.basesyntax.model;

import core.basesyntax.model.enums.Color;

public class IsoscelesTrapezoid extends Figure {

    private Integer sideA;
    private Integer sideB;
    private Integer height;

    public IsoscelesTrapezoid(Color color, Integer sideA, Integer sideB, Integer height) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public Double calculateArea() {
        return (double) ((sideA + sideB) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid, area: "
                + calculateArea() + " sq. units, sideA: "
                + sideA + " units, sideB: "
                + sideB + " units, height: "
                + height + " units, color: "
                + getColor().toString().toLowerCase());
    }

}
