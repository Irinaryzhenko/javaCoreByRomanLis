package by.itacademy.classwork.thread.player;

import java.util.Comparator;
import java.util.List;

public class TaskThread {
    public static void main(String[] args) throws InterruptedException {
        String path = "C:\\Users\\User\\Desktop\\JavaCorebyRomanLis\\" +
                "JAvaCorebyRomanLis\\src\\by\\itacademy\\classwork\\thread\\player\\players";
        PlayerGeneratorTask generator  = new PlayerGeneratorTask(
                10, path);


        PlayerReaderTask reader = new PlayerReaderTask(path, generator);
        generator.start();
        reader.start();
        reader.join();

        List<Player> players = reader.getPlayers();
        System.out.println(players);

        players.stream().filter(player -> player.getAge() >= 25
                    && player.getAge() <= 30
        ).sorted(Comparator.comparingInt(Player :: getAge))
                .limit(5).filter(player -> player.isActive())
                .forEach(System.out::println);
    }
}
