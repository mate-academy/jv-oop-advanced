package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure {
    private int bigSide;
    private int smallSide;

    public Rectangle() {
        super.title = "rectangle";
        super.color = new ColorSupplier().getRandomColor();

        while (!(this.bigSide >= 50) && !(this.smallSide > 0 && this.smallSide < 50)) {
            this.bigSide = new Random().nextInt(100);
            this.smallSide = new Random().nextInt(100);
        }
    }

    @Override
    public double getArea() {
        return this.smallSide * this.bigSide;
    }

    @Override
    public void draw() {
        StringBuilder drawBuilder = new StringBuilder();
        drawBuilder.append("Figure: ")
                .append(super.title)
                .append(", area: ")
                .append(getArea())
                .append(" sq.units, bigSide: ")
                .append(this.bigSide)
                .append(" units, smallSide: ")
                .append(this.smallSide)
                .append(" units, color: ")
                .append(super.color);
        System.out.println(drawBuilder.toString());
    }
}
