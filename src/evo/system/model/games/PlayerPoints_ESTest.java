/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 04 01:35:53 GMT 2018
 */

package system.model.games;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import system.model.games.PlayerPoints;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PlayerPoints_ESTest extends PlayerPoints_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = PlayerPoints.__CLR4_1_21nb1nbjp8v565v.lambdaInc(3071, "4k8.}^<>!rE.tM{5", 3071);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PlayerPoints.__CLR4_1_21nb1nbjp8v565v playerPoints___CLR4_1_21nb1nbjp8v565v0 = new PlayerPoints.__CLR4_1_21nb1nbjp8v565v();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      system.model.games.PlayerPoints playerPoints0 = new system.model.games.PlayerPoints((LinkedList<Double>) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      system.model.games.PlayerPoints playerPoints0 = new system.model.games.PlayerPoints();
      playerPoints0.setPoints((LinkedList<Double>) null);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      system.model.games.PlayerPoints playerPoints0 = new system.model.games.PlayerPoints();
      LinkedList<Double> linkedList0 = playerPoints0.getPoints();
      assertNull(linkedList0);
  }
}
