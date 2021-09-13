package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator, FigureDraw{
    private int upperBase;
    private int lowerBase;
    private int height;

    public IsoscelesTrapezoid() {
        this.color = new ColorSupplier().getRandomColor();
        this.upperBase = new Random().nextInt(10) + 1;
        this.lowerBase = new Random().nextInt(10) + 1;
        this.height = new Random().nextInt(10) + 1;
    }

    @Override
    public double getArea() {
        return (double) (upperBase + lowerBase) * height / 2;
    }

    @Override
    public void Draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + getArea() + " sq.units, upperBase: " + upperBase
                + " units, lowerBase: " + lowerBase + " units, height: " + height + " units, color: " + color);
    }
}
