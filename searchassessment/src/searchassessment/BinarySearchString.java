package searchassessment;

import java.util.Arrays;
import utils.In;
import utils.Stopwatch;

/**
 * The class BinarySearchString implements a binary search algorithm to search
 * for a term in collection of strings. The collection MUST BE A SORTED
 * COLLECTION. This class will not sort it.
 *
 * Searching in collections is done to answer the following questions: - Does
 * the element exists in a collection? -> method contains() - How to get the
 * element from a collection? - > method indexOf()
 *
 * --------------------------------------------------------------------------
 * YOUR TASKS
 *
 * QUESTION 2: a. implement indexOf method b. test it using JUnit test class
 * provided BinarySearchStringTest.java (Done)
 *
 * QUESTION 3: a. Implement main method to read data from a file, calling
 * indexOf or contains method and print the search result and execution time b.
 * Perform several measurements using data sets provided: run the program (this
 * class) several times, i.e. with each of the data sets provided, and record
 * the results c. implement a step counter and perform measurements again.
 * Record your results. (Done)
 *
 * --------------------------------------------------------------------------
 *
 * @author Computer Power Plus
 * @author 92020283, Dion Brook
 */
public class BinarySearchString {
    // Counter for index
    static int count = 0;

    /**
     * Checks if collection contains an item.
     *
     * @param term the search term, in this case a String
     * @param collection the collection to be searched, in this case a SORTED
     * array of Strings
     * @return true if collection contains the term, false otherwise
     *
     */
    public static boolean contains(String term, String[] collection) {
        // Reuses the algorithm implementation in indexOf()
        return (indexOf(term, collection) != -1);
    }

    /**
     * Searches for a term in a sorted collection, and returns the index of the
     * item , if it is found. The input collection MUST BE PRE-SORTED
     *
     * @param term the search term, in this case a String
     * @param collection the SORTED collection to be searched, in this case an
     * array of Strings
     * @return int index of item in the array if found, otherwise -1
     *
     */
    // QUESTION 2
    // IMPLEMENT THE BINARY SEARCH    
    public static int indexOf(String term, String[] collection) {
        int l = 0, r = collection.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            int res = term.compareTo(collection[m]);

            // Check if x is present at mid 
            if (res == 0) {
                System.out.println("Exit loop after Step " + count);
                // Print the search result
                System.out.println(term + " found at index: " + m);

                return m;
            }

            // If x greater, ignore left half 
            if (res > 0) {
                l = m + 1;
            } // If x is smaller, ignore right half 
            else {
                r = m - 1;
            }
            count++;
            System.out.println("Step " + count + ":" + " array " + "[" + m + " .. " + r + "]");

        }
        {
            System.out.println("Exit loop after Step " + count);
            // Print the search result
            System.out.println(term + " not found.");
            return -1;
        }
    }

    /**
     * Reads in - a search term (String) - a sequence of Strings from a file
     * (.txt file), one string per line both specified as a command-line
     * argument; searches for the term in the collection of integers prints the
     * result of the search and the time in seconds
     *
     * @param args the command-line arguments
     * @param arg[0] is the search term
     * @param arg[1] is the name of an input file, containing one item per line.
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
            System.out.print("BINARY SEARCH STRING\n");
            System.out.print("Testing main method:\n");
            System.out.println("== " + collection.length + " items ==");
            System.out.print("Searching for " + term);
            System.out.println(" in collection of size " + collection.length);
            // - IMPLEMENT TIMER
            long startTime = System.currentTimeMillis();
            //CALL THE SEARCHING METHOD
            indexOf(term, collection);
            long endTime = System.currentTimeMillis();
            //Prints the execution time
            System.out.println("That took " + (endTime - startTime) + " milliseconds");
//            System.out.print("Searching for " + term2);
//            System.out.println(" in collection of size " + collection.length);
//            // - IMPLEMENT TIMER2
//            long startTimeTerm2 = System.currentTimeMillis();
//            //CALL THE SEARCHING METHOD
//            indexOf(term2, collection);
//            long endTimeTerm2 = System.currentTimeMillis();
//            //Prints the execution time
//            System.out.println("That took " + (endTimeTerm2 - startTimeTerm2) + " milliseconds");
//            System.out.println(count);

        } catch (java.lang.IllegalArgumentException e) {
            // Error with input data file
            System.out.println(e + ": Incorrect data file as argument: " + args[1]);
        }

    }

}
