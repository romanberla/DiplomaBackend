/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 07 14:48:56 GMT 2018
 */

package system.model.dao;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import system.controller.service.database.MySQLDatabaseService;
import system.model.dao.Dao;
import system.model.dao.QuizGroupDao;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class QuizGroupDao_ESTest extends QuizGroupDao_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QuizGroupDao quizGroupDao0 = new QuizGroupDao();
      MySQLDatabaseService mySQLDatabaseService0 = mock(MySQLDatabaseService.class, new ViolatedAssumptionAnswer());
      Injector.inject(quizGroupDao0, (Class<?>) Dao.class, "databaseService", (Object) mySQLDatabaseService0);
      Injector.validateBean(quizGroupDao0, (Class<?>) QuizGroupDao.class);
      assertFalse(Dao.SQLITE_NOT_MYSQL);
  }
}