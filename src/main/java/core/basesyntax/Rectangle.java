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
        String rectangleInformation = "Figure: rectangle, area: " + areaCalculator() + " sq.units, length: " + this.length + " units, height: " + this.height + " units, color: " + color;
        System.out.println(rectangleInformation);
    }
}
