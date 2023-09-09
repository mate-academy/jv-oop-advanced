package core.basesyntax;

public class Rectangle extends Figure {
    private final int length;
    private final int height;

    public Rectangle(Colors randomColor, int length, int height) {
        this.color = randomColor;
        this.length = length;
        this.height = height;
    }

    @Override
    public int areaCalculator() {
        return height * length;
    }

    @Override
    public void informationCalculator() {
        String rectangleInformation = String.valueOf(new StringBuilder()
                .append("Figure: rectangle, area: ")
                .append(areaCalculator())
                .append(" sq.units, length: ")
                .append(this.length)
                .append(" units, height: ")
                .append(this.height)
                .append(" units, color: ")
                .append(color));
        System.out.println(rectangleInformation);
    }
}
