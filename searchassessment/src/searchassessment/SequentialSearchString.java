package searchassessment;

import utils.In;
import utils.Stopwatch;

/**
 * The class SequentialSearchString provides a framework for implementing a
 * sequential search on a collection of strings as input.
 *
 * Searching in collections is done to answer the following questions: - Does
 * the element exists in a collection? -> method contains() - How to get the
 * element from a collection? - > method indexOf()
 *
 * "Collection" in this class is used in the broader sense and not in the strict
 * Java sense. For example a collection may be an array or a list
 *
 * --------------------------------------------------------------------------
 * YOUR TASKS
 *
 * QUESTION 2: a. implement indexOf method b. test it using JUnit test class
 * provided SequentialSearchStringTest.java
 *
 * QUESTION 3: a. Implement main method to read data from a file, call the
 * indexOf method and print the search result and execution time b. Perform
 * several measurements using data sets provided: run the program (this class)
 * several times, i.e. with each of the data sets provided, and record the
 * results c. implement a step counter and perform measurements again. Record
 * your results.
 *
 * --------------------------------------------------------------------------
 *
 * @author Computer Power Plus
 * @author 92020283, Dion Brook
 */
public class SequentialSearchString {
    // Counter for index
    static int count = 0;

    /**
     * Checks if collection contains an item.
     *
     * @param term the search term, in this case a String
     * @param collection the collection to be searched, in this case an array of
     * Strings
     * @return true if collection contains the term, false otherwise
     *
     */
    public static boolean contains(String term, String[] collection) {
        // Reuses the algorithm implementation in indexOf() 
        return (indexOf(collection, term) != -1);
    }

    /**
     * Finds the index of an item in a collection if it contains an item.
     *
     * @param term the search term, in this case a String
     * @param collection the collection to be searched, in this case an array of
     * Strings
     * @return int index of item in the array if found, otherwise -1
     *
     */
    // QUESTION 2
    // IMPLEMENT THE SEQUENTIAL SEARCH    
    public static int indexOf(String[] collection, String term) {

        for (int index = 0; index < collection.length; index++) {
            if (collection[index].equals(term)) {
                System.out.println("Exit loop after Step " + count);
                System.out.println(term + " found at index: " + index);
                return index;
            }
            System.out.println("test");
            count++;
            System.out.println("Step " + count + ":" + " array " + "[" + index + " .. " + collection.length + "]");
        }
        {
            System.out.println("Exit loop after Step " + count);
            System.out.println(term + " not found.");
            return -1;
        }
    }

    /**
     * Reads in - a search term (String) - a sequence of Strings from a file
     * (.txt file) both specified as a command-line argument; searches for the
     * term in the collection prints the result of the search and the execution
     * time in seconds
     *
     * example on how to run (in your IDE): SequentialSearchString.java "Alice"
     * movies.txt
     *
     *
     * @param args the command-line arguments
     * @param arg[1] the search term
     * @param args[2] the collection
     */
    public static void main(String[] args) {

        // READ INPUT ARGUMENTS FROM A FILE
        //Read the search term
        String term = new String((args[0]));
        String term2 = new String((args[1]));
        // Read the input data stream (the collection)
        In in;
        String[] collection;
        try {
            in = new In(args[2]);
            collection = in.readAllLines();
            // Print the goal
            System.out.print("SEQUENTIAL SEARCH STRING\n");
            System.out.print("Testing main method:\n");
            System.out.println("== " + collection.length + " items ==");
            System.out.print("Searching for " + term);
            System.out.println(" in collection of size " + collection.length);
            // - IMPLEMENT TIMER
            long startTime = System.currentTimeMillis();
            //CALL THE SEARCHING METHOD
            indexOf(collection, term);
            long endTime = System.currentTimeMillis();
            //Prints the execution time
            System.out.println("That took " + (endTime - startTime) + " milliseconds");
//            System.out.print("Searching for " + term2);
//            System.out.println(" in collection of size " + collection.length);
//            // - IMPLEMENT TIMER2
//            long startTimeTerm2 = System.currentTimeMillis();
//            //CALL THE SEARCHING METHOD
//            indexOf(collection, term2);
//            long endTimeTerm2 = System.currentTimeMillis();
//            //Prints the execution time
//            System.out.println("That took " + (endTimeTerm2 - startTimeTerm2) + " milliseconds");
//            // ========== YOUR TASK =========================================================
            // QUESTION 3 
            // - CALL THE SEARCHING METHOD 
            // - IMPLEMENT TIMER and print the execution time
            //   Hint: you may use the provided Stopwatch utility class, or implement your own.
            // - print the search result
            // ===============================================================================
        } catch (java.lang.IllegalArgumentException e) {
            // Error with input data file
            System.out.println(e + ": Incorrect data file as argument: " + args[1]);
        }

    }

}
