package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure implements GetArea {
    private Random random = new Random();
    private ColorSupplier color = new ColorSupplier();
    private int sideA;
    private int sideB;
    private int sideC;

    public IsoscelesTrapezoid() {
        setName("trapezoid");
        setColor(color.getRandomColor().toString());
        this.sideA = random.nextInt(100);
        this.sideB = random.nextInt(100);
        this.sideC = random.nextInt(100);
    }

    @Override
    public double getArea() {
        return (sideA + sideB) / 2 * Math.sqrt(Math.pow(sideC,2) - Math.pow((sideA - sideB),2)) / 4;
    }

    @Override
    public String drawFigure() {
        return "Figure: " + getName()
                + ", area: " + getArea()
                + " sq.units, sideA: " + sideA
                + " units, sideB: " + sideB
                + " units, sideC: " + sideC
                + " units, color: " + getColor().toLowerCase();
    }
}
