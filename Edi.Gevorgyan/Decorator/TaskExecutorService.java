package main.decorator;

import main.decorator.models.JiraTicket;

public interface TaskExecutorService {

    void makeChanges();

    void buildProject();

    void runAcceptanceTests();

    void mergeCommit();

    void release();

    JiraTicket getJiraTicket();
}
