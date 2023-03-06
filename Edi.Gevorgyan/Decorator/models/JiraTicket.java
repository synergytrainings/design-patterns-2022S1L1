package main.decorator.models;

public class JiraTicket {

    private final String ticketCode;
    private String implementingTeam;
    private String teamLead;

    public JiraTicket(String ticketCode, String implementingTeam, String teamLead) {
        this.ticketCode = ticketCode;
        this.implementingTeam  = implementingTeam;
        this.teamLead = teamLead;
    }

    public String getTicketCode() {
        return ticketCode;
    }

    public String getImplementingTeam() {
        return implementingTeam;
    }

    public void setImplementingTeam(String implementingTeam) {
        this.implementingTeam = implementingTeam;
    }

    public String getTeamLead() {
        return teamLead;
    }

    public void setTeamLead(String teamLead) {
        this.teamLead = teamLead;
    }
}
