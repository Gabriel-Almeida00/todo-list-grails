package todo.list


import grails.rest.*
import grails.converters.*

class CategoryController extends RestfulController {
    static responseFormats = ['json', 'xml']
    CategoryController() {
        super(Category)
    }

    CategoryService categoryService
}
