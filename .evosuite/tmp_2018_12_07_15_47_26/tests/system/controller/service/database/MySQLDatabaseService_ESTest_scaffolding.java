/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Dec 07 15:34:30 GMT 2018
 */

package system.controller.service.database;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class MySQLDatabaseService_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "system.controller.service.database.MySQLDatabaseService"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(MySQLDatabaseService_ESTest_scaffolding.class.getClassLoader() ,
      "com.mysql.jdbc.jdbc2.optional.MysqlDataSource",
      "com.mysql.jdbc.SocketMetadata",
      "com.mysql.jdbc.log.StandardLogger",
      "com.mysql.jdbc.CacheAdapterFactory",
      "com.mysql.jdbc.MultiHostConnectionProxy",
      "com.mysql.jdbc.ConnectionPropertiesImpl$ConnectionProperty",
      "system.controller.service.database.DatabaseService",
      "system.controller.service.database.StringDatabaseEntry",
      "com.mysql.jdbc.Util",
      "com.mysql.jdbc.log.Log",
      "com.mysql.jdbc.ConnectionPropertiesImpl$LongConnectionProperty",
      "com.mysql.jdbc.PerVmServerConfigCacheFactory",
      "com.mysql.jdbc.ConnectionPropertiesImpl$MemorySizeConnectionProperty",
      "com.mysql.jdbc.StringUtils",
      "org.springframework.stereotype.Service",
      "com.mysql.jdbc.AbandonedConnectionCleanupThread",
      "system.controller.service.database.DatabaseEntry",
      "com.mysql.jdbc.StandardSocketFactory",
      "com.mysql.jdbc.ConnectionPropertiesImpl$StringConnectionProperty",
      "com.mysql.jdbc.ConnectionPropertiesImpl$BooleanConnectionProperty",
      "com.mysql.jdbc.ConnectionProperties",
      "com.mysql.jdbc.Messages",
      "com.mysql.jdbc.SocksProxySocketFactory",
      "com.mysql.jdbc.StringUtils$SearchMode",
      "com.mysql.jdbc.ConnectionPropertiesImpl$IntegerConnectionProperty",
      "org.springframework.stereotype.Component",
      "com.mysql.jdbc.ConnectionPropertiesImpl",
      "system.controller.service.database.FilterBehaviour",
      "com.mysql.jdbc.NonRegisteringDriver",
      "com.mysql.jdbc.PerConnectionLRUFactory",
      "com.mysql.jdbc.SocketFactory",
      "system.controller.service.database.MySQLDatabaseService"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(MySQLDatabaseService_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "system.controller.service.database.MySQLDatabaseService",
      "system.controller.service.database.FilterBehaviour",
      "com.mysql.jdbc.Messages",
      "com.mysql.jdbc.ConnectionPropertiesImpl",
      "com.mysql.jdbc.AbandonedConnectionCleanupThread",
      "com.mysql.jdbc.NonRegisteringDriver",
      "com.mysql.jdbc.jdbc2.optional.MysqlDataSource",
      "com.mysql.jdbc.ConnectionPropertiesImpl$ConnectionProperty",
      "com.mysql.jdbc.ConnectionPropertiesImpl$BooleanConnectionProperty",
      "com.mysql.jdbc.ConnectionPropertiesImpl$IntegerConnectionProperty",
      "com.mysql.jdbc.ConnectionPropertiesImpl$MemorySizeConnectionProperty",
      "com.mysql.jdbc.ConnectionPropertiesImpl$StringConnectionProperty",
      "com.mysql.jdbc.ConnectionPropertiesImpl$LongConnectionProperty",
      "com.mysql.jdbc.StandardSocketFactory",
      "com.mysql.jdbc.SocksProxySocketFactory",
      "com.mysql.jdbc.StringUtils$SearchMode",
      "com.mysql.jdbc.StringUtils",
      "com.mysql.jdbc.Util"
    );
  }
}