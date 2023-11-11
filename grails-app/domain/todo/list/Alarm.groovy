package todo.list

import java.time.LocalDateTime

class Alarm {

    Integer task_id
    LocalDateTime alarm_time
    String description
    Integer alarm_period_minutes
    Boolean status

    static constraints = {
    }
}
