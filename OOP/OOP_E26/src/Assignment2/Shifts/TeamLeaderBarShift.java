package Assignment2.Shifts;

public class TeamLeaderBarShift extends TeamLeadersShift {

    public TeamLeaderBarShift(int hours, String task, int festivalsBefore) {
        super(hours, task, festivalsBefore);
    }

    @Override
    public String getRuleName() {
        return "Bar team leader";
    }
}
