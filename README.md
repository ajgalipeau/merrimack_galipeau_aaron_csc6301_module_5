# merrimack_galipeau_aaron_csc6301

This repository contains project work for Aaron Galipeau's CSC6301 Software Design and Documentation course at Merrimack College, specific to Module 5.

## Table of Contents
- [About](#about)
- [Projects](#projects)
- [How to Compile & Run](#how-to-compile--run)
- [Generating Javadoc](#generating-javadoc)
- [Folder Structure](#folder-structure)
- [License](#license)

## About
The assignments in this repository include programming tasks that utilize Java's Collections Framework and demonstrate software design principles such as modularity, encapsulation, and code reuse. This project's focus is on implementing data structures (e.g., Linked Lists, Stacks) to more advanced programming concepts.

## Project
- **Week 5 - Linked List:** Linked List Implementation
- **Week 5 - Stack:** Refactor Linked List to SortedStack
- **Additional Maintenance Tasks:** Improvements to code modularity and documentation

## How to Compile & Run
You can compile and run the Java programs directly from the command line. Follow the instructions below for each step.

### Compiling the Code
1. Navigate to the appropriate project folder:
    ```bash
    cd galipeau_aaron_week_5_stack
    ```
2. Compile the Java file:
    ```bash
    javac SortedStack.java
    ```

### Running the Program
1. Run the compiled Java program:
    ```bash
    java SortedStack
    ```
2. Follow the prompts to enter integers and type `end` to complete input. The program will output a sorted stack of integers in ascending order.

## Generating Javadoc
To generate the Javadoc documentation for any Java file:
1. Navigate to the correct folder:
    ```bash
    cd galipeau_aaron_week_5_stack
    ```
2. Run the javadoc command:
    ```bash
    javadoc SortedStack.java
    ```
This will generate HTML documentation in the `docs` folder for easy browsing.

## Folder Structure
The repository is organized as follows:
```
merrimack_galipeau_aaron_csc6301/
├── galipeau_aaron_week_5_list/           # Duplicated Linked List from Week 4
│   ├── uml/
│   │   ├── SortedLinkedList.puml         # PUML file for UML diagrams
│   │   └── SortedLinkedList_Diagram_GalipeauAaronWeek5.png  # UML diagram image
│   └── SortedLinkedList.java             # Duplicated Linked List code
├── galipeau_aaron_week_5_stack/          # Final refactor to SortedStack
│   ├── uml/
│   │   ├── SortedStack.puml              # PUML file for UML diagrams
│   │   ├── SortedStack_Diagram_GalipeauAaronWeek5.pdf # PDF File for submission
|   |   └── SortedStack_Diagram_GalipeauAaronWeek5.png # UML diagram image
│   └── SortedStack.java                  # Final version using Stack
├── out/                                  # Compiled Java classes and output files
│   ├── galipeau_aaron_week_5_list/uml/
│   │   └── SortedLinkedList.png          # UML diagram output for Week 5 list
│   └── galipeau_aaron_week_5_stack/uml/
│       └── SortedStack.png               # UML diagram output for Week 5 stack
├── .gitattributes                        # Auto-generated file from GitHub App
├── .gitignore                            # Git ignore rules
├── LICENSE                               # License for the repository
└── README.md                             # Documentation and usage instructions

```
## Documentation and usage instructions
### License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
