/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Dec 03 15:47:05 GMT 2018
 */

package system.controller.service;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class GameService_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "system.controller.service.GameService"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "Cp1251"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "C:\\Users\\admin\\AppData\\Local\\Temp\\"); 
    java.lang.System.setProperty("user.country", "RU"); 
    java.lang.System.setProperty("user.dir", "D:\\Data\\Diploma\\Project\\Backend"); 
    java.lang.System.setProperty("user.home", "C:\\Users\\admin"); 
    java.lang.System.setProperty("user.language", "ru"); 
    java.lang.System.setProperty("user.name", "admin"); 
    java.lang.System.setProperty("user.timezone", "Europe/Belgrade"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(GameService_ESTest_scaffolding.class.getClassLoader() ,
      "system.controller.simple_frontend_models.QuestionGroupWithNumberOfQuestions",
      "system.model.quizzes.Quiz",
      "org.springframework.beans.factory.annotation.Autowired",
      "system.model.questions.QuestionGroup",
      "system.controller.service.PlayerService",
      "org.springframework.stereotype.Service",
      "system.controller.service.GameService",
      "system.model.games.PlayerAnswers",
      "system.model.games.Answer",
      "org.springframework.stereotype.Indexed",
      "system.controller.tools.DataToolkit",
      "system.model.quizzes.QuizPart",
      "system.controller.simple_frontend_models.QuizWithCategoryNames",
      "system.controller.service.QuestionService",
      "system.model.games.ListOfQuestions",
      "system.model.quizzes.QuizGroup",
      "system.controller.dao.Idable",
      "system.controller.simple_frontend_models.GameWithActualQuiz",
      "system.controller.simple_frontend_models.QuestionWithCategoryNames",
      "org.springframework.stereotype.Component",
      "system.controller.service.QuizService",
      "system.model.games.Player",
      "system.model.games.Game",
      "system.controller.service.QuestionGroupService",
      "system.model.questions.Question"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("system.controller.service.PlayerService", false, GameService_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("system.controller.service.QuestionGroupService", false, GameService_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("system.controller.service.QuestionService", false, GameService_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("system.controller.service.QuizService", false, GameService_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("system.model.quizzes.Quiz", false, GameService_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(GameService_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "system.controller.service.GameService",
      "system.model.questions.QuestionType",
      "system.controller.service.PlayerService",
      "system.controller.service.QuestionGroupService",
      "system.controller.service.QuestionService",
      "system.controller.service.QuizService",
      "system.model.games.Player",
      "system.controller.tools.DataToolkit",
      "system.model.games.Game",
      "system.controller.simple_frontend_models.GameWithActualQuiz",
      "system.model.quizzes.Quiz",
      "system.model.games.ListOfQuestions",
      "system.model.games.PlayerAnswers"
    );
  }
}
