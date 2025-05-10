package core.basesyntax;

public class Square extends Rectangle {

    public Square(double side, Color color) {
        super(side, side, color);
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder()
                .append("Figure: square, area: ")
                .append(String.format("%.1f", getArea()))
                .append(" sq.units, side: ")
                .append(String.format("%.1f", this.width))
                .append(" units, color: ")
                .append(this.color.toString().toLowerCase()).toString());
    }
}
