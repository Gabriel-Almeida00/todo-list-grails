package todo.list


import grails.rest.*
import grails.converters.*

class AlarmController extends RestfulController {
    static responseFormats = ['json', 'xml']
    AlarmController() {
        super(Alarm)
    }

    AlarmService alarmService
}
