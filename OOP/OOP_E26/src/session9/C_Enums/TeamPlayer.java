package session9.C_Enums;

/**
 * A player in a game with two teams, blue and red. The team is kept as a
 * String, "Blue" or "Red".
 */
public class TeamPlayer {

    private String name;
    private Team team;

    public TeamPlayer(String name, Team team) {
        this.name = name;
        this.team = team;
    }

    public boolean isOnSameTeamAs(TeamPlayer other) {
        return team == other.team;
    }

    @Override
    public String toString() {
        return name + " (" + team + ")";
    }
}
