package session8.C_TDD;

public class BadmintonPlayer {
    private String name;
    private int wins;
    private int losses;

    public BadmintonPlayer(String name, int wins, int losses) {
        this.name = name;
        this.wins = wins;
        this.losses = losses;
    }

    public String getName() {
        return name;
    }

    public int getLosses() {
        return losses;
    }

    public int getWins() {
        return wins;
    }
}
