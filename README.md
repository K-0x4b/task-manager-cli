# Task Manager CLI

[![Java](https://img.shields.io/badge/Java-17%2B-blue.svg)](https://www.oracle.com/java/)
[![License: MIT](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)

A straightforward Java command-line app for managing your daily tasks efficiently. Quickly add, list, complete, and delete tasks via an intuitive terminal interface.

---

## Table of Contents

- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Roadmap](#roadmap)
- [Contributing](#contributing)
- [License](#license)
- [Author](#author)

---

## Features

- Add tasks with title, description, due date, and priority
- View all tasks in a list
- Mark tasks as completed
- Delete tasks by ID
- Simple and interactive CLI with input validation

---

## Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/K-0x4b/task-manager-cli.git
   cd task-manager-cli
   ```

2. **Compile the source code:**
   ```bash
   cd src
   javac *.java
   ```

---

## Usage

1. **Run the application:**
   ```bash
   java Main
   ```
2. **Example session:**
   ```
   ==== Task Manager ====
   1. Add Task
   2. List Tasks
   3. Mark Task as Completed
   4. Delete Task
   5. Exit
   Enter your choice: 1
   ...
   ```

---

## Project Structure

```
task-manager-cli/
├── src/
│   ├── Main.java
│   ├── Task.java
│   └── TaskManager.java
├── .gitignore
├── README.md
```

---

## Roadmap

- [ ] Add sorting and filtering for tasks
- [ ] Implement search by keyword
- [ ] Improve error and help messages
- [ ] Enhance input validation

---

## Contributing

Pull requests and suggestions are welcome! Please open an issue to discuss changes or enhancements.

---

## License

This project is licensed under the [MIT License](LICENSE).

---

## Author

**Kareem MohamedElhassan**  
GitHub: [@K-0x4b](https://github.com/K-0x4b)
