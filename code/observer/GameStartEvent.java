package observer;

import java.sql.Date;

public class GameStartEvent {

    private final Date startTime;

    public GameStartEvent(Date startTime) {
        super();
        this.startTime = startTime;
    }

    public Date getStartTime() {
        return startTime;
    }

}
