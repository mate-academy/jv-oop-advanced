package core.basesyntax.figures;

import lombok.Getter;

@Getter
public class IsoscelesTrapezoid extends Figure {
    private final int topSide;
    private final int downside;
    private final int height;

    public IsoscelesTrapezoid(String color, int topSide, int downside, int height) {
        super(color);
        this.topSide = topSide;
        this.downside = downside;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("isosceles trapezoid: area = "
                + calculateArea()
                + " sq.units, topSide = "
                + topSide
                + " units, downside = "
                + downside
                + " units, height = "
                + height
                + " units, color = "
                + color.toLowerCase()
                + '.');
    }

    @Override
    public double calculateArea() {
        return (double) (topSide + downside) / 2 * height;
    }
}
