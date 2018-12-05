/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 04 01:18:17 GMT 2018
 */

package system.model.games;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SingleChoiceAnswer_ESTest extends SingleChoiceAnswer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = SingleChoiceAnswer.__CLR4_1_21i11i1jp8v55yw.lambdaInc((-1), "cSA.D]wi+X", 0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SingleChoiceAnswer.__CLR4_1_21i11i1jp8v55yw singleChoiceAnswer___CLR4_1_21i11i1jp8v55yw0 = new SingleChoiceAnswer.__CLR4_1_21i11i1jp8v55yw();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Double double0 = new Double(0);
      SingleChoiceAnswer singleChoiceAnswer0 = new SingleChoiceAnswer(0, double0);
      Double double1 = new Double((-2831.06));
      singleChoiceAnswer0.setCorrect(double1);
      Double double2 = singleChoiceAnswer0.getCorrect();
      assertEquals((-2831.06), (double)double2, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SingleChoiceAnswer singleChoiceAnswer0 = new SingleChoiceAnswer(1951, (Double) null);
      Double double0 = new Double(0.0);
      singleChoiceAnswer0.setCorrect(double0);
      Double double1 = singleChoiceAnswer0.getCorrect();
      assertEquals(0.0, (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SingleChoiceAnswer singleChoiceAnswer0 = new SingleChoiceAnswer(0);
      Double double0 = new Double(619.6129447);
      singleChoiceAnswer0.setCorrect(double0);
      Double double1 = singleChoiceAnswer0.getCorrect();
      assertEquals(619.6129447, (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SingleChoiceAnswer singleChoiceAnswer0 = new SingleChoiceAnswer(0);
      int int0 = singleChoiceAnswer0.getAnswerIndex();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SingleChoiceAnswer singleChoiceAnswer0 = new SingleChoiceAnswer(0);
      singleChoiceAnswer0.setAnswerIndex(1668);
      int int0 = singleChoiceAnswer0.getAnswerIndex();
      assertEquals(1668, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SingleChoiceAnswer singleChoiceAnswer0 = new SingleChoiceAnswer((-436));
      Double double0 = singleChoiceAnswer0.getCorrect();
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SingleChoiceAnswer singleChoiceAnswer0 = new SingleChoiceAnswer((-436));
      int int0 = singleChoiceAnswer0.getAnswerIndex();
      assertEquals((-436), int0);
  }
}