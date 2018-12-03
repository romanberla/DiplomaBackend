/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 03 23:09:18 GMT 2018
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
import system.controller.dao.QuestionDao;
import system.controller.service.QuestionGroupService;
import system.controller.service.QuestionService;
import system.controller.simple_frontend_models.QuestionWithCategoryNames;
import system.model.questions.Question;
import system.model.questions.QuestionGroup;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class QuestionService_ESTest extends QuestionService_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QuestionService questionService0 = new QuestionService();
      QuestionDao questionDao0 = mock(QuestionDao.class, new ViolatedAssumptionAnswer());
      doReturn((LinkedList) null).when(questionDao0).getAll();
      Injector.inject(questionService0, (Class<?>) QuestionService.class, "dao", (Object) questionDao0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(questionService0, (Class<?>) QuestionService.class, "questionGroupService", (Object) questionGroupService0);
      Injector.validateBean(questionService0, (Class<?>) QuestionService.class);
      QuestionService questionService1 = new QuestionService();
      LinkedList<Question> linkedList0 = questionService0.getAll();
      QuestionDao questionDao1 = mock(QuestionDao.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0, linkedList0, linkedList0).when(questionDao1).getAll();
      Injector.inject(questionService1, (Class<?>) QuestionService.class, "dao", (Object) questionDao1);
      QuestionGroupService questionGroupService1 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(questionService1, (Class<?>) QuestionService.class, "questionGroupService", (Object) questionGroupService1);
      Question question0 = mock(Question.class, new ViolatedAssumptionAnswer());
      doReturn("Mvq+la=").when(question0).getId();
      questionService1.add(question0);
      Injector.validateBean(questionService1, (Class<?>) QuestionService.class);
      QuestionDao questionDao2 = questionService1.dao;
      questionService0.dao = questionDao2;
      questionService0.updateCached();
      // Undeclared exception!
      try { 
        questionService0.removeQuestionsFromGroup("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("system.controller.service.QuestionService", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QuestionService questionService0 = new QuestionService();
      QuestionDao questionDao0 = mock(QuestionDao.class, new ViolatedAssumptionAnswer());
      doReturn((LinkedList) null, (LinkedList) null).when(questionDao0).getAll();
      Injector.inject(questionService0, (Class<?>) QuestionService.class, "dao", (Object) questionDao0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(questionService0, (Class<?>) QuestionService.class, "questionGroupService", (Object) questionGroupService0);
      Injector.validateBean(questionService0, (Class<?>) QuestionService.class);
      QuestionService questionService1 = new QuestionService();
      LinkedList<Question> linkedList0 = questionService0.getAll();
      LinkedList<Question> linkedList1 = questionService0.getAll();
      QuestionDao questionDao1 = mock(QuestionDao.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0, linkedList1).when(questionDao1).getAll();
      Injector.inject(questionService1, (Class<?>) QuestionService.class, "dao", (Object) questionDao1);
      QuestionGroupService questionGroupService1 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(questionService1, (Class<?>) QuestionService.class, "questionGroupService", (Object) questionGroupService1);
      Question question0 = mock(Question.class, new ViolatedAssumptionAnswer());
      doReturn("").when(question0).getId();
      questionService1.add(question0);
      Injector.validateBean(questionService1, (Class<?>) QuestionService.class);
      QuestionDao questionDao2 = questionService1.dao;
      questionService0.dao = questionDao2;
      // Undeclared exception!
      try { 
        questionService0.removeQuestionsFromGroup("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("system.controller.service.QuestionService", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QuestionService questionService0 = new QuestionService();
      QuestionDao questionDao0 = mock(QuestionDao.class, new ViolatedAssumptionAnswer());
      Injector.inject(questionService0, (Class<?>) QuestionService.class, "dao", (Object) questionDao0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(questionService0, (Class<?>) QuestionService.class, "questionGroupService", (Object) questionGroupService0);
      Injector.validateBean(questionService0, (Class<?>) QuestionService.class);
      QuestionService questionService1 = new QuestionService();
      QuestionDao questionDao1 = mock(QuestionDao.class, new ViolatedAssumptionAnswer());
      doReturn((LinkedList) null, (LinkedList) null, (LinkedList) null).when(questionDao1).getAll();
      Injector.inject(questionService1, (Class<?>) QuestionService.class, "dao", (Object) questionDao1);
      QuestionGroupService questionGroupService1 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(questionService1, (Class<?>) QuestionService.class, "questionGroupService", (Object) questionGroupService1);
      Question question0 = mock(Question.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(question0).getId();
      questionService1.add(question0);
      Injector.validateBean(questionService1, (Class<?>) QuestionService.class);
      QuestionDao questionDao2 = questionService1.dao;
      questionService0.dao = questionDao2;
      questionService0.updateCached();
      // Undeclared exception!
      try { 
        questionService0.removeQuestionsFromGroup("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("system.controller.service.QuestionService", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QuestionService questionService0 = new QuestionService();
      QuestionDao questionDao0 = mock(QuestionDao.class, new ViolatedAssumptionAnswer());
      doReturn((LinkedList) null).when(questionDao0).getAll();
      Injector.inject(questionService0, (Class<?>) QuestionService.class, "dao", (Object) questionDao0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(questionService0, (Class<?>) QuestionService.class, "questionGroupService", (Object) questionGroupService0);
      Injector.validateBean(questionService0, (Class<?>) QuestionService.class);
      // Undeclared exception!
      try { 
        questionService0.get("KN2}u");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("system.controller.service.QuestionService", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QuestionService questionService0 = new QuestionService();
      QuestionDao questionDao0 = mock(QuestionDao.class, new ViolatedAssumptionAnswer());
      doReturn((LinkedList) null).when(questionDao0).getAll();
      Injector.inject(questionService0, (Class<?>) QuestionService.class, "dao", (Object) questionDao0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(questionService0, (Class<?>) QuestionService.class, "questionGroupService", (Object) questionGroupService0);
      Injector.validateBean(questionService0, (Class<?>) QuestionService.class);
      // Undeclared exception!
      try { 
        questionService0.add((Question) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("system.controller.service.QuestionService", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QuestionService questionService0 = new QuestionService();
      QuestionDao questionDao0 = mock(QuestionDao.class, new ViolatedAssumptionAnswer());
      doReturn((LinkedList) null, (LinkedList) null).when(questionDao0).getAll();
      Injector.inject(questionService0, (Class<?>) QuestionService.class, "dao", (Object) questionDao0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(questionService0, (Class<?>) QuestionService.class, "questionGroupService", (Object) questionGroupService0);
      Injector.validateBean(questionService0, (Class<?>) QuestionService.class);
      questionService0.getAll();
      // Undeclared exception!
      try { 
        questionService0.removeQuestionsFromGroup("5E4~0'nH)n");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("system.controller.service.QuestionService", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Object object0 = system.controller.service.QuestionService.__CLR4_1_2qdqdjp8v556r.lambdaInc((-847), integer0, (-847));
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        system.controller.service.QuestionService.__CLR4_1_2qdqdjp8v556r.lambdaInc(1004, (String) null, 1004);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("system.controller.service.QuestionService$__CLR4_1_2qdqdjp8v556r", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QuestionService questionService0 = new QuestionService();
      QuestionDao questionDao0 = mock(QuestionDao.class, new ViolatedAssumptionAnswer());
      doReturn((LinkedList<Object>) null).when(questionDao0).getAll();
      Injector.inject(questionService0, (Class<?>) QuestionService.class, "dao", (Object) questionDao0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(questionService0, (Class<?>) QuestionService.class, "questionGroupService", (Object) questionGroupService0);
      Injector.validateBean(questionService0, (Class<?>) QuestionService.class);
      LinkedList<Question> linkedList0 = questionService0.getAll();
      assertNull(linkedList0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QuestionService questionService0 = new QuestionService();
      QuestionDao questionDao0 = mock(QuestionDao.class, new ViolatedAssumptionAnswer());
      Injector.inject(questionService0, (Class<?>) QuestionService.class, "dao", (Object) questionDao0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(questionService0, (Class<?>) QuestionService.class, "questionGroupService", (Object) questionGroupService0);
      Injector.validateBean(questionService0, (Class<?>) QuestionService.class);
      questionService0.dao = null;
      // Undeclared exception!
      try { 
        questionService0.getAllWithCatNamesByTeacher("ok");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("system.controller.service.QuestionService", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QuestionService questionService0 = new QuestionService();
      QuestionDao questionDao0 = mock(QuestionDao.class, new ViolatedAssumptionAnswer());
      Injector.inject(questionService0, (Class<?>) QuestionService.class, "dao", (Object) questionDao0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(questionService0, (Class<?>) QuestionService.class, "questionGroupService", (Object) questionGroupService0);
      Injector.validateBean(questionService0, (Class<?>) QuestionService.class);
      questionService0.dao = null;
      // Undeclared exception!
      try { 
        questionService0.remove("?zWa&-YamC6*");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("system.controller.service.QuestionService", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QuestionService questionService0 = new QuestionService();
      QuestionDao questionDao0 = mock(QuestionDao.class, new ViolatedAssumptionAnswer());
      doReturn((LinkedList<Question>) null).when(questionDao0).getAll();
      Injector.inject(questionService0, (Class<?>) QuestionService.class, "dao", (Object) questionDao0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(questionService0, (Class<?>) QuestionService.class, "questionGroupService", (Object) questionGroupService0);
      Injector.validateBean(questionService0, (Class<?>) QuestionService.class);
      String string0 = "7J]";
      // Undeclared exception!
      try { 
        questionService0.removeQuestionsFromGroup("7J]");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("system.controller.service.QuestionService", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QuestionService questionService0 = new QuestionService();
      QuestionDao questionDao0 = mock(QuestionDao.class, new ViolatedAssumptionAnswer());
      doReturn((LinkedList<Object>) null).when(questionDao0).getAll();
      Injector.inject(questionService0, (Class<?>) QuestionService.class, "dao", (Object) questionDao0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      doReturn((LinkedList) null).when(questionGroupService0).getAll();
      Injector.inject(questionService0, (Class<?>) QuestionService.class, "questionGroupService", (Object) questionGroupService0);
      Injector.validateBean(questionService0, (Class<?>) QuestionService.class);
      // Undeclared exception!
      try { 
        questionService0.getAllWithCatNames();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("system.controller.service.QuestionService", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QuestionService questionService0 = new QuestionService();
      QuestionDao questionDao0 = mock(QuestionDao.class, new ViolatedAssumptionAnswer());
      doReturn((LinkedList<Object>) null).when(questionDao0).getAll();
      Injector.inject(questionService0, (Class<?>) QuestionService.class, "dao", (Object) questionDao0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(questionService0, (Class<?>) QuestionService.class, "questionGroupService", (Object) questionGroupService0);
      Injector.validateBean(questionService0, (Class<?>) QuestionService.class);
      QuestionGroupService questionGroupService1 = questionService0.questionGroupService;
      questionService0.questionGroupService = questionGroupService1;
      QuestionGroupService questionGroupService2 = questionService0.questionGroupService;
      questionService0.questionGroupService = questionGroupService2;
      // Undeclared exception!
      try { 
        questionService0.get("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("system.controller.service.QuestionService", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QuestionService questionService0 = new QuestionService();
      QuestionDao questionDao0 = mock(QuestionDao.class, new ViolatedAssumptionAnswer());
      Injector.inject(questionService0, (Class<?>) QuestionService.class, "dao", (Object) questionDao0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(questionService0, (Class<?>) QuestionService.class, "questionGroupService", (Object) questionGroupService0);
      Injector.validateBean(questionService0, (Class<?>) QuestionService.class);
      questionService0.dao = null;
      // Undeclared exception!
      try { 
        questionService0.updateCached();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("system.controller.service.QuestionService", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QuestionService questionService0 = new QuestionService();
      QuestionDao questionDao0 = mock(QuestionDao.class, new ViolatedAssumptionAnswer());
      Injector.inject(questionService0, (Class<?>) QuestionService.class, "dao", (Object) questionDao0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(questionService0, (Class<?>) QuestionService.class, "questionGroupService", (Object) questionGroupService0);
      Injector.validateBean(questionService0, (Class<?>) QuestionService.class);
      questionService0.dao = null;
      // Undeclared exception!
      try { 
        questionService0.getAll();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("system.controller.service.QuestionService", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QuestionService questionService0 = new QuestionService();
      QuestionDao questionDao0 = mock(QuestionDao.class, new ViolatedAssumptionAnswer());
      doReturn((LinkedList) null).when(questionDao0).getAll();
      Injector.inject(questionService0, (Class<?>) QuestionService.class, "dao", (Object) questionDao0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(questionService0, (Class<?>) QuestionService.class, "questionGroupService", (Object) questionGroupService0);
      Injector.validateBean(questionService0, (Class<?>) QuestionService.class);
      Question question0 = mock(Question.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(question0).getId();
      String string0 = questionService0.add(question0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      system.controller.service.QuestionService.__CLR4_1_2qdqdjp8v556r questionService___CLR4_1_2qdqdjp8v556r0 = new system.controller.service.QuestionService.__CLR4_1_2qdqdjp8v556r();
      QuestionService questionService0 = new QuestionService();
      QuestionDao questionDao0 = mock(QuestionDao.class, new ViolatedAssumptionAnswer());
      doReturn((LinkedList) null).when(questionDao0).getAll();
      Injector.inject(questionService0, (Class<?>) QuestionService.class, "dao", (Object) questionDao0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      doReturn((LinkedList) null).when(questionGroupService0).getAll();
      Injector.inject(questionService0, (Class<?>) QuestionService.class, "questionGroupService", (Object) questionGroupService0);
      Injector.validateBean(questionService0, (Class<?>) QuestionService.class);
      // Undeclared exception!
      try { 
        questionService0.getAllWithCatNames();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("system.controller.service.QuestionService", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QuestionService questionService0 = new QuestionService();
      QuestionDao questionDao0 = mock(QuestionDao.class, new ViolatedAssumptionAnswer());
      doReturn((LinkedList) null, (LinkedList) null).when(questionDao0).getAll();
      Injector.inject(questionService0, (Class<?>) QuestionService.class, "dao", (Object) questionDao0);
      QuestionGroupService questionGroupService0 = mock(QuestionGroupService.class, new ViolatedAssumptionAnswer());
      Injector.inject(questionService0, (Class<?>) QuestionService.class, "questionGroupService", (Object) questionGroupService0);
      Injector.validateBean(questionService0, (Class<?>) QuestionService.class);
      questionService0.updateCached();
      String string0 = "";
      // Undeclared exception!
      try { 
        questionService0.removeQuestionsFromGroup("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("system.controller.service.QuestionService", e);
      }
  }
}
