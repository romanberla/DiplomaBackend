/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 04 01:33:04 GMT 2018
 */

package system.controller.simple_frontend_models;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import system.controller.simple_frontend_models.GameWithActualQuiz;
import system.model.games.Game;
import system.model.quizzes.Quiz;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GameWithActualQuiz_ESTest extends GameWithActualQuiz_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = GameWithActualQuiz.__CLR4_1_21q01q0jp8v569b.lambdaInc(0, "&tbOY/", 0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GameWithActualQuiz.__CLR4_1_21q01q0jp8v569b gameWithActualQuiz___CLR4_1_21q01q0jp8v569b0 = new GameWithActualQuiz.__CLR4_1_21q01q0jp8v569b();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Game game0 = mock(Game.class, new ViolatedAssumptionAnswer());
      system.controller.simple_frontend_models.GameWithActualQuiz gameWithActualQuiz0 = new system.controller.simple_frontend_models.GameWithActualQuiz(game0, (Quiz) null);
      Quiz quiz0 = gameWithActualQuiz0.getActualQuiz();
      assertNull(quiz0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Quiz quiz0 = mock(Quiz.class, new ViolatedAssumptionAnswer());
      system.controller.simple_frontend_models.GameWithActualQuiz gameWithActualQuiz0 = null;
      try {
        gameWithActualQuiz0 = new system.controller.simple_frontend_models.GameWithActualQuiz((Game) null, quiz0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("system.model.games.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Game game0 = mock(Game.class, new ViolatedAssumptionAnswer());
      Quiz quiz0 = mock(Quiz.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(quiz0).toString();
      system.controller.simple_frontend_models.GameWithActualQuiz gameWithActualQuiz0 = new system.controller.simple_frontend_models.GameWithActualQuiz(game0, quiz0);
      Quiz quiz1 = gameWithActualQuiz0.getActualQuiz();
      assertSame(quiz1, quiz0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Game game0 = mock(Game.class, new ViolatedAssumptionAnswer());
      Quiz quiz0 = mock(Quiz.class, new ViolatedAssumptionAnswer());
      system.controller.simple_frontend_models.GameWithActualQuiz gameWithActualQuiz0 = new system.controller.simple_frontend_models.GameWithActualQuiz(game0, quiz0);
      Quiz quiz1 = mock(Quiz.class, new ViolatedAssumptionAnswer());
      gameWithActualQuiz0.setActualQuiz(quiz1);
  }
}
