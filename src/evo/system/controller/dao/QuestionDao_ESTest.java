/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 04 01:17:22 GMT 2018
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
import system.controller.dao.QuestionDao;
import system.controller.service.database.MySQLDatabaseService;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class QuestionDao_ESTest extends QuestionDao_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = QuestionDao.__CLR4_1_2125125jp8v55it.lambdaInc(2252, "", 1373);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      QuestionDao.__CLR4_1_2125125jp8v55it questionDao___CLR4_1_2125125jp8v55it0 = new QuestionDao.__CLR4_1_2125125jp8v55it();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      system.controller.dao.QuestionDao questionDao0 = new system.controller.dao.QuestionDao();
      MySQLDatabaseService mySQLDatabaseService0 = mock(MySQLDatabaseService.class, new ViolatedAssumptionAnswer());
      Injector.inject(questionDao0, (Class<?>) Dao.class, "databaseService", (Object) mySQLDatabaseService0);
      Injector.validateBean(questionDao0, (Class<?>) system.controller.dao.QuestionDao.class);
      assertFalse(Dao.SQLITE_NOT_MYSQL);
  }
}
