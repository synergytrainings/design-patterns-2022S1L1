package main.decorator;

import main.decorator.models.JiraTicket;

public class TaskExecutorDecoratorService implements TaskExecutorService {

    private final TaskExecutorService taskExecutorService;

    public TaskExecutorDecoratorService(TaskExecutorService taskExecutorService) {
        this.taskExecutorService = taskExecutorService;
    }

    @Override
    public void makeChanges() {
        this.taskExecutorService.makeChanges();
    }

    @Override
    public void buildProject() {
        this.taskExecutorService.buildProject();
    }

    @Override
    public void runAcceptanceTests() {
        this.taskExecutorService.runAcceptanceTests();
    }

    @Override
    public void mergeCommit() {
        this.taskExecutorService.mergeCommit();
    }

    @Override
    public void release() {
        this.taskExecutorService.release();
    }

    @Override
    public JiraTicket getJiraTicket() {
        return this.taskExecutorService.getJiraTicket();
    }
}
