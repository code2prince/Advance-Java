package Practice.DesignPattern.ChainOfResponsibility;

public class ChainOfResp {
    public static void main(String[] args) {
        LeaveApprover teamLead=new TeamLead();
        LeaveApprover supervisor=new Supervisor();
        LeaveApprover manager=new Manager();

        teamLead.setNextApprover(supervisor);
        supervisor.setNextApprover(manager);

        LeaveRequest req1=new LeaveRequest(2);
        LeaveRequest req2=new LeaveRequest(10);
        LeaveRequest req3=new LeaveRequest(5);


        teamLead.approveLeave(req1);
        teamLead.approveLeave(req2);
        teamLead.approveLeave(req3);

    }


}
