package ro.tuc.ds2020.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.tuc.ds2020.entities.Record;
import ro.tuc.ds2020.entities.Sensor;

import java.util.UUID;

@Repository
public interface RecordRepository extends JpaRepository<Record, UUID> {
    Record findFirstBySensor(Sensor sensor);
}
