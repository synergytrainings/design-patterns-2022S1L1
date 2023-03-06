package main.decorator;

import main.decorator.models.JiraTicket;

public class TaskExecutorJiraDecoratorService extends TaskExecutorDecoratorService {

    private final String jiraTicketCode;

    public TaskExecutorJiraDecoratorService(TaskExecutorService taskExecutorService) {
        super(taskExecutorService);
        this.jiraTicketCode = taskExecutorService.getJiraTicket().getTicketCode();
    }

    @Override
    public void release() {
        super.release();
        this.updateJiraBoard(jiraTicketCode);
    }

    private void updateJiraBoard(String jiraTicketCode) {}
}
