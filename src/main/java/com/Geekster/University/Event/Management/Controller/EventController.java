package com.Geekster.University.Event.Management.Controller;

import com.Geekster.University.Event.Management.Model.Event;
import com.Geekster.University.Event.Management.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
public class EventController {

    @Autowired
    EventService eventService;

    @PostMapping("event")
    public String addAEvent(@RequestBody Event eve)
    {
        return eventService.addAEvent(eve);
    }

    @PostMapping("events")
    public String addEvents(@RequestBody List<Event> eve)
    {
        return eventService.addEvents(eve);
    }

    @GetMapping("events")
    public Iterable<Event> getAllEvents()
    {
        return  eventService.getAllEvents();
    }

    @GetMapping("event/{id}")
    public Optional<Event> getEventById(@PathVariable Integer id)
    {
        return eventService.getEventById(id);
    }

    @GetMapping("events/date")
    public Iterable<Event> getEventsOnSameDate(@RequestParam LocalDate date)
    {
        return eventService.getEventsOnSameDate(date);
    }

    @PutMapping("event/id/{id}/location/{locEve}")
    public String updateEventLocationById(@PathVariable Integer id ,@PathVariable String locEve)
    {
        return eventService.updateEventLocationById(id,locEve);
    }

}


/*Add event
Update event
Delete event
Get all events
Get All events by date*/