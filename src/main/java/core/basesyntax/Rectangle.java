package core.basesyntax;

public class Rectangle extends Figure {
    int width;
    int height;
    @Override
    public String draw() {
       return "rectangle, " +
               "area: " + getArea() + "sq. units, " +
               "width: " + width + "units, " +
               "height: " + height + "units, " +
               "color: " + color;
    }
    @Override
    public int getArea() {
        return width * height;
    }
}
