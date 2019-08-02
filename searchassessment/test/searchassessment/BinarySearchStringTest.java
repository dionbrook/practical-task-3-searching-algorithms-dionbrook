package searchassessment;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * YOUR TASK: adjust these tests for your own purposes.
 * 
 * @author Computer Power Plus
 */
public class BinarySearchStringTest {
    
    public BinarySearchStringTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   

     /**
     * Test of contains method, of class BinarySearchString.
     */
    @Test
     public void testContains() {
        System.out.println("Testing method: contains()");
        String[] collection;
 
        // Test case: very small array of single words
        collection = new String[] {"Hello", "World"};
        assertEquals(true, BinarySearchString.contains("Hello", collection));
        assertEquals(false, BinarySearchString.contains("Goodbye", collection));
        // Test case: case sensitive or not?
        // YOUR TASK: DECIDE IF THE BINARY SEARCH NEEDS TO BE CASE SENSITIVE OR NOT
        // AND SET THE FOLLOWING TESTS TO EITHER FALSE OR TRUE
        //assertEquals(false, BinarySearchString.contains("hello", collection));
        //assertEquals(true, BinarySearchString.contains("wORLD", collection));
        
        // Test case: array of 1 string
        collection = new String[] {"Hello"};
        assertEquals(true, BinarySearchString.contains("Hello", collection));
        assertEquals(false, BinarySearchString.contains("Goodbye", collection));

        // Test case: small array of phrases - exact match of entire phrase
        collection = new String[] {"A Wrinkle in Time", "Avengers: Infinity War", "Star Wars", "Thor: Rognarok"};
        assertEquals(true, BinarySearchString.contains("Star Wars", collection));
        assertEquals(true, BinarySearchString.contains("Thor: Rognarok", collection));
        assertEquals(false, BinarySearchString.contains("Thor", collection));
        assertEquals(false, BinarySearchString.contains("War", collection));
       
    }

     /**
     * Test of indexOf method, of class BinarySearchString.
     */
    @Test
    public void testIndexOf() {
        System.out.println("Testing method: indexOf()");
        String[] collection;
     
        // Test case: very small array of single words
        collection = new String[] {"Hello", "World"};
        assertEquals(0, BinarySearchString.indexOf("Hello", collection));
        assertEquals(1, BinarySearchString.indexOf("World", collection));
        assertEquals(-1, BinarySearchString.indexOf("Goodbye", collection));
        
    
        // Test case: small array of SORTED titles - exact match of entire title
        collection = new String[] {"A Wrinkle in Time", "Avengers: Infinity War", "Star Wars", "Thor: Rognarok"};
        assertEquals(0, BinarySearchString.indexOf("A Wrinkle in Time", collection));
        assertEquals(1, BinarySearchString.indexOf("Avengers: Infinity War", collection));
        assertEquals(2, BinarySearchString.indexOf("Star Wars", collection));
        assertEquals(3, BinarySearchString.indexOf("Thor: Rognarok", collection));      
        assertEquals(-1, BinarySearchString.indexOf("Gone with the Wind", collection));      

        // Test case: UNSORTED titles - only the sorted items at the start will be found
        collection = new String[] {"Avengers: Infinity War", "Thor: Rognarok", "Star Wars", "A Wrinkle in Time"};
        assertEquals(-1, BinarySearchString.indexOf("A Wrinkle in Time", collection));
        assertEquals(0, BinarySearchString.indexOf("Avengers: Infinity War", collection));
        assertEquals(-1, BinarySearchString.indexOf("Star Wars", collection));
        assertEquals(1, BinarySearchString.indexOf("Thor: Rognarok", collection));      
        assertEquals(-1, BinarySearchString.indexOf("Gone with the Wind", collection));      
       
        
    }
    
     /**
     * Test of main method, of class BinarySearchString.
     */
    @Test
    public void testMain() {
       System.out.println("NOT YET Testing main method: ");
        String[] args = null;
        
        // YOUR TASK: 
        // - change the tests below to suit your situation, 
        // - create further tests for larger collections
        // - implement measurements in main class and write results to system.out
        // - when you run the file, copy-paste the test output listing 
        //   as evidence of your measurements
 
        // Test 100
//        System.out.println("== 100 items == ");
//        args = new String[] {"Viens voir papa!", "movieTitles100.txt"};
//        BinarySearchString.main(args);
//        args = new String[] {"The Professor and His Field Glass", "movieTitles100.txt"};
//        BinarySearchString.main(args);

 
//        // Test 1000
//        System.out.println("== 1000 items == ");
//        args = new String[] {"The Professor and His Field Glass", "movieTitles1K.txt"};
//        BinarySearchString.main(args);
    }


}