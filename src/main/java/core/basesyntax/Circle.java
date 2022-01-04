package core.basesyntax;

public class Circle extends Figure implements ObtainArea {

    public Circle(int firstProperties) {
        super(firstProperties);
    }

    @Override
    public void getArea() {
        int diameter = 2 * Circle.this.getFirstProperties();
        String color = Circle.this.getColor();

        System.out.println("Figure: circle, area: " + diameter + " diameter, color: " + color);
    }
}
