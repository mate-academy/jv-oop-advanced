package core.basesyntax;

import java.util.Random;

public abstract class Figure implements Area {
    public Color color;
    public Figure (Color color) {
        this.color = color;
    }
    public static final int Figure_Count = 6;
    public static final int Max_Value = 20;
    Random random = new Random();
}
