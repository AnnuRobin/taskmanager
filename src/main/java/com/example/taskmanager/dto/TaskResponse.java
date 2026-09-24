package com.example.taskmanager.dto;

import com.example.taskmanager.entity.Task;

public class TaskResponse {

    private Long id;
    private String title;
    private String description;
    private Task.Status status;
    private Task.Priority priority;

    public TaskResponse(
            Long id,
            String title,
            String description,
            Task.Status status,
            Task.Priority priority) {

        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.priority = priority;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Task.Status getStatus() {
        return status;
    }

    public Task.Priority getPriority() {
        return priority;
    }
}