package core.basesyntax;

public class RightTriangle extends Figure implements ObtainArea {

    public RightTriangle(int firstProperties, int secondProperties) {
        super(firstProperties, secondProperties);
    }

    @Override
    public void getArea() {
        int firstProperty = RightTriangle.this.getFirstProperties();
        int secondProperties = RightTriangle.this.getSecondProperties();
        int area = (firstProperty * secondProperties) / 2;
        String color = RightTriangle.this.getColor();

        System.out.println("Figure: right triangle, area: " + area + " sq. , color: " + color);
    }
}
