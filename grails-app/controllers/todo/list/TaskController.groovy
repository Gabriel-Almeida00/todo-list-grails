package todo.list


import grails.rest.*
import grails.converters.*

class TaskController extends RestfulController {
    static responseFormats = ['json', 'xml']
    TaskController() {
        super(Task)
    }

    TaskService taskService
}
