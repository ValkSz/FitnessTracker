package pl.wsb.fitnesstracker.healthmetrics;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import pl.wsb.fitnesstracker.user.api.User;

import java.util.Date;

@Entity
@Table(name = "health_metrics")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class Healthmetrics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Nullable
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "weight", nullable = false)
    private double weight;

    @Column(name = "height", nullable = false)
    private double height;

    @Column(name = "heart_rate", nullable = false)
    private double heart_rate;

    public Healthmetrics(
            final Long id,
            final User user,
            final Date date,
            final double weight,
            final double height,
            final double heart_rate) {

        this.id = id;
        this.user = user;
        this.date = date;
        this.weight = weight;
        this.height = height;
        this.heart_rate = heart_rate;
    }
}
