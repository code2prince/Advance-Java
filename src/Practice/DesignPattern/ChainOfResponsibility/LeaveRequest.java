package Practice.DesignPattern.ChainOfResponsibility;

public class LeaveRequest {
    int noOfDays;

    public LeaveRequest(int noOfDays){
        this.noOfDays=noOfDays;
    }

    public int getNoOfDays(){
        return noOfDays;
    }

}
