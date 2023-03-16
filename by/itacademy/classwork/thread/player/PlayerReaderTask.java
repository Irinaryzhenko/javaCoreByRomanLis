package by.itacademy.classwork.thread.player;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class PlayerReaderTask extends Thread {

    private static String path;
    private PlayerGeneratorTask writer;
    private List<Player> players;

    public PlayerReaderTask(String path, PlayerGeneratorTask writer) {
        this.path = path;
        this.writer = writer;
    }

    @Override
    public void run() {
        try {
            writer.join();
            this.players = readPlayersFromFile(path);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Player> getPlayers() {

        return players;
    }

    private List<Player> readPlayersFromFile(String path) {
        try (var ois = new ObjectInputStream(
                new FileInputStream(path))) {
            return (List<Player>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
