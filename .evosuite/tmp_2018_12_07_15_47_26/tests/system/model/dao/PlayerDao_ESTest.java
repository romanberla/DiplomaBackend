/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 07 15:18:31 GMT 2018
 */

package system.model.dao;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import system.model.classes.games.Player;
import system.model.dao.PlayerDao;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PlayerDao_ESTest extends PlayerDao_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PlayerDao playerDao0 = new PlayerDao();
      playerDao0.setPlayers((LinkedList<Player>) null);
      LinkedList<Player> linkedList0 = playerDao0.getPlayers();
      assertNull(linkedList0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PlayerDao playerDao0 = new PlayerDao();
      playerDao0.addPlayer((Player) null);
      LinkedList<Player> linkedList0 = playerDao0.getPlayers();
      assertEquals(1, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PlayerDao playerDao0 = new PlayerDao();
      playerDao0.addPlayer((Player) null);
      // Undeclared exception!
      try { 
        playerDao0.removePlayer("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("system.model.dao.PlayerDao", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PlayerDao playerDao0 = new PlayerDao();
      playerDao0.setPlayers((LinkedList<Player>) null);
      // Undeclared exception!
      try { 
        playerDao0.addPlayer((Player) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("system.model.dao.PlayerDao", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PlayerDao playerDao0 = new PlayerDao();
      playerDao0.removePlayer(",G\"0v]pM=#");
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PlayerDao playerDao0 = new PlayerDao();
      LinkedList<Player> linkedList0 = playerDao0.getPlayers();
      playerDao0.setPlayers(linkedList0);
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PlayerDao playerDao0 = new PlayerDao();
      playerDao0.addPlayer((Player) null);
      // Undeclared exception!
      try { 
        playerDao0.getPlayer("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("system.model.dao.PlayerDao", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PlayerDao playerDao0 = new PlayerDao();
      Player player0 = playerDao0.getPlayer("%qH`t");
      assertNull(player0);
  }
}