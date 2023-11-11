package todo.list

import java.time.LocalDateTime

class Task {

    String name
    String description
    LocalDateTime deadline
    Integer priority
    TaskStatus status

    static  belongsTo = [category: Category, usuario: Usuario]
    static hasMany = [alarms: Alarm]

    static constraints = {
        name blank: false
        description blank: false
        deadline blank: false
        priority blank: false
        status blank: false
    }
}
