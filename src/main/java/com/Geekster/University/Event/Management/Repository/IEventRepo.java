package com.Geekster.University.Event.Management.Repository;

import com.Geekster.University.Event.Management.Model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IEventRepo extends CrudRepository<Event,Integer> {
    List<Event> findByEventDate(LocalDate Date);
}
