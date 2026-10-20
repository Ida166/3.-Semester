package Assignment2.Shifts;

public class TeamLeaderRecycleShift extends TeamLeadersShift{

    public TeamLeaderRecycleShift(int hours, String task, int festivalsBefore) {
        super(hours, task, festivalsBefore);
    }

    @Override
    public String getRuleName() {
        return "Recycling team leader";
    }
}
