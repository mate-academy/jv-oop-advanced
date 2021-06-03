package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle() {
        super("right triangle", new ColorSupplier().getRandomColor());
        firstLeg = new Random().nextInt(100);
        secondLeg = new Random().nextInt(100);
    }

    @Override
    public double getArea() {
        return (this.firstLeg * this.secondLeg) / 2;
    }

    @Override
    public void draw() {
        StringBuilder drawBuilder = new StringBuilder();
        drawBuilder.append("Figure: ")
                .append(getTitle())
                .append(", area: ")
                .append(getArea())
                .append(" sq.units, firstLeg: ")
                .append(firstLeg)
                .append(" units, secondLeg: ")
                .append(secondLeg)
                .append(" units, color: ")
                .append(getColor());
        System.out.println(drawBuilder.toString());
    }
}
