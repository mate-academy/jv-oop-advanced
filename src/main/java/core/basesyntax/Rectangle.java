package core.basesyntax;

public class Rectangle extends Figure implements State {
    private double side1 = 0;
    private double side2 = 0;
    private String color = GREEN;

    public Rectangle(double side1, double side2) {
        if (side1 > 0 && side2 > 0) {
            this.side1 = side1;
            this.side2 = side2;
        } else {
            System.out.println("Side cannot be less than 0 or equal 0");
        }
    }

    @Override
    public double countArea() {
        return side1 * side2;
    }

    @Override
    public void drawFigure() {
        System.out.printf("Figure: rectangle, area %f sq. units, %s, color %s\n",
                countArea(), uniqueProperty(), color);
    }

    public String uniqueProperty() {
        return String.format("side1 length: %f units, side2 length: %f units",
                side1, side2);
    }
}
