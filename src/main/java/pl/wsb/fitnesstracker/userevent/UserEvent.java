package pl.wsb.fitnesstracker.userevent;

import jakarta.persistence.*;
import pl.wsb.fitnesstracker.event.Event;
import pl.wsb.fitnesstracker.user.api.User;

import java.time.LocalDateTime;


@Entity
@Table(name = "user_event")
public class UserEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user_id;

    @JoinColumn(name = "event_id")
    @ManyToOne
    private Event event_id;

    private double status;

    public long getId() {
        return id;
    }

    public User getUser_id() {
        return user_id;
    }

    public Event getEvent_id() {
        return event_id;
    }

    public double getStatus() {
        return status;
    }

    public UserEvent(User user_id, Event event_id) {
        this.user_id = user_id;
        this.event_id = event_id;
    }

    public UserEvent(long id, User user_id, Event event_id, double status) {
        this.id = id;
        this.user_id = user_id;
        this.event_id = event_id;
        this.status = status;
    }
}
