package core.basesyntax.figures;

import core.basesyntax.constants.Color;
import lombok.Getter;

@Getter
public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        String info = "right triangle: area = "
                + calculateArea()
                + " sq.units, firstLeg = "
                + firstLeg
                + " units, secondLeg = "
                + secondLeg
                + " units, color = "
                + color.name().toLowerCase()
                + '.';

        System.out.println(info);
    }

    @Override
    public double calculateArea() {
        return (double) (firstLeg * secondLeg) / 2;
    }
}
