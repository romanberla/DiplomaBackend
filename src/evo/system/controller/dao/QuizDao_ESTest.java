/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 03 15:25:40 GMT 2018
 */

package system.controller.dao;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import system.controller.dao.Dao;
import system.controller.dao.QuizDao;
import system.controller.service.database.MySQLDatabaseService;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class QuizDao_ESTest extends QuizDao_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QuizDao quizDao0 = new QuizDao();
      MySQLDatabaseService mySQLDatabaseService0 = mock(MySQLDatabaseService.class, new ViolatedAssumptionAnswer());
      Injector.inject(quizDao0, (Class<?>) Dao.class, "databaseService", (Object) mySQLDatabaseService0);
      Injector.validateBean(quizDao0, (Class<?>) QuizDao.class);
      assertFalse(Dao.SQLITE_NOT_MYSQL);
  }
}
