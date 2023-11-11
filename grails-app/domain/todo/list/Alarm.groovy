package todo.list

import java.time.LocalDateTime

class Alarm {

    LocalDateTime alarm_time
    String description
    Integer alarm_period_minutes
    Boolean status
    static belongsTo = [task: Task]

    static constraints = {
        alarm_time blank: false
        description blank: false
        alarm_period_minutes blank: false
        status blank: false
    }
}
