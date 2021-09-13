package core.basesyntax;

import java.util.Random;

public class Square extends Figure implements AreaCalculator, FigureDraw{
    private int side;

    public Square() {
        this.color = new ColorSupplier().getRandomColor();
        this.side = new Random().nextInt(10) + 1;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void Draw() {
        System.out.println("Figure: Square, area: " + getArea() + " sq.units, side: " + side + " units, color: " + color);
    }
}
