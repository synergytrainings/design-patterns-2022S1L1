package main.decorator;

import main.decorator.models.JiraTicket;

public class TaskExecutorServiceImpl implements TaskExecutorService {

    private final JiraTicket jiraTicket;

    public TaskExecutorServiceImpl(JiraTicket jiraTicket) {
        this.jiraTicket = jiraTicket;
    }

    @Override
    public void makeChanges() {}

    @Override
    public void buildProject() {}

    @Override
    public void runAcceptanceTests() {}

    @Override
    public void mergeCommit() {}

    @Override
    public void release() {}

    @Override
    public JiraTicket getJiraTicket() {
        return jiraTicket;
    }
}
