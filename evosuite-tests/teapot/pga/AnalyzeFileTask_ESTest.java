/*
 * This file was automatically generated by EvoSuite
 * Thu Jun 18 10:48:22 GMT 2020
 */

package teapot.pga;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import teapot.pga.AnalyzeFileTask;
import teapot.pga.FileModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AnalyzeFileTask_ESTest extends AnalyzeFileTask_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      File file0 = MockFile.createTempFile("aRX>[a?", "aRX>[a?");
      FileModel fileModel0 = new FileModel("");
      AnalyzeFileTask analyzeFileTask0 = new AnalyzeFileTask("", file0, fileModel0);
      fileModel0.setFileName((String) null);
      // Undeclared exception!
      try { 
        analyzeFileTask0.run();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("teapot.pga.FileModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FileModel fileModel0 = new FileModel();
      AnalyzeFileTask analyzeFileTask0 = null;
      try {
        analyzeFileTask0 = new AnalyzeFileTask((String) null, (File) null, fileModel0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("teapot.pga.AnalyzeFileTask", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("LDuBMKdz");
      byte[] byteArray0 = new byte[1];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      MockFile mockFile0 = new MockFile("", "");
      MockFile mockFile1 = new MockFile(mockFile0, "LDuBMKdz");
      AnalyzeFileTask analyzeFileTask0 = new AnalyzeFileTask("", mockFile1);
      analyzeFileTask0.run();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AnalyzeFileTask analyzeFileTask0 = null;
      try {
        analyzeFileTask0 = new AnalyzeFileTask("", (File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("teapot.pga.AnalyzeFileTask", e);
      }
  }
}
