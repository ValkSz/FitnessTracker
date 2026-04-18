package pl.wsb.fitnesstracker.event;

import jakarta.persistence.*;


@Entity
@Table(name = "Event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @JoinColumn(name = "name")
    private long name;

    @JoinColumn(name = "description")
    private long description;

    @JoinColumn(name = "startTime")
    private long startTime;

    @JoinColumn(name = "endTime")
    private long endTime;

    @JoinColumn(name = "country")
    private long country;

    @JoinColumn(name = "city")
    private long city;

    public Event(
            final long id,
            final long name,
            final long description,
            final long startTime,
            final long endTime,
            final long country,
            final long city) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.country = country;
        this.city = city;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getName() {
        return name;
    }

    public void setName(long name) {
        this.name = name;
    }

    public long getDescription() {
        return description;
    }

    public void setDescription(long description) {
        this.description = description;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getCountry() {
        return country;
    }

    public void setCountry(long country) {
        this.country = country;
    }

    public long getCity() {
        return city;
    }

    public void setCity(long city) {
        this.city = city;
    }
}
