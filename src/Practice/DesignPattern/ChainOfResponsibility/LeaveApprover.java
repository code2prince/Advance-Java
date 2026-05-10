package Practice.DesignPattern.ChainOfResponsibility;

public abstract class LeaveApprover {
    protected LeaveApprover nextApprover;

    void setNextApprover(LeaveApprover nextApprover){
        this.nextApprover=nextApprover;
    }

    public void approveLeave(LeaveRequest req){
        if(nextApprover!=null){
            nextApprover.approveLeave(req);
        }else{
            System.out.println("Leave req not approve");
        }
    }
}

class TeamLead extends LeaveApprover{
    @Override
    public void approveLeave(LeaveRequest req){
        if(req.noOfDays<=2){
            System.out.println("Approved by TL");
        }else{
            System.out.println("TL can't forwarding to next approver");
            super.approveLeave(req);
        }
    }
}


class Supervisor extends LeaveApprover{
    @Override
    public void approveLeave(LeaveRequest req){
        if(req.noOfDays<=5){
            System.out.println("Approved by Supervisor");
        }else{
            System.out.println("Supervisor can't forwarding to Next Approver");
            super.approveLeave(req);
        }
    }
}


class Manager extends LeaveApprover{
    @Override
    public void approveLeave(LeaveRequest req){
        if(req.noOfDays>5){
            System.out.println("Approved by Manager");
        }
    }
}