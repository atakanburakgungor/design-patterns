package com.burakgungor.behavioral.observer;

public class Repository implements Observer {

    private String name;
    private String url;
    private String slug;
    private String visibilityLevel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getVisibilityLevel() {
        return visibilityLevel;
    }

    public void setVisibilityLevel(String visibilityLevel) {
        this.visibilityLevel = visibilityLevel;
    }

    public Repository(Subject repository) {
        repository.subscribe(this);
    }

    @Override
    public void update(String title, String description, String assignee, String reviewer, String label, boolean deleteSourceBranch) {
        System.out.println("Merge request created ! details : {" +
                "  title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", assignee='" + assignee + '\'' +
                ", reviewer='" + reviewer + '\'' +
                ", label='" + label + '\'' +
                ", deleteSourceBranch=" + deleteSourceBranch +
                '}');
    }
}
