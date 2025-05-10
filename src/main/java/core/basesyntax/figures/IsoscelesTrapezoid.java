package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int height;

    public IsoscelesTrapezoid(Color color, int firstBase, int secondBase, int height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public void draw() {
        double area = this.calculateArea();
        String colorLowerCase = this.getColor().name().toLowerCase();
        String information = String.format(
                "Figure: isosceles trapezoid, area: %.1f sq.units, firstBase: %d units, "
                        + "secondBase: %d units, height: %d units, color: %s",
                area, firstBase, secondBase, height, colorLowerCase);
        System.out.println(information);
    }

    @Override
    public double calculateArea() {
        return (firstBase + secondBase) / 2 * height;
    }
}
