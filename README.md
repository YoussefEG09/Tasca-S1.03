# Tasca-S1.03
This project contains a set of programming exercises written in Java, divided into two difficulty levels. The exercises cover data structures such as `ArrayList`, `HashSet`, `HashMap`, `ListIterator`, and custom object sorting using interfaces like `Comparable` and `Comparator`.

---

## 🧭 Table of Contents

- [Level 1](#level-1)
  - [Exercise 1 - Month Class](#exercise-1---month-class)
  - [Exercise 2 - List Reversal](#exercise-2---list-reversal)
  - [Exercise 3 - Capital Cities Quiz](#exercise-3---capital-cities-quiz)
- [Level 2](#level-2)
  - [Exercise 1 - Restaurant Class with HashSet](#exercise-1---restaurant-class-with-hashset)
  - [Exercise 2 - Sorting Restaurants](#exercise-2---sorting-restaurants)

---

## Level 1

### Exercise 1 - `Month` Class

- A class named `Month` is created with an attribute `name`.
- 11 `Month` objects are added to an `ArrayList` (excluding "August").
- "August" is then inserted in its correct position in the list.
- The `ArrayList` is converted into a `HashSet` to ensure no duplicates are allowed.
- The collection is iterated using both a `for` loop and an `Iterator`.

🧪 **Key Concepts**:
- Working with collections (`ArrayList`, `HashSet`)
- Specific insertions and order management
- Iterators and loops

---

### Exercise 2 - List Reversal

- A `List<Integer>` is created and populated.
- A second list is created, into which the elements of the first list are inserted in reverse order.
- A `ListIterator` is used to traverse and reverse the list.

🧪 **Key Concepts**:
- Usage of `List` and `ListIterator`
- List manipulation and element reordering
- Reversing a list using iterators

---

### Exercise 3 - Capital Cities Quiz

- The program reads a file named `countries.txt` containing country-capital pairs.
- These are stored in a `HashMap<String, String>`.
- The program asks for the user's name.
- In 10 rounds, a random country is shown, and the user must type its capital.
- Each correct answer earns 1 point.
- After 10 rounds, the user's name and score are saved in `classificacio.txt`.

🧪 **Key Concepts**:
- File reading and parsing
- Using `HashMap` and random selection
- Console input/output
- File writing for saving scores

---

## Level 2

### Exercise 1 - `Restaurant` Class with `HashSet`

- A class `Restaurant` is created with two attributes: `name` (String) and `rating` (int).
- The `equals()` and `hashCode()` methods are overridden to prevent adding restaurants with the **same name and rating** into a `HashSet`.
- Duplicate names are allowed only if the rating differs.

🧪 **Key Concepts**:
- Custom class creation
- Implementing `equals()` and `hashCode()`
- Managing duplicates in `HashSet`

---

### Exercise 2 - Sorting Restaurants

- Building on the previous exercise, restaurant objects are now sorted.
- The sorting is based on:
  - Name (alphabetical order)
  - Rating (descending order)
- Sorting is implemented using either `Comparable` or a custom `Comparator`.

🧪 **Key Concepts**:
- Sorting custom objects
- Using `Comparator` or implementing `Comparable`
- Working with sorted collections like `TreeSet` or sorted `List`


## 🚀 How to Compile & Run
This project is developed in **Java**. You can compile and run the exercises from the terminal with the following commands:

### ✅ Prerequisites

- Java Development Kit (JDK) 8 or higher must be installed.
You can verify this with:

```bash
java -version
javac -version

