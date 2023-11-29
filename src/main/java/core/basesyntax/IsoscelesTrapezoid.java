package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private double heightOfTrapezoid;
    private double upHorizontalSide;
    private double downHorizontalSide;
    private String ispscelesTrapezoidColor = new Figure().getColor();

    public IsoscelesTrapezoid(Random random) {
        this.heightOfTrapezoid = Math.abs(random.nextInt());
        this.upHorizontalSide = Math.abs(random.nextInt());
        this.downHorizontalSide = Math.abs(random.nextInt());
        this.ispscelesTrapezoidColor = ColorSupplier.getRandomColor();
        draw();
    }

    @Override
    public double getArea() {
        return ((upHorizontalSide + downHorizontalSide) / 2) * heightOfTrapezoid;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, down horizontal side: " + downHorizontalSide
                + " sq. units, up horizontal side: " + upHorizontalSide
                + " sq. units, height of trapezoid: "
                + heightOfTrapezoid + " units, color: " + ispscelesTrapezoidColor);
    }
}
