package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure implements FigureBehaviour {

    private int longerBase;
    private int shorterBase;
    private int height;
    private final Random random = new Random();
    private final int MAXDIFFERENCE = 30;
    private final int MAXSHORTERBASE = 50;

    public IsoscelesTrapezoid(){
        this.setName("isosceles trapezoid");
    }

    public void setLongerBase(int longerBase) {
        this.longerBase = longerBase;
    }

    public int getLongerBase() {
        return longerBase;
    }

    public void setShorterBase(int shorterBase) {
        this.shorterBase = shorterBase;
    }

    public int getShorterBase() {
        return shorterBase;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void setRandomProperties() {
        super.setRandomProperties();
        this.setShorterBase(this.random.nextInt(MAXSHORTERBASE));
        this.setLongerBase(this.shorterBase+this.random.nextInt(MAXDIFFERENCE));
        this.setHeight(this.random.nextInt(MAXSHORTERBASE+MAXDIFFERENCE));
    }

    @Override
    public double obtainArea() {
        return ((this.shorterBase+this.longerBase)*this.height/2);
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder(this.getName());
        builder.append(", area: ");
        builder.append(String.format("%.2f", this.obtainArea()));
        builder.append(" sq.units, ");
        builder.append("longbase: ");
        builder.append(this.getLongerBase());
        builder.append(" units, ");
        builder.append("shortbase: ");
        builder.append(getShorterBase());
        builder.append(" units, ");
        builder.append("height: ");
        builder.append(this.getHeight());
        builder.append(" units, ");
        builder.append("color: ");
        builder.append(this.getColor());
        System.out.println(builder.toString());
    }
}
