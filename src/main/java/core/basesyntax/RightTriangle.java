package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure{
    private int firstLeg;
    private int secondLeg;

    public RightTriangle() {
        super.title = "right triangle";
        super.color = new ColorSupplier().getRandomColor();
        this.firstLeg = new Random().nextInt(100);
        this.secondLeg = new Random().nextInt(100);
    }

    @Override
    public double getArea() {
        return (this.firstLeg * this.secondLeg) / 2;
    }

    @Override
    public void draw() {
        StringBuilder drawBuilder = new StringBuilder();
        drawBuilder.append("Figure: ")
                .append(super.title)
                .append(", area: ")
                .append(getArea())
                .append(" sq.units, firstLeg: ")
                .append(this.firstLeg)
                .append(" units, secondLeg: ")
                .append(this.secondLeg)
                .append(" units, color: ")
                .append(super.color);
        System.out.println(drawBuilder.toString());
    }
}
