package core.basesyntax;

import java.util.Random;

public abstract class Figure implements Area {
    private String color;
    public String getColor() {return color; }
    public void setColor(String color) {
        this.color = color;
    }
    public static final int Figure_Count = 6;
    public static final int Max_Value = 20;
    Random random = new Random();
}
