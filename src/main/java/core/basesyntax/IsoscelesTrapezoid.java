package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double highFoundation;
    private double lowFoundation;
    private double side;
    private double middleLine;
    private double height;

    public IsoscelesTrapezoid(String title, String color, int highFoundation,
                              int side, int lowFoundation) {
        super(title, color);

        this.highFoundation = highFoundation;
        this.lowFoundation = lowFoundation;
        this.side = side;
        middleLine = (lowFoundation + highFoundation) / 2;
        height = Math.sqrt((side * side) - (lowFoundation - highFoundation)
                * (lowFoundation - highFoundation) / 4);
    }

    @Override
    public double getArea() {
        return this.height * this.middleLine;
    }

    @Override
    public void draw() {
        StringBuilder drawBuilder = new StringBuilder();
        drawBuilder.append("Figure: ")
                .append(getTitle())
                .append(", area: ")
                .append(getArea())
                .append(" sq.units, highFoundation: ")
                .append(highFoundation)
                .append(" units, lowFoundation: ")
                .append(lowFoundation)
                .append(" units, middleLine: ")
                .append(middleLine)
                .append(" units, height: ")
                .append(height)
                .append(" units, side: ")
                .append(side)
                .append(" units, color: ")
                .append(getColor());
        System.out.println(drawBuilder.toString());
    }
}
