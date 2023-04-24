package ru.adel.sensorapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.adel.sensorapp.models.Measurement;



@Repository
public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {
}
