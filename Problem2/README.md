Astronaut Daily Schedule Organizer

Overview:

The Astronaut Daily Schedule Organizer is a console-based Java application that helps astronauts manage their daily tasks efficiently.
It demonstrates OOP, SOLID principles, and design patterns (Singleton, Factory, Observer) while implementing CRUD operations for task management.

Features

1.Add Task (with description, start time, end time, and priority level).

2.Remove Task.

3.View All Tasks (sorted by start time).

4.Validate Conflicts (no overlapping tasks allowed).

5.Error Handling (invalid time, missing task, etc.).

Optional Features:

.Mark tasks as completed.

.View tasks by priority.

esign Patterns Used

1.Singleton Pattern → ScheduleManager ensures only one instance of the scheduler exists.

2.Factory Pattern → TaskFactory validates and creates Task objects.

3.Observer Pattern → ConflictNotifier alerts users of overlapping tasks.

Project Structure:
AstronautScheduleOrganizer/
 ├── src/
 │   ├── Task.java
 │   ├── TaskFactory.java
 │   ├── ConflictObserver.java
 │   ├── ConflictNotifier.java
 │   ├── ScheduleManager.java
 │   └── AstronautScheduleApp.java
 └── README.md
