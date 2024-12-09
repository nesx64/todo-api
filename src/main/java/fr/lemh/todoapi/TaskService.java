package fr.lemh.todoapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

    public List<Task> getCompletedTasks() {
        return taskRepository.findByCompleted(true);
    }

    public List<Task> getUncompletedTasks() {
        return taskRepository.findByCompleted(false);
    }

    public Task getTaskById(Long taskId) {
        return taskRepository.findById(taskId).orElseThrow(() -> new IllegalArgumentException("Given task id doesn't exist. Try another id."));
    }

    public Task addTask(Task task) {
        return taskRepository.save(task);
    }

    public Task markTaskAsCompleted(Long taskId) {
        Task task = taskRepository.findById(taskId).orElseThrow(() -> new IllegalArgumentException("Given task id wasn't found."));
        task.setCompleted(true);
        return taskRepository.save(task);
    }

    public boolean deleteTask(Long taskId) {
        if (taskRepository.existsById(taskId)) {
            taskRepository.deleteById(taskId);
            return true;
        }
        return false;
    }
}
