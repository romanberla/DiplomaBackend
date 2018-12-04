/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Dec 04 00:26:11 GMT 2018
 */

package system.controller;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class QuizPartController_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "system.controller.QuizPartController"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(QuizPartController_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.gson.JsonObject",
      "system.controller.simple_frontend_models.QuestionGroupWithNumberOfQuestions",
      "system.controller.service.database.IntStringBlobDatabaseEntry",
      "system.model.quizzes.Quiz",
      "system.model.questions.QuestionType",
      "system.controller.dao.Dao",
      "system.controller.service.database.DatabaseService",
      "org.springframework.web.bind.annotation.RequestMapping",
      "org.springframework.beans.factory.annotation.Autowired",
      "system.model.questions.QuestionGroup",
      "system.controller.service.database.StringDatabaseEntry",
      "org.springframework.stereotype.Controller",
      "system.model.questions.QuestionGroupType",
      "com.google.gson.JsonElement",
      "system.controller.dao.QuestionDao",
      "org.springframework.stereotype.Service",
      "system.controller.dao.QuestionGroupDao",
      "com.mysql.jdbc.OutputStreamWatcher",
      "system.model.quizzes.QuizPart",
      "org.springframework.stereotype.Indexed",
      "system.controller.tools.DataToolkit",
      "com.google.gson.JsonPrimitive",
      "system.controller.service.database.DatabaseEntry",
      "org.springframework.stereotype.Repository",
      "system.controller.service.QuestionService",
      "system.controller.simple_frontend_models.QuizPartWithCategoryNames",
      "system.controller.service.QuizPartService",
      "system.controller.dao.Idable",
      "org.springframework.web.bind.annotation.RequestMethod",
      "system.controller.simple_frontend_models.QuestionWithCategoryNames",
      "system.controller.simple_frontend_models.GameWithActualQuiz",
      "system.controller.simple_frontend_models.Response",
      "org.springframework.stereotype.Component",
      "com.google.gson.JsonArray",
      "system.controller.service.database.FilterBehaviour",
      "com.mysql.jdbc.WatchableOutputStream",
      "system.controller.QuizPartController",
      "org.springframework.web.method.HandlerTypePredicate$Builder",
      "system.controller.dao.QuizPartDao",
      "com.google.gson.JsonNull",
      "system.model.games.Game",
      "org.springframework.web.method.HandlerTypePredicate",
      "system.controller.service.database.MySQLDatabaseService",
      "system.controller.service.QuestionGroupService",
      "org.springframework.web.bind.annotation.Mapping",
      "system.model.questions.Question",
      "com.mysql.jdbc.Blob",
      "com.google.gson.internal.LazilyParsedNumber"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("system.controller.service.database.IntStringBlobDatabaseEntry", false, QuizPartController_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("system.controller.service.database.MySQLDatabaseService", false, QuizPartController_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(QuizPartController_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "system.controller.QuizPartController",
      "org.springframework.web.bind.annotation.RequestMethod",
      "system.controller.service.QuizPartService",
      "system.controller.dao.Dao",
      "system.controller.dao.QuizPartDao",
      "system.controller.service.database.MySQLDatabaseService",
      "system.controller.service.QuestionGroupService",
      "system.controller.dao.QuestionGroupDao",
      "system.controller.service.QuestionService",
      "system.controller.dao.QuestionDao",
      "system.model.quizzes.QuizPart",
      "system.controller.simple_frontend_models.QuizPartWithCategoryNames",
      "system.controller.service.database.IntStringBlobDatabaseEntry",
      "system.controller.simple_frontend_models.Response",
      "system.model.questions.QuestionGroup",
      "system.model.questions.QuestionGroupType",
      "system.model.questions.Question",
      "system.controller.tools.DataToolkit",
      "system.controller.simple_frontend_models.QuestionGroupWithNumberOfQuestions",
      "system.controller.simple_frontend_models.QuestionWithCategoryNames",
      "system.model.games.Game",
      "system.model.quizzes.Quiz",
      "system.controller.simple_frontend_models.GameWithActualQuiz"
    );
  }
}
