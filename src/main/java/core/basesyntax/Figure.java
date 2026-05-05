package core.basesyntax;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

abstract class Figure implements Drawable {

    private String color;
    private double area;

    public Figure(Color color) {
        this.color = color.name();
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        List<String> colors = Arrays.stream(Color.values()).map(Color::name)
                .toList();
        if (colors.contains(color.toUpperCase())) {
            this.color = color;
        } else {
            throw new InputMismatchException("It is not possible to create a shape with this color."
                    + " Please review the available colors in Enum Color");
        }
    }

}
