import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

import BaseUnits.BaseUnit;
import Melee.Pikeman;
import Melee.Rogue;
import Melee.Villager;
import Range.Crossbowman;
import Range.Monk;
import Range.Sniper;
import Range.Warlock;

public class Main {
    public static final int GANG_SIZE = 10;
    public static ArrayList<BaseUnit> whiteSide;
    public static ArrayList<BaseUnit> darkSide;
    public static ArrayList<BaseUnit> allUnits;

    private static void init() {

        whiteSide = new ArrayList<>(); // левая комманда
        darkSide = new ArrayList<>(); // правая комманда

        // заполнение команд определенными юнитами
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    whiteSide.add(new Villager(1, i+1));
                    break;
                case 1:
                    whiteSide.add(new Rogue(1, i+1));
                    break;
                case 2:
                    whiteSide.add(new Sniper(1, i+1));
                    break;
                case 3:
                    whiteSide.add(new Warlock(1, i+1));
                    break;
            }
            switch (new Random().nextInt(4)) {
                case 0:
                    darkSide.add(new Villager(10, i+1));
                    break;
                case 1:
                    darkSide.add(new Pikeman(10, i+1));
                    break;
                case 2:
                    darkSide.add(new Crossbowman(10, i+1));
                    break;
                case 3:
                    darkSide.add(new Monk(10, i+1));
                    break;
            }
        }
        // создание общего списка юнитов
        allUnits = new ArrayList<>();
        allUnits.addAll(whiteSide);
        allUnits.addAll(darkSide);

        

    }
    // ход юнитов
    private static void makeStep() {
        // сортировка юнитов по скорости
        allUnits.sort(new Comparator<BaseUnit>() {

            @Override
            public int compare(BaseUnit u1, BaseUnit u2) {
                if (u1.getSpeed() == u2.getSpeed())
                    return 0;
                else if (u1.getSpeed() > u2.getSpeed())
                    return 1;
                else
                    return -1;
            }
        });

        for (BaseUnit unit : allUnits) {
            if (darkSide.contains(unit)) {
                unit.step(whiteSide, darkSide);
            } else
                unit.step(darkSide, whiteSide);
        }
    }

    public static void main(String[] args) {
        init();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            ConsoleView.view();
            makeStep();
            scanner.nextLine();
        }
        

    }
}
