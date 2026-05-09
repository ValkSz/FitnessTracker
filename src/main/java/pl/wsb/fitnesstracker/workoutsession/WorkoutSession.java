package pl.wsb.fitnesstracker.workoutsession;

import jakarta.persistence.*;
import pl.wsb.fitnesstracker.training.internal.ActivityType;
import pl.wsb.fitnesstracker.user.api.User;
import pl.wsb.fitnesstracker.training.api.Training;

import java.time.LocalDateTime;
import java.util.Date;

// TODO: Define the Event entity with appropriate fields and annotations | done, i think?

@Entity
@Table(name = "workoutsession")
public class WorkoutSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "trainingId")
    private Training trainingId;

    @Column(name = "timestamp")
    private LocalDateTime timestamp;

    @Column(name = "startLatitude")
    private double startLatitude;

    @Column(name = "startLongitude")
    private double startLongitude;

    @Column(name = "endLatitude")
    private double endLatitude;

    @Column(name = "endLongitude")
    private double endLongitude;

    @Column(name = "altitude")
    private double altitude;

    public WorkoutSession(
            final long id,
            final Training trainingId,
            final LocalDateTime timestamp,
            final double startLatitude,
            final double startLongitude,
            final double endLatitude,
            final double endLongitude,
            final double altitude) {
        this.id = id;
        this.trainingId = trainingId;
        this.timestamp = timestamp;
        this.startLatitude = startLatitude;
        this.startLongitude = startLongitude;
        this.endLatitude = endLatitude;
        this.endLongitude = endLongitude;
        this.altitude = altitude;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Training getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(Training trainingId) {
        this.trainingId = trainingId;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public double getStartLatitude() {
        return startLatitude;
    }

    public void setStartLatitude(double startLatitude) {
        this.startLatitude = startLatitude;
    }

    public double getStartLongitude() {
        return startLongitude;
    }

    public void setStartLongitude(double startLongitude) {
        this.startLongitude = startLongitude;
    }

    public double getEndLatitude() {
        return endLatitude;
    }

    public void setEndLatitude(double endLatitude) {
        this.endLatitude = endLatitude;
    }

    public double getEndLongitude() {
        return endLongitude;
    }

    public void setEndLongitude(double endLongitude) {
        this.endLongitude = endLongitude;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }
}
