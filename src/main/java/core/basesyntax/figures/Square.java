package core.basesyntax.figures;

import core.basesyntax.constants.Color;
import lombok.Getter;

@Getter
public class Square extends Figure {
    private final int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        String info = "Square: area = "
                + calculateArea()
                + " sq.units, side = "
                + getSide()
                + " units, color = "
                + getColor().name().toLowerCase()
                + '.';
        System.out.println(info);
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }
}
