package pl.wsb.fitnesstracker.training.internal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.wsb.fitnesstracker.training.api.Training;

public interface TrainingRepository extends JpaRepository<Training, Long> {
    @Query(
            value = "SELECT SUM(distance) FROM Trainings WHERE user_id = :userID",
            nativeQuery = true)
    long countKilometers(@Param("userID") long userID);
}