package todo.list

class Category {

    String name
    String description

    static constraints = {
        name blank: false
        description blank: false
    }
}
