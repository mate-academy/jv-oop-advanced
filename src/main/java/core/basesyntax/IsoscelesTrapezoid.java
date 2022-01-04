package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements ObtainArea {

    public IsoscelesTrapezoid(int firstProperties, int secondProperties) {
        super(firstProperties, secondProperties);
    }

    @Override
    public void getArea() {
        int firstProperty = IsoscelesTrapezoid.this.getFirstProperties();
        int secondProperties = IsoscelesTrapezoid.this.getSecondProperties();
        int area = (firstProperty + secondProperties) / 2;
        String color = IsoscelesTrapezoid.this.getColor();

        System.out.println("Figure: isosceles trapezoid, area: " + area + " sq. , color: " + color);
    }
}
