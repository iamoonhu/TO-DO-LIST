# To-Do List Application

A simple and intuitive desktop To-Do List application built with Java Swing. This application allows users to manage their daily tasks efficiently with a clean graphical user interface.

## Features

- Add new tasks with a single click
- Mark tasks as complete/incomplete with checkboxes
- Delete tasks easily
- Clean and user-friendly interface
- Persistent task management during runtime

## Project Structure

The project consists of four main Java files:
```
├── App.java                 # Main entry point of the application
├── CommonConstants.java     # Contains UI dimensions and constant values
├── TaskComponent.java       # Individual task component with checkbox and delete functionality
└── ToDoList.java           # Main UI container that manages all task components
```

### File Descriptions

- **App.java**: The main class that initializes and launches the application.

- **CommonConstants.java**: Stores all the constant values used throughout the application, including window dimensions, component sizes, colors, fonts, spacing and padding values.

- **TaskComponent.java**: Represents a single task item with checkbox for marking completion, task text field, delete button, and visual styling for completed tasks.

- **ToDoList.java**: The main application window that creates the GUI layout, manages the collection of tasks, handles adding new tasks, and coordinates between different components.

## Requirements

- Java Development Kit (JDK) 8 or higher
- Java Swing library (included in JDK)

## Installation

1. Clone the repository:
```bash
git clone https://github.com/iamoonhu/todo-list-java.git
```

2. Navigate to the project directory:
```bash
cd todo-list-java
```

3. Compile the Java files:
```bash
javac *.java
```

4. Run the application:
```bash
java App
```

## Usage
1. **Adding a Task**: Click the "Add Task" button to create a new task entry.
2. **Completing a Task**: Check the checkbox next to a task to mark it as complete.
3. **Deleting a Task**: Click the delete button to remove a task from the list.
4. **Editing a Task**: Click on the task text field to edit the task description.

## Contributing
Contributions are welcome! Please feel free to submit a Pull Request.

## Future Enhancements
- Save tasks to a file for persistence across sessions
- Add task priority levels
- Implement task categories or tags
- Add due dates and reminders
- Search and filter functionality
- Dark mode theme


##Author
[@iamoonhu](https://github.com/iamoonhu)
