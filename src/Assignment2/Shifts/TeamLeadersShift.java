package Assignment2.Shifts;

public class TeamLeadersShift extends Shift{

    int festivalsBefore;

    public TeamLeadersShift(int hours, String task, int festivalsBefore) {
        super(hours, task);
        this.festivalsBefore = festivalsBefore;
    }

    @Override
    public int calculatePoints() {

        if(festivalsBefore >= 3){
            return getHours() * 3;
        }
        else{
            return getHours() * 2;
        }
    }

    @Override
    public String pointPerShift(){
        return "2 per hour, 3 after 3 festivals";
    }

}
