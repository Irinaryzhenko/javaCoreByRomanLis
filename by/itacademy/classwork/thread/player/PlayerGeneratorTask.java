package by.itacademy.classwork.thread.player;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PlayerGeneratorTask extends Thread{
    private static final Random RANDOM =  new Random();
    private int count;
    private String path;

    public PlayerGeneratorTask(int count, String path) {
        this.count = count;
        this.path = path;
    }

    @Override
    public void run() {
        List<Player> players = createPlayer(count);
        writePlayerToFile(players, path);

    }

    private List <Player> createPlayer(int count) {
        List <Player> players = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String name = String.valueOf(i);
            Integer age = RANDOM.nextInt(21) + 20;
            boolean active = RANDOM.nextBoolean();
            Player player = new Player(name, age, active);
            players.add(player);

        }
            return players;
    }

        private void writePlayerToFile(List <Player> players, String path) {
            try (var oos = new ObjectOutputStream(
                    new FileOutputStream(path))) {
                oos.writeObject(players);
            } catch (IOException e) {
                System.out.println("Error" + e);
            }
        }
}
