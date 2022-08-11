package com.burakgungor.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        MergeRequest mergeRequest = new MergeRequest();
        mergeRequest.setTitle("design-patterns");
        mergeRequest.setDescription("observer");
        mergeRequest.setLabel("behavioral");
        mergeRequest.setAssignee("burakgungor");
        mergeRequest.setReviewer("burakgungor");
        mergeRequest.setDeleteSourceBranch(Boolean.TRUE);

        Repository repository = new Repository(mergeRequest);
        repository.setName("design-patterns");
        repository.setVisibilityLevel("public");
        repository.setSlug("pattern");

        mergeRequest.notifySubscribers();


    }
}
