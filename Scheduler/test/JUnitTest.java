/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import scheduler.*;
/**
 *
 * @author Ggift
 */
public class JUnitTest {
    static PostOfficeProblem problem = new PostOfficeProblem();
    static Scheduler s = new Scheduler();
    public JUnitTest() {
    }
    
    @BeforeClass //method that will work before class test start to work
    public static void setUpClass() {
        s.setProblem(problem); //set the problem that we want to schedue
        problem.init(); 
        
        problem.getResource(0).schedule(); //choose problem No.0 (first of arraylist is 0)
        problem.getResource(1).schedule(); //chooose problem No.1 (second of arraylist is 1)
        
        s.schedule(0.1); // set gain = 0.1 to make it have more freequency
        
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void test() {
         //assertEquals(timeNum, problem.getActivity(taskID, activityID).getActivivation(),+-time)
         //TaskID= 0
         assertEquals(8.0, problem.getActivity(0,0).getActivation(),0.7);
         assertEquals(13.0, problem.getActivity(0,1).getActivation(),0.7);
         assertEquals(18.0, problem.getActivity(0,2).getActivation(),0.7);
         assertEquals(23.0, problem.getActivity(0,3).getActivation(),0.7);
         assertEquals(28.0, problem.getActivity(0,4).getActivation(),0.7);
         assertEquals(33.0, problem.getActivity(0,5).getActivation(),0.7);
         assertEquals(38.0, problem.getActivity(0,6).getActivation(),0.7);
         //TaskID = 1
         assertEquals(5.0, problem.getActivity(1,0).getActivation(),0.7);
         assertEquals(14.0, problem.getActivity(1,1).getActivation(),0.7);
         assertEquals(28.0, problem.getActivity(1,2).getActivation(),0.7);
         assertEquals(43.0, problem.getActivity(1,3).getActivation(),0.7);
         assertEquals(38.0, problem.getActivity(1,4).getActivation(),0.7);
         assertEquals(33.0, problem.getActivity(1,5).getActivation(),0.7);
         assertEquals(23.0, problem.getActivity(1,6).getActivation(),0.7);
         
         
     }
     
}
