package main.decorator;

public class TaskExecutorNotifierDecoratorService extends TaskExecutorDecoratorService {

    private final String teamLead;

    public TaskExecutorNotifierDecoratorService(TaskExecutorService taskExecutorService) {
        super(taskExecutorService);
        this.teamLead = taskExecutorService.getJiraTicket().getTeamLead();
    }

    @Override
    public void release() {
        super.release();
        this.notifyTeamLead(teamLead);
    }

    private void notifyTeamLead(String teamLead) {}
}
