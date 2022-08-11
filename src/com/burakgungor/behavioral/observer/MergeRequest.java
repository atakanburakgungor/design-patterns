package com.burakgungor.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class MergeRequest implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String title;
    private String description;
    private String assignee;
    private String reviewer;
    private String label;
    private boolean deleteSourceBranch = false;

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean isDeleteSourceBranch() {
        return deleteSourceBranch;
    }

    public void setDeleteSourceBranch(boolean deleteSourceBranch) {
        this.deleteSourceBranch = deleteSourceBranch;
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0) observers.remove(index);
    }

    @Override
    public void notifySubscribers() {
        observers.forEach(observer -> observer.update(title, description, assignee, reviewer, label, deleteSourceBranch));
    }
}
