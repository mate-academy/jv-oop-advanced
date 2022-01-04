package core.basesyntax;

public class Square extends Figure implements ObtainArea {

    public Square(int firstProperties) {
        super(firstProperties);
    }

    @Override
    public void getArea() {
        int firstProperty = 2 * Square.this.getFirstProperties();
        int area = firstProperty * firstProperty;
        String color = Square.this.getColor();

        System.out.println("Figure: square, area: " + area + " sq. , color: " + color);
    }
}
