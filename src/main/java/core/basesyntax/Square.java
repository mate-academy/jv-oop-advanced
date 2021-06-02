package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private int side;

    public Square() {
        super.title = "squar";
        super.color = new ColorSupplier().getRandomColor();
        this.side = new Random().nextInt(100);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        StringBuilder drawBuilder = new StringBuilder();
        drawBuilder.append("Figure: ")
                .append(super.title)
                .append(", area: ")
                .append(getArea())
                .append(" sq.units, side: ")
                .append(this.side)
                .append(" units, color: ")
                .append(super.color);
        System.out.println(drawBuilder.toString());
    }
}
