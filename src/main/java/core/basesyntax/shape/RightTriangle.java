package core.basesyntax.shape;

import core.basesyntax.type.Color;

public class RightTriangle extends Shape {
    private double base1;
    private double base2;

    public RightTriangle(Color color, double base1, double base2) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
    }

    @Override
    public double getArea() {
        return (base1 * base2) / 2.0;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Shape: Right triangle");
        stringBuilder.append(", area: ").append(getArea()).append(" sq. units");
        stringBuilder.append(", base 1: ").append(base1).append(" units");
        stringBuilder.append(", base 2: ").append(base2).append(" units");
        stringBuilder.append(", color: ").append(color.name());

        System.out.println(stringBuilder);
    }
}
