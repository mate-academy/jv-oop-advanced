package core.basesyntax;

public class Rectangle extends Figure {
    private int bigSide;
    private int smallSide;

    public Rectangle(String title, String color, int bigSide, int smallSide) {
        super(title, color);
        this.bigSide = bigSide;
        this.smallSide = smallSide;
    }

    @Override
    public double getArea() {
        return smallSide * bigSide;
    }

    @Override
    public void draw() {
        StringBuilder drawBuilder = new StringBuilder();
        drawBuilder.append("Figure: ")
                .append(getTitle())
                .append(", area: ")
                .append(getArea())
                .append(" sq.units, bigSide: ")
                .append(bigSide)
                .append(" units, smallSide: ")
                .append(smallSide)
                .append(" units, color: ")
                .append(getColor());
        System.out.println(drawBuilder.toString());
    }
}
