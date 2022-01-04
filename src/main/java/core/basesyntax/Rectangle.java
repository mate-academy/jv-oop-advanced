package core.basesyntax;

public class Rectangle extends Figure implements ObtainArea {

    public Rectangle(int firstProperties, int secondProperties) {
        super(firstProperties, secondProperties);
    }

    @Override
    public void getArea() {
        int firstProperty = Rectangle.this.getFirstProperties();
        int secondProperties = Rectangle.this.getSecondProperties();
        int area = firstProperty * secondProperties;
        String color = Rectangle.this.getColor();

        System.out.println("Figure: rectangle, area: " + area + " sq. , color: " + color);
    }
}
