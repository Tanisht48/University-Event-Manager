package com.Geekster.University.Event.Management.Service;

import com.Geekster.University.Event.Management.Model.Event;

import com.Geekster.University.Event.Management.Repository.IEventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    @Autowired
    IEventRepo iEventRepo;

    public String addAEvent(Event eve) {

        iEventRepo.save(eve);

        return "New Event Added!!!";
    }

    public String addEvents(List<Event> eve) {
        iEventRepo.saveAll(eve);

        return "Event added";
    }

    public Iterable<Event> getAllEvents() {

        return iEventRepo.findAll();
    }

    public Optional<Event> getEventById(Integer id) {
        return iEventRepo.findById(id);
    }

    public Iterable<Event> getEventsOnSameDate(LocalDate date) {
        return iEventRepo.findByEventDate(date);
    }

    public String updateEventLocationById(Integer id, String locEve)  {
        Optional<Event> s = iEventRepo.findById(id);

        if (s.isEmpty()) {
            return "Event not Found!!!";
        }

        Event eve = s.get();
        eve.setLocationOfEvent(locEve);
        iEventRepo.save(eve);
        return "Location updated for the event";

    }
}
