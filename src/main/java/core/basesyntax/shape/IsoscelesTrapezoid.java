package core.basesyntax.shape;

import core.basesyntax.type.Color;

public class IsoscelesTrapezoid extends Shape {
    private double base1;
    private double base2;
    private double height;

    public IsoscelesTrapezoid(Color color, double base1, double base2, double height) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (height / 2) * (base1 + base2);
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Shape: Isosceles trapezoid");
        stringBuilder.append(", area: ").append(getArea()).append(" sq. units");
        stringBuilder.append(", base 1: ").append(base1).append(" units");
        stringBuilder.append(", base 2: ").append(base2).append(" units");
        stringBuilder.append(", height: ").append(height).append(" units");
        stringBuilder.append(", color: ").append(color.name());

        System.out.println(stringBuilder);
    }
}
