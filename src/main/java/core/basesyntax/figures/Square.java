package core.basesyntax.figures;

import lombok.Getter;

@Getter
public class Square extends Figure {
    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Square: area = "
                + calculateArea()
                + " sq.units, side = "
                + side
                + " units, color = "
                + color.toLowerCase()
                + '.');
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }
}
