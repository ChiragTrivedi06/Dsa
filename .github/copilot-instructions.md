# Copilot Instructions for the DSA Codebase

Welcome to the DSA codebase! This document provides essential guidelines for AI coding agents to be productive in this project. It highlights the architecture, workflows, and conventions specific to this repository.

## Big Picture Overview

This repository is organized into multiple directories, each focusing on a specific topic in Data Structures and Algorithms (DSA):

- **Binary_Search/**: Contains implementations of binary search algorithms (e.g., `Lower_bound.java`).
- **JCF/**: Demonstrates Java Collection Framework usage (e.g., `List1.java`, `Main.java`).
- **linkedlist/**: Implements linked list data structures (e.g., `ListImplementation.java`).
- **oops/**: Covers Object-Oriented Programming concepts (e.g., `abstraction.java`, `basic_oops.java`).
- **Pattern_Printing/**: Focuses on pattern generation algorithms.
- **recursion/**: Contains recursive algorithm examples (e.g., `binary_string.py`).

### Key Architectural Patterns

1. **Topic-Based Organization**: Each directory corresponds to a specific DSA topic, making it easy to locate related implementations.
2. **Language-Specific Files**: The repository includes both Java and Python files, with Java being the dominant language.
3. **Entry Points**: Most directories have a `Main.java` or equivalent file that serves as the entry point for execution.

## Developer Workflows

### Building and Running Java Files

1. Navigate to the directory containing the Java file to execute.
2. Compile the Java file:
   ```bash
   javac FileName.java
   ```
3. Run the compiled file:
   ```bash
   java FileName
   ```

Example:
```bash
cd JCF
javac List1.java
java List1
```

### Running Python Scripts

1. Navigate to the directory containing the Python script.
2. Execute the script:
   ```bash
   python3 script_name.py
   ```

Example:
```bash
cd recursion
python3 binary_string.py
```

## Project-Specific Conventions

- **Java Package Naming**: Java files are organized into packages (e.g., `JCF`, `oops`). Ensure the `package` declaration matches the directory structure.
- **File Naming**: File names are descriptive and indicate their purpose (e.g., `Lower_bound.java` for lower bound binary search).
- **Code Style**: Follow standard Java and Python conventions. Use meaningful variable names and include comments for clarity.

## Integration Points

- **Cross-Component Communication**: Minimal. Each directory is self-contained, focusing on a specific topic.
- **External Dependencies**: None. The repository relies on standard Java and Python libraries.

## Examples of Patterns

### Java Example: Using the Java Collection Framework

File: `JCF/List1.java`
```java
import java.util.*;

public class List1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
    }
}
```

### Python Example: Recursive Binary String Generation

File: `recursion/binary_string.py`
```python
def generate_binary_strings(n, prefix=""):
    if n == 0:
        print(prefix)
    else:
        generate_binary_strings(n-1, prefix + "0")
        generate_binary_strings(n-1, prefix + "1")

generate_binary_strings(3)
```

## Key Files and Directories

- **JCF/**: Learn Java Collection Framework basics.
- **oops/**: Understand OOP concepts in Java.
- **recursion/**: Explore recursive algorithms in Python.

---

Feel free to update this document as the project evolves. If any section is unclear or incomplete, please provide feedback for improvement!