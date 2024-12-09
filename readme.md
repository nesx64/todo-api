
<div style="display: flex; justify-content: center; align-items: center">

<img src="https://cdn-icons-png.freepik.com/256/7692/7692366.png?semt=ais_hybrid" width="50" height="50" title="todolist icon" alt="Just a basic todolist icon">

# Todo-Api

</div>

***
## Basic API for todo-list
### Built with Gradle & SpringBoot

This basic API is just a training version for REST API building using Java Spring Boot.
Every response, except for deletion, is `JSON`.

***

## Endpoints

### `GET` - Return the list of tasks.

```shell
/home/user/todo/$~ curl -X http://localhost:8080/tasks
```

#### Example of return

```json
[
  {"id":1,"title":"Buy groceries and fruits","completed":true}, 
  {"id":2,"title":"Do my git commit!","completed":false}
]
```

***

### `GET` - Return the task corresponding to the given id.

```shell
/home/user/todo/$~ curl -X http://localhost:8080/tasks/<id>
```

#### Example of return

```json
{"id":4,"title":"Do my git commit!","completed":false}
```

***

### `POST` - Add a new task.

```shell
/home/user/todo/$~ curl -X POST http://localhost:8080/tasks \
  -H "Content-Type: application/json" \
  -d '{"title": "<title>", "completed": <status>}'
```

#### Example of return

```json
{"id":3,"title":"Buy groceries and fruits","completed":true}
```

***

### `PUT` - Update the task of the given id.

```shell
/home/user/todo/$~ curl -X PUT http://localhost:8080/tasks/<id> \
  -H "Content-Type: application/json" \
  -d '{"name": "<title>", "completed": <status>}'
```

#### Example of return

```json
{"id":3,"title":"Buy groceries and fruits","completed":true}
```

***

### `DELETE` - Delete the task of the given id.

```shell
/home/user/todo/$~ curl -X DELETE http://localhost:8080/tasks/1
```

#### Example of return

```json
true //if the deletion was successfull
```




