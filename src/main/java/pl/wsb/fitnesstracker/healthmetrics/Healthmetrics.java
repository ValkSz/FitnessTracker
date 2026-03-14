package pl.wsb.fitnesstracker.healthmetrics;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

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

    @Column(name = "user_id", nullable = false)
    private Long user_id;

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
            final Long user_id,
            final Date date,
            final double weight,
            final double height,
            final double heart_rate) {

        this.id = id;
        this.user_id = user_id;
        this.date = date;
        this.weight = weight;
        this.height = height;
        this.heart_rate = heart_rate;
    }
}
