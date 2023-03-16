package by.itacademy.classwork.inputOut.game;

import java.util.PrimitiveIterator;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private static final Random RANDOM = new Random();
    private int secretNum;
    private static final String GAME_STARTED_MESSAGE = "Game started. Write a number from 1 to 100.";
    private static final String NOT_A_NUMBER = "Write a valid number from 1 to 100.";
    private static final String FIND_NUMBER_IS_MORE = "Find number is more";
    private static final String FIND_NUMBER_IS_LESS = "Find number is less";
    private static final String WIN = "You win for %s steps.";
    private static final Scanner IN = new Scanner(System.in);
    private int amount = 0;

    public void start() {
        generateNum();
        printMessage(GAME_STARTED_MESSAGE);
        game();
    }
    private void game() {
        while (true) {
            int number = readUserInput();
            if (!validateUserNumber(number)) {
                printMessage(NOT_A_NUMBER);
                continue;
            }
            increaseAmount();
            if (checkUserNum(number)) {
                printMessage(String.format(WIN, amount));
                break;
            }
        }
    }
    private void increaseAmount(){
        amount++;
    }

    private boolean validateUserNumber(int userNumber) {

            return userNumber >=1 && userNumber <= 100;
        }
        private boolean checkUserNum(int userNumber ) {
        if (userNumber < secretNum) {
            printMessage(FIND_NUMBER_IS_MORE);
            return false;
        } else if (userNumber > secretNum) {
            printMessage(FIND_NUMBER_IS_LESS);
            return false;
        }
        return true;
    }
    private int readUserInput() {
        int userInput = -1;
        while (true) {
            if (IN.hasNextInt()) {
                return IN.nextInt();
            }
            IN.next();
            printMessage(NOT_A_NUMBER);

        }
    }


    private void printMessage(String message) {
        System.out.println(message);
    }
    private void generateNum() {
        secretNum = RANDOM.nextInt(100) + 1;
    }
}
