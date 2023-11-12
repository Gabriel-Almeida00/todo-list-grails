package todo.list


import grails.rest.*
import grails.converters.*

class UsuarioController extends RestfulController {
    static responseFormats = ['json', 'xml']
    UsuarioController() {
        super(Usuario)
    }
    UsuarioService usuarioService

}
