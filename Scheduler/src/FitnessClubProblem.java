/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ggift
 */
//import scheduler.*;
//public abstract class FitnessClubProblem extends Problem {
//}

import scheduler.*;
public class FitnessClubProblem extends Problem {

  public FitnessClubProblem() {  }

  public void init() {
    super.clear();
    Task task1 = new Task();
    task1.addActivity(new Activity("A00", 8.0, 10.0, 15.0, 25.0));
    task1.addActivity(new Activity("A01", 8.0, 10.0, 15.0, 25.0));
    task1.addActivity(new Activity("A02", 8.0, 10.0, 15.0, 25.0));
    task1.addActivity(new Activity("A03", 25.0, 30.0, 35.0, 40.0));
    task1.addActivity(new Activity("A04", 30.0, 35.0, 40.0, 45.0));
    task1.addActivity(new Activity("A05", 35.0, 40.0, 45.0, 50.0));
    task1.addActivity(new Activity("A06", 40.0, 45.0, 50.0, 55.0));
    
    this.addTask(task1);

    Resource carrier1 = new Resource("C1");
    carrier1.addTask(task1);
    this.addResource(carrier1);

    Task task2 = new Task();
    task2.addActivity(new Activity("A10", 10.0, 10.0, 15.0, 20.0));
    task2.addActivity(new Activity("A11", 10.0, 15.0, 20.0, 25.0));
    task2.addActivity(new Activity("A12", 15.0, 20.0, 25.0, 30.0));
    task2.addActivity(new Activity("A13", 20.0, 25.0, 30.0, 35.0));
    task2.addActivity(new Activity("A14", 28.0, 30.0, 35.0, 60.0));
    task2.addActivity(new Activity("A15", 28.0, 30.0, 35.0, 60.0));
    task2.addActivity(new Activity("A16", 28.0, 30.0, 35.0, 60.0));
    this.addTask(task2);

    Resource carrier2 = new Resource("C2");
    carrier2.addTask(task2);
    this.addResource(carrier2);
  }
}