# University-Event-Manager
___
## FrameWork and Language
    Framework:SpringBoot
    Language : Java
## Dependencies
    SpringBoot Starter Web
    Lombok
    Validation
    h2
    Jpa

## Data Flow
  ### Model
   #### Student
   1. private Integer studentId;@Id
   2. private String firstName; @Pattern(regexp = "^[A-Z][a-z]*$")
   3. private String lastName; @Pattern(regexp = "^[A-Z][a-z]*$")
   4. private Integer age;@Min(value = 18) @Max(value = 25)
   5. private Department studentDepartment; @Enumerated(EnumType.STRING)
  #### Event
   1. private Integer  eventId;
   2.  private String eventName;
   3.  private String locationOfEvent;
   4.  private LocalDate eventDate;
   5.  private LocalTime startTime;
   6.  private LocalTime endTime;
  ### Controller
   #### Student
   1. @PostMapping("Student")
   2. @PostMapping("Students")
   3. @GetMapping("students")
   4. @GetMapping("student/{id}")
   5. @PutMapping("student/{id}/{department}")
   6.  @DeleteMapping("student/{id}")
   #### Event
  1. @PostMapping("event")
  2. @PostMapping("events")
  3. @GetMapping("events")
  4. @GetMapping("event/{id}")
  5. @GetMapping("events/date")
  6.  @PutMapping("event/id/{id}/location/{locEve}")
  7.  @DeleteMapping("event/{id}")
   

      
## Project Summary
  In this application we can  Create Read Update Delete a Student and Events from the different api that are in this application
