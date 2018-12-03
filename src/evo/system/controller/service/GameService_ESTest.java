/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 03 15:47:05 GMT 2018
 */

package system.controller.service;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import system.controller.service.GameService;
import system.controller.service.PlayerService;
import system.controller.service.QuestionGroupService;
import system.controller.service.QuestionService;
import system.controller.service.QuizService;
import system.controller.simple_frontend_models.GameWithActualQuiz;
import system.model.games.Answer;
import system.model.games.Game;
import system.model.quizzes.Quiz;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GameService_ESTest extends GameService_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GameService gameService0 = new GameService();
      PlayerService playerService0 = mock(PlayerService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "playerService", (Object) playerService0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionGroupService", (Object) questionGroupService0);
      QuestionService questionService0 = mock(QuestionService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionService", (Object) questionService0);
      QuizService quizService0 = mock(QuizService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "quizService", (Object) quizService0);
      Injector.validateBean(gameService0, (Class<?>) GameService.class);
      // Undeclared exception!
      try { 
        gameService0.answerQuestion("*hRJ^t", "", "", (Answer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("system.controller.service.GameService", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GameService gameService0 = new GameService();
      PlayerService playerService0 = mock(PlayerService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "playerService", (Object) playerService0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionGroupService", (Object) questionGroupService0);
      QuestionService questionService0 = mock(QuestionService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionService", (Object) questionService0);
      QuizService quizService0 = mock(QuizService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "quizService", (Object) quizService0);
      Injector.validateBean(gameService0, (Class<?>) GameService.class);
      // Undeclared exception!
      try { 
        gameService0.getRealQuestionsForPlayer("O2RYH$3];f%XW\"{ZR", " ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("system.controller.service.GameService", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GameService gameService0 = new GameService();
      PlayerService playerService0 = mock(PlayerService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "playerService", (Object) playerService0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionGroupService", (Object) questionGroupService0);
      QuestionService questionService0 = mock(QuestionService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionService", (Object) questionService0);
      QuizService quizService0 = mock(QuizService.class, new ViolatedAssumptionAnswer());
      doReturn((Quiz) null).when(quizService0).get(anyString());
      Injector.inject(gameService0, (Class<?>) GameService.class, "quizService", (Object) quizService0);
      Injector.validateBean(gameService0, (Class<?>) GameService.class);
      GameWithActualQuiz gameWithActualQuiz0 = gameService0.addGameFromQuiz("o0?N2!Y0V,e:K;Qtf");
      // Undeclared exception!
      try { 
        gameService0.set("o0?N2!Y0V,e:K;Qtf", gameWithActualQuiz0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1, Size: 1
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GameService gameService0 = new GameService();
      PlayerService playerService0 = mock(PlayerService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "playerService", (Object) playerService0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionGroupService", (Object) questionGroupService0);
      QuestionService questionService0 = mock(QuestionService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionService", (Object) questionService0);
      QuizService quizService0 = mock(QuizService.class, new ViolatedAssumptionAnswer());
      doReturn((Quiz) null, (Quiz) null).when(quizService0).get(anyString());
      Injector.inject(gameService0, (Class<?>) GameService.class, "quizService", (Object) quizService0);
      Injector.validateBean(gameService0, (Class<?>) GameService.class);
      gameService0.addGameFromQuiz("@bW%_l36`G5LsO]");
      gameService0.join("E", "t]KU!(9]jRs %n");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GameService gameService0 = new GameService();
      PlayerService playerService0 = mock(PlayerService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "playerService", (Object) playerService0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionGroupService", (Object) questionGroupService0);
      QuestionService questionService0 = mock(QuestionService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionService", (Object) questionService0);
      QuizService quizService0 = mock(QuizService.class, new ViolatedAssumptionAnswer());
      doReturn((Quiz) null).when(quizService0).get(anyString());
      Injector.inject(gameService0, (Class<?>) GameService.class, "quizService", (Object) quizService0);
      Injector.validateBean(gameService0, (Class<?>) GameService.class);
      gameService0.addGameFromQuiz("@bW%_l36`G5LsO]");
      gameService0.getAll();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GameService gameService0 = new GameService();
      PlayerService playerService0 = mock(PlayerService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "playerService", (Object) playerService0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionGroupService", (Object) questionGroupService0);
      QuestionService questionService0 = mock(QuestionService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionService", (Object) questionService0);
      Quiz quiz0 = mock(Quiz.class, new ViolatedAssumptionAnswer());
      QuizService quizService0 = mock(QuizService.class, new ViolatedAssumptionAnswer());
      doReturn(quiz0).when(quizService0).get(anyString());
      Injector.inject(gameService0, (Class<?>) GameService.class, "quizService", (Object) quizService0);
      Injector.validateBean(gameService0, (Class<?>) GameService.class);
      gameService0.addGameFromQuiz("8PmTSNwQ");
      // Undeclared exception!
      try { 
        gameService0.removeByCode((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GameService gameService0 = new GameService();
      PlayerService playerService0 = mock(PlayerService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "playerService", (Object) playerService0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionGroupService", (Object) questionGroupService0);
      QuestionService questionService0 = mock(QuestionService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionService", (Object) questionService0);
      QuizService quizService0 = mock(QuizService.class, new ViolatedAssumptionAnswer());
      doReturn((Quiz) null).when(quizService0).get(anyString());
      Injector.inject(gameService0, (Class<?>) GameService.class, "quizService", (Object) quizService0);
      Injector.validateBean(gameService0, (Class<?>) GameService.class);
      gameService0.addGameFromQuiz("9o629 S");
      // Undeclared exception!
      try { 
        gameService0.remove((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GameService gameService0 = new GameService();
      PlayerService playerService0 = mock(PlayerService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "playerService", (Object) playerService0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionGroupService", (Object) questionGroupService0);
      QuestionService questionService0 = mock(QuestionService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionService", (Object) questionService0);
      QuizService quizService0 = mock(QuizService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "quizService", (Object) quizService0);
      Injector.validateBean(gameService0, (Class<?>) GameService.class);
      // Undeclared exception!
      try { 
        gameService0.getQuestionsForPlayer("How correct? ", "system.controller.dao.QuizGroupDao");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("system.controller.service.GameService", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GameService gameService0 = new GameService();
      PlayerService playerService0 = mock(PlayerService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "playerService", (Object) playerService0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionGroupService", (Object) questionGroupService0);
      QuestionService questionService0 = mock(QuestionService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionService", (Object) questionService0);
      Quiz quiz0 = mock(Quiz.class, new ViolatedAssumptionAnswer());
      QuizService quizService0 = mock(QuizService.class, new ViolatedAssumptionAnswer());
      doReturn(quiz0).when(quizService0).get(anyString());
      Injector.inject(gameService0, (Class<?>) GameService.class, "quizService", (Object) quizService0);
      Injector.validateBean(gameService0, (Class<?>) GameService.class);
      gameService0.addGameFromQuiz((String) null);
      // Undeclared exception!
      try { 
        gameService0.getByCode((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GameService gameService0 = new GameService();
      PlayerService playerService0 = mock(PlayerService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "playerService", (Object) playerService0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionGroupService", (Object) questionGroupService0);
      QuestionService questionService0 = mock(QuestionService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionService", (Object) questionService0);
      QuizService quizService0 = mock(QuizService.class, new ViolatedAssumptionAnswer());
      doReturn((Quiz) null).when(quizService0).get(anyString());
      Injector.inject(gameService0, (Class<?>) GameService.class, "quizService", (Object) quizService0);
      Injector.validateBean(gameService0, (Class<?>) GameService.class);
      gameService0.addGameFromQuiz("");
      // Undeclared exception!
      try { 
        gameService0.get((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GameService gameService0 = new GameService();
      PlayerService playerService0 = mock(PlayerService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "playerService", (Object) playerService0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionGroupService", (Object) questionGroupService0);
      QuestionService questionService0 = mock(QuestionService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionService", (Object) questionService0);
      QuizService quizService0 = mock(QuizService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "quizService", (Object) quizService0);
      Injector.validateBean(gameService0, (Class<?>) GameService.class);
      gameService0.getAll();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GameService gameService0 = new GameService();
      PlayerService playerService0 = mock(PlayerService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "playerService", (Object) playerService0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionGroupService", (Object) questionGroupService0);
      QuestionService questionService0 = mock(QuestionService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionService", (Object) questionService0);
      QuizService quizService0 = mock(QuizService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "quizService", (Object) quizService0);
      Injector.validateBean(gameService0, (Class<?>) GameService.class);
      gameService0.getByCode("ok");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GameService gameService0 = new GameService();
      PlayerService playerService0 = mock(PlayerService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "playerService", (Object) playerService0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionGroupService", (Object) questionGroupService0);
      QuestionService questionService0 = mock(QuestionService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionService", (Object) questionService0);
      QuizService quizService0 = mock(QuizService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "quizService", (Object) quizService0);
      Injector.validateBean(gameService0, (Class<?>) GameService.class);
      gameService0.remove("ok");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GameService gameService0 = new GameService();
      PlayerService playerService0 = mock(PlayerService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "playerService", (Object) playerService0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionGroupService", (Object) questionGroupService0);
      QuestionService questionService0 = mock(QuestionService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionService", (Object) questionService0);
      QuizService quizService0 = mock(QuizService.class, new ViolatedAssumptionAnswer());
      doReturn((Quiz) null).when(quizService0).get(anyString());
      Injector.inject(gameService0, (Class<?>) GameService.class, "quizService", (Object) quizService0);
      Injector.validateBean(gameService0, (Class<?>) GameService.class);
      gameService0.addGameFromQuiz("ok");
      // Undeclared exception!
      try { 
        gameService0.getWithQuiz((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GameService gameService0 = new GameService();
      PlayerService playerService0 = mock(PlayerService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "playerService", (Object) playerService0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionGroupService", (Object) questionGroupService0);
      QuestionService questionService0 = mock(QuestionService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionService", (Object) questionService0);
      QuizService quizService0 = mock(QuizService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "quizService", (Object) quizService0);
      Injector.validateBean(gameService0, (Class<?>) GameService.class);
      LinkedList<Game> linkedList0 = gameService0.getFinishedGames();
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GameService gameService0 = new GameService();
      PlayerService playerService0 = mock(PlayerService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "playerService", (Object) playerService0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionGroupService", (Object) questionGroupService0);
      QuestionService questionService0 = mock(QuestionService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionService", (Object) questionService0);
      QuizService quizService0 = mock(QuizService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "quizService", (Object) quizService0);
      Injector.validateBean(gameService0, (Class<?>) GameService.class);
      String string0 = gameService0.removeByCode((String) null);
      assertEquals("ok", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GameService gameService0 = new GameService();
      PlayerService playerService0 = mock(PlayerService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "playerService", (Object) playerService0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionGroupService", (Object) questionGroupService0);
      QuestionService questionService0 = mock(QuestionService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionService", (Object) questionService0);
      QuizService quizService0 = mock(QuizService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "quizService", (Object) quizService0);
      Injector.validateBean(gameService0, (Class<?>) GameService.class);
      // Undeclared exception!
      try { 
        gameService0.join("ABCDEFHIKLMNPQSTXYZ", "0[HL_4V:d8n");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("system.controller.service.GameService", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GameService gameService0 = new GameService();
      PlayerService playerService0 = mock(PlayerService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "playerService", (Object) playerService0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionGroupService", (Object) questionGroupService0);
      QuestionService questionService0 = mock(QuestionService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionService", (Object) questionService0);
      QuizService quizService0 = mock(QuizService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "quizService", (Object) quizService0);
      Injector.validateBean(gameService0, (Class<?>) GameService.class);
      Game game0 = gameService0.get("");
      assertNull(game0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GameService gameService0 = new GameService();
      PlayerService playerService0 = mock(PlayerService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "playerService", (Object) playerService0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionGroupService", (Object) questionGroupService0);
      QuestionService questionService0 = mock(QuestionService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionService", (Object) questionService0);
      QuizService quizService0 = mock(QuizService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "quizService", (Object) quizService0);
      Injector.validateBean(gameService0, (Class<?>) GameService.class);
      gameService0.startGame("VY7OG_3-OM");
      assertEquals(1, GameService.CODE_LENGTH);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GameService gameService0 = new GameService();
      PlayerService playerService0 = mock(PlayerService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "playerService", (Object) playerService0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionGroupService", (Object) questionGroupService0);
      QuestionService questionService0 = mock(QuestionService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionService", (Object) questionService0);
      QuizService quizService0 = mock(QuizService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "quizService", (Object) quizService0);
      Injector.validateBean(gameService0, (Class<?>) GameService.class);
      gameService0.removeFinishedGames();
      assertEquals(1, GameService.CODE_LENGTH);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GameService gameService0 = new GameService();
      PlayerService playerService0 = mock(PlayerService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "playerService", (Object) playerService0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionGroupService", (Object) questionGroupService0);
      QuestionService questionService0 = mock(QuestionService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "questionService", (Object) questionService0);
      QuizService quizService0 = mock(QuizService.class, new ViolatedAssumptionAnswer());
      Injector.inject(gameService0, (Class<?>) GameService.class, "quizService", (Object) quizService0);
      Injector.validateBean(gameService0, (Class<?>) GameService.class);
      GameWithActualQuiz gameWithActualQuiz0 = gameService0.getWithQuiz("How correct? ");
      assertNull(gameWithActualQuiz0);
  }
}