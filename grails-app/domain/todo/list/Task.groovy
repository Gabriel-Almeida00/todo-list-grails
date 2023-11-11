package todo.list

import java.time.LocalDateTime

class Task {

    String name
    String description
    LocalDateTime deadline
    Integer priority
    TaskStatus status
    Integer category_id
    Integer user_id
    static  belongsTo = [category: Category, user: Usuario]

    static constraints = {
        name blank: false
        description blank: false
        deadline blank: false
        priority blank: false
        status blank: false
        category_id blank: false
        user_id blank: false
    }
}
