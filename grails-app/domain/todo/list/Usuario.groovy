package todo.list

class Usuario {

    String name
    String email
    String password

    static constraints = {
        name blank: false
        email blank: false
        password blank: false
    }
}
