package pl.wsb.fitnesstracker.userevent;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "UserEvent")
public class UserEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private long user_id;

    @OneToMany
    @Column(name = "event_id")
    private double event_id;

    @Column(name = "status")
    private double status;

    public UserEvent(
            final long id,
            final long user_id,
            final double event_id,
            final double status) {
        this.id = id;
        this.user_id = user_id;
        this.event_id = event_id;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public double getEvent_id() {
        return event_id;
    }

    public void setEvent_id(double event_id) {
        this.event_id = event_id;
    }

    public double getStatus() {
        return status;
    }

    public void setStatus(double status) {
        this.status = status;
    }
}
