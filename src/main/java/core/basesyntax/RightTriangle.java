package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure implements GetArea {
    private Random random = new Random();
    private ColorSupplier color = new ColorSupplier();
    private int firstLeg;
    private int secondLeg;

    public RightTriangle() {
        setName("triangle");
        setColor(color.getRandomColor().toString());
        this.firstLeg = random.nextInt(100);
        this.secondLeg = random.nextInt(100);
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public String drawFigure() {
        return "Figure: " + getName()
                + ", area: " + getArea()
                + " sq.units, firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg
                + " units, color: " + getColor().toLowerCase();
    }
}
