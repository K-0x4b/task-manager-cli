# Task Manager CLI

[![Java](https://img.shields.io/badge/Java-17%2B-blue.svg)](https://www.oracle.com/java/)
[![License: MIT](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)

A simple Java command-line application for managing your daily tasks. Add, view, complete, and delete tasks easily from your terminal with an intuitive interface.

---

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Roadmap](#roadmap)
- [Contributing](#contributing)
- [License](#license)
- [Author](#author)

---

## Overview

**Task Manager CLI** is a lightweight Java application that helps you stay organized by letting you keep track of tasks, set priorities, and mark tasks as completed—all through an intuitive terminal interface.

---

## Features

- Add tasks with title, description, due date, and priority
- View a list of all tasks with their details
- Mark tasks as completed
- Delete tasks by ID
- Simple, interactive CLI with input validation

---

## Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/0x-4b/task-manager-cli.git
   cd task-manager-cli
   ```

2. **Compile the source code:**
   ```bash
   javac src/*.java
   ```

---

## Usage

1. **Run the application:**
   ```bash
   java -cp src Main
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
└── LICENSE
```

---

## Roadmap

- [ ] Add sorting and filtering for tasks
- [ ] Implement search by keyword
- [ ] Improve error and help messages
- [ ] Enhance input validation

---

## Contributing

Pull requests and suggestions are welcome!  
Please [open an issue](https://github.com/0x-4b/task-manager-cli/issues) to discuss changes or enhancements, or submit a pull request.

---

## License

This project is licensed under the [MIT License](LICENSE).

---

## Author

**0x-4b**  
GitHub: [@0x-4b](https://github.com/0x-4b)

---
