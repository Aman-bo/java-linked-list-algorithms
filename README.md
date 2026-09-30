[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/fUvrF_9R)
# Assignment-02

**Task 1: In the reverse method of LList, implement the *Reverse Linked List* algorithm below.**

**Algorithm to Reverse Linked List**

The goal is to reverse the links between the nodes such that the last node becomes the head and the head becomes the last node.

***For example:***

Initial Linked List: [1] -> [2] -> [3] -> [4] -> [5] -> NULL

Reversed Linked List: NULL <- [1] <- [2] <- [3] <- [4] <- [5]

**Step1: Initialize Pointers**

> prev = NULL (to track the previous node).

> current = head (to track the current node).

> next = NULL (to temporarily store the next node).

**Step 2: Iterate through the list***

> Store the next node: next = current.getNextNode().

> Reverse the link: current.setNextNode(prev).

> Move prev to current.

> Move current to next.

**Step 3: Update head to the last non-null node (prev)**

***Checkpoint:*** *Compile and run LinkedListExtensionsTest. The checkReverse tests should pass. If not, debug and retest.*

**Task 2: In the cycle method of LList, implement the *Linked Cycle* algorithm below.**

**Linked Cycle Algorithm**

The goal is to move the first node to the back of the list.

***For example:***

Initial Linked List: [1] -> [2] -> [3] -> [4] -> [5] -> NULL

cycled Linked List: [2] -> [3] -> [4] -> [5] -> [1] -> NULL

**Step 1: Initialization**

> Create a variable that refers to the second node in the list. 

> Find and then create a variable that refers to the last node in the list.

**Step 2: Update last node reference**

> Make the last node’s next reference be the first node.

**Step 3: Update firstNode content**

> Change the variable firstNode so that it references the second node.

**Step 4: Update former first node’s reference**

> Make the former first node’s next reference be null.

***checkpoint:*** *Compile and run LinkedListExtensionsTest. All tests should pass. If not, debug and retest.*


**Task 3: Primes**

In this task, you are supposed to develop a simple application that uses the LList class with your additional implementations from task 1 and task 2 to find a list of prime numbers and display them in some specific way. The skeleton of the Primes class already exists and is in Primes.java. Please complete the steps below to finish the implementation of this application. 

**Step 1.** Look at the skeleton in Primes.java. Compile Primes. Run the main method in Primes.

**Checkpoint:** If all has gone well, the program will run and accept input. It will then end. The goal now is to create the list of candidates.

**Step 2.** In main declare and create the candidates list. Add in the values. 

**Step 3.** Print out the candidates list.

***Checkpoint:*** Compile and run the program. Enter 7 for the maximum value. You should see the list { <2> <3> <4> <5> <6> <7> }. The next goal is to do a single round finding a prime in the candidates list.

**Step 4.** In main declare and create the primes and composites lists.

**Step 5.** Remove the first value from the primes list and remember it in a variable. 

**Step 6.** Print out the prime that was discovered.

**Step 7.** Add it to the primes list.

**Step 8.** Print out all three lists.

***Checkpoint:*** Compile and run the program. Enter 7 for the maximum value. The value 2 should be removed from the candidates list and added to the primes. Now all values that are divisible by the prime should be removed from the candidates list and added to the composites list. Next, this procedure will be encapsulated in the method getComposites().

**Step 9.** Complete the getComposites() method. To determine if one integer value is divisible by another, you can use the modulus operator (% in Java).

**Step 10.** Between the code from steps 7 and 8, call getComposites().

**Step 11.** Call the reverse() on each list and print out all three lists.

**Step 12.** Call the cycle() on each list and print out all three lists.

GOOD LUCK and HAVE FUN!

