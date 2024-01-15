package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator {
    private int shortBase;
    private int longBase;
    private int height;
       
    public IsoscelesTrapezoid(Color color, int shortBase, int longBase, int height) {
        super(color);
        this.shortBase = shortBase;
        this.longBase = longBase;
        this.height = height;
    }

    public int getShortBase() {
        return shortBase;
    }


    public void setShortBase(int shortBase) {
        this.shortBase = shortBase;
    }


    public int getLongBase() {
        return longBase;
    }


    public void setLongBase(int longBase) {
        this.longBase = longBase;
    }


    public int getHeight() {
        return height;
    }


    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (shortBase + longBase) / 2 * height;
    }

    @Override
    public void getFigureInformation() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq.units, short base: " + 
        shortBase + " units, long base: " + longBase + " units, height: " + height + " units, Color: " + getColor().name());
    }
}
