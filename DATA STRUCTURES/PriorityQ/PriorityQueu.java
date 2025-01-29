import java.util.*;
public class PriorityQueu{

    static class Student implements Comparable<Student>{ //overriding
        String name;
        int rank;

        public Student(String name,int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        } 
    }
    
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("A",5));
        pq.add(new Student("B",4));
        pq.add(new Student("c",7));





        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name+"->"+pq.peek().rank);
            pq.remove();
        }
    }
}



// Let's walk through how Java automatically handles comparisons, focusing specifically on what happens when you insert a new `Student` and it gets compared with the first inserted object.

// ### Example Step-by-Step:

// 1. **Inserting the first object:**
//    java
//    pq.add(new Student("A", 5));  // First inserted student
//    
//    When you add the first `Student` object (`Student("A", 5)`), there are no other objects in the `PriorityQueue`, so no comparison is needed at this point. `Student("A", 5)` just gets placed in the queue.

// 2. **Inserting the second object:**
//    java
//    pq.add(new Student("B", 4));  // Second inserted student
//    
//    - Now, when you insert `Student("B", 4)`, the `PriorityQueue` needs to decide where to place this new student relative to `Student("A", 5)` (the first inserted object).

//    - To do this, Java **automatically calls** the `compareTo` method to compare `Student("B", 4)` (the new object) with `Student("A", 5)` (the existing object in the queue).

// ### What happens in the `compareTo` method?

// The comparison between `Student("B", 4)` and `Student("A", 5)` happens like this:

// 1. Java internally calls:
//    java
//    studentB.compareTo(studentA);
//    
//    - `studentB` is `this` (the new object being added, `Student("B", 4)`).
//    - `studentA` is passed as `s2` (the object already in the queue, `Student("A", 5)`).

// 2. The `compareTo` method gets invoked:
//    java
//    @Override
//    public int compareTo(Student s2) {
//        return this.rank - s2.rank;
//    }
//    
//    - `this.rank` refers to `studentB.rank`, which is 4.
//    - `s2.rank` refers to `studentA.rank`, which is 5.

//    So the comparison is:
//   java
//    return 4 - 5;  // This equals -1
//    

// 3. **What does this result mean?**
//    - Since the result is **negative** (`-1`), it means that `studentB` (rank 4) has a **higher priority** than `studentA` (rank 5) according to the `compareTo` logic. Therefore, `studentB` will be placed before `studentA` in the queue.

// ### Inserting a third object:

// Now, let's say you add another student:
// java
// pq.add(new Student("C", 7));  // Third inserted student
// 

// Here’s what happens:

// 1. The `PriorityQueue` will again compare `Student("C", 7)` with the existing students (`Student("B", 4)` and `Student("A", 5)`).
   
// 2. First, Java might compare `Student("C", 7)` with `Student("B", 4)`:
//    java
//    studentC.compareTo(studentB);  // Internally called by PriorityQueue
//    
//    - `this.rank = 7` (for `studentC`).
//    - `s2.rank = 4` (for `studentB`).
//    java
//    return 7 - 4;  // This equals 3
//   
//    - Since the result is **positive**, `studentC` has **lower priority** than `studentB`, so `studentC` will go after `studentB`.

// 3. If necessary, it might compare `studentC` with `studentA` as well, but since we already know `studentC` has a higher rank (lower priority), it will end up at the end of the queue.

// ### Summary:
// - **When the second student (`Student("B", 4)`) is added**, Java automatically compares it with the first student (`Student("A", 5)`).
// - The comparison (`studentB.compareTo(studentA)`) determines the order based on their ranks (4 vs. 5).
// - You don’t manually pass `s2`; Java handles it by passing `Student("A", 5)` (the first object) to the `compareTo` method as `s2` when comparing it to `Student("B", 4)` (the new object).