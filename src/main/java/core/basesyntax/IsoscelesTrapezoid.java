package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements InitializingProperties, DrawFigures {
    public int base1 = 0;
    public int base2 = 0;
    public int height = 0;

    public IsoscelesTrapezoid(int base1, int base2, int height) {
        super.name = "Isosceles Trapezoid";
        super.color = getRandomColor();
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
        getDraw();


    }

    @Override
    public double getArea() {
        return (base1 + base2) / 2 * height;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure : " + super.name + ", area : " + getArea()
                + " units, base1 : " + base1 + " base2 : " + base2 + " height : " + height + " units, color : " + super.color);
    }
}
