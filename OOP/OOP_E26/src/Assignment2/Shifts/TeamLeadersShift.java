package Assignment2.Shifts;

public abstract class TeamLeadersShift extends Shift{

    int festivalsBefore;

    public TeamLeadersShift(int hours, String task, int festivalsBefore) {
        super(hours, task);
        this.festivalsBefore = festivalsBefore;
    }

    @Override
    public int calculatePoints() {

        if(festivalsBefore >= 3){
            return hours * 3;
        }
        else{
            return hours * 2;
        }
    }

    @Override
    public String pointPerShift(){
        return "2 per hour, 3 after 3 festivals";
    }


    public abstract String getRuleName();
}
