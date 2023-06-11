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
        return (this.height / 2) * (this.base1 + this.base2);
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Shape: Isosceles trapezoid");
        stringBuilder.append(", area: ").append(this.getArea()).append(" sq. units");
        stringBuilder.append(", base 1: ").append(this.base1).append(" units");
        stringBuilder.append(", base 2: ").append(this.base2).append(" units");
        stringBuilder.append(", height: ").append(this.height).append(" units");
        stringBuilder.append(", color: ").append(this.color.name());

        System.out.println(stringBuilder);
    }
}
