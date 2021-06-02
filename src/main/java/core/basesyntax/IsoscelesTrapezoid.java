package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure{
    private double highFoundation;
    private double lowFoundation;
    private double side;
    private double middleLine;
    private double height;

    public IsoscelesTrapezoid() {
        super.title = "isosceles trapezoid";
        super.color = ColorSupplier.getRandomColor();

        while (!(highFoundation > lowFoundation)) {
            this.highFoundation = new Random().nextInt(100);
            this.lowFoundation = new Random().nextInt(100);
        }

        this.side = new Random().nextInt(100);
        this.middleLine = (this.lowFoundation + this.highFoundation) / 2;
        this.height = Math.sqrt((this.side * this.side) - (this.lowFoundation - this.highFoundation)
                * (this.lowFoundation - this.highFoundation) / 4);
    }

    @Override
    public double getArea() {
        return this.height * this.middleLine;
    }

    @Override
    public void draw() {
        StringBuilder drawBuilder = new StringBuilder();
        drawBuilder.append("Figure: ")
                .append(super.title)
                .append(", area: ")
                .append(getArea())
                .append(" sq.units, highFoundation: ")
                .append(this.highFoundation)
                .append(" units, lowFoundation: ")
                .append(this.lowFoundation)
                .append(" units, middleLine: ")
                .append(this.middleLine)
                .append(" units, height: ")
                .append(this.height)
                .append(" units, side: ")
                .append(this.side)
                .append(" units, color: ")
                .append(super.color);
        System.out.println(drawBuilder.toString());
    }
}
