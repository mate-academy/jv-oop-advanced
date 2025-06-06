package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = {"red", "blue", "green", "yellow", "white"}; //Массив возможных цветов
    private Random random = new Random();

    //Возвращает случайный цвет из массива
    public String getRandomColor() {
        return COLORS[random.nextInt(COLORS.length)];
    }
}

