package core.basesyntax.figures;

import core.basesyntax.constants.Color;
import lombok.Getter;

@Getter
public class IsoscelesTrapezoid extends Figure {
    private final int topSide;

    private final int downside;

    private final int height;

    public IsoscelesTrapezoid(Color color, int topSide, int downside, int height) {
        super(color);
        this.topSide = topSide;
        this.downside = downside;
        this.height = height;

    }

    @Override
    public void draw() {
        String info = "isosceles trapezoid: area = "
                + calculateArea()
                + " sq.units, topSide = "
                + getTopSide()
                + " units, downside = "
                + getDownside()
                + " units, height = "
                + getHeight()
                + " units, color = "
                + getColor().name().toLowerCase()
                + '.';
        System.out.println(info);
    }

    @Override
    public double calculateArea() {
        return (double) (topSide + downside) / 2 * height;
    }
}
