package com.burakgungor.behavioral.observer;

@FunctionalInterface
public interface Observer {
    void update(String title,String description,String assignee,String reviewer,String label,boolean deleteSourceBranch);
}
