/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 04 01:27:01 GMT 2018
 */

package system.model.users;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import system.model.users.User;
import system.model.users.UserType;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class User_ESTest extends User_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object object0 = User.__CLR4_1_217e17ejp8v55v2.lambdaInc(2458, "", 2458);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      User.__CLR4_1_217e17ejp8v55v2 user___CLR4_1_217e17ejp8v55v2_0 = new User.__CLR4_1_217e17ejp8v55v2();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      system.model.users.User user0 = new system.model.users.User();
      system.model.users.User user1 = new system.model.users.User(user0);
      assertFalse(user1.equals((Object)user0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      system.model.users.User user0 = new system.model.users.User();
      user0.getType();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      system.model.users.User user0 = new system.model.users.User();
      String string0 = user0.getLogin();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UserType userType0 = UserType.ADMINISTRATOR;
      system.model.users.User user0 = new system.model.users.User("jK'Eod} r89sx {@uF", "", "jK'Eod} r89sx {@uF", userType0);
      String string0 = user0.getLogin();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UserType userType0 = UserType.ADMINISTRATOR;
      system.model.users.User user0 = new system.model.users.User("jK'Eod} r89sx {@uF", "", "jK'Eod} r89sx {@uF", userType0);
      user0.setId((String) null);
      String string0 = user0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UserType userType0 = UserType.ADMINISTRATOR;
      system.model.users.User user0 = new system.model.users.User("jK'Eod} r89sx {@uF", "", "jK'Eod} r89sx {@uF", userType0);
      user0.setId("");
      String string0 = user0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      system.model.users.User user0 = new system.model.users.User();
      String string0 = user0.getHash();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UserType userType0 = UserType.TEACHER;
      system.model.users.User user0 = new system.model.users.User("", "", "", userType0);
      String string0 = user0.getHash();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UserType userType0 = UserType.ADMINISTRATOR;
      system.model.users.User user0 = new system.model.users.User("jK'Eod} r89sx {@uF", "", "jK'Eod} r89sx {@uF", userType0);
      user0.changeId();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UserType userType0 = UserType.ADMINISTRATOR;
      system.model.users.User user0 = new system.model.users.User("jK'Eod} r89sx {@uF", "", "jK'Eod} r89sx {@uF", userType0);
      UserType userType1 = user0.getType();
      assertEquals(UserType.ADMINISTRATOR, userType1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UserType userType0 = UserType.TEACHER;
      system.model.users.User user0 = new system.model.users.User("ADMINISTRATOR", "ADMINISTRATOR", userType0);
      user0.setLogin("");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      system.model.users.User user0 = null;
      try {
        user0 = new system.model.users.User((system.model.users.User) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("system.model.users.User", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UserType userType0 = UserType.ADMINISTRATOR;
      system.model.users.User user0 = new system.model.users.User("jK'Eod} r89sx {@uF", "", "jK'Eod} r89sx {@uF", userType0);
      String string0 = user0.getHash();
      assertEquals("jK'Eod} r89sx {@uF", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UserType userType0 = UserType.TEACHER;
      system.model.users.User user0 = new system.model.users.User("ADMINISTRATOR", "ADMINISTRATOR", userType0);
      user0.setType(userType0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UserType userType0 = UserType.TEACHER;
      system.model.users.User user0 = new system.model.users.User("ADMINISTRATOR", "ADMINISTRATOR", userType0);
      String string0 = user0.getLogin();
      assertEquals("ADMINISTRATOR", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UserType userType0 = UserType.TEACHER;
      system.model.users.User user0 = new system.model.users.User("ADMINISTRATOR", "ADMINISTRATOR", userType0);
      String string0 = user0.getId();
      assertEquals("00000000-0100-4000-8200-000003000000", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      system.model.users.User user0 = new system.model.users.User();
      user0.setHash("");
  }
}
