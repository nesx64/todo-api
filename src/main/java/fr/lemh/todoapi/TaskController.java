package fr.lemh.todoapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/tasks")
    public List<Task> getAllTasks() {
        return taskService.getTasks();
    }

    @GetMapping("/tasks/{id}")
    public Task getTask(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }

    @PostMapping("/tasks")
    public Task createTask(@RequestBody Task task) {
        return taskService.addTask(task);
    }

    @PutMapping("/tasks/{id}")
    public Task completeTask(@PathVariable Long id) {
        return taskService.markTaskAsCompleted(id);
    }

    @DeleteMapping("/tasks/{id}")
    public boolean deleteTask(@PathVariable Long id) {
        return taskService.deleteTask(id);
    }
}
