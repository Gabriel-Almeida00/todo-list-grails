package todo.list

class Category {

    String name
    String description
    static hasMany = [tasks: Task]

    static constraints = {
        name blank: false
        description blank: false
    }
}
