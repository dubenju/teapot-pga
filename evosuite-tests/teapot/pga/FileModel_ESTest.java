/*
 * This file was automatically generated by EvoSuite
 * Thu Jun 18 10:53:32 GMT 2020
 */

package teapot.pga;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import teapot.pga.FileModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileModel_ESTest extends FileModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileModel fileModel0 = new FileModel("iPnDOb.XML");
      fileModel0.setFileType((-1438167442));
      assertEquals(10255, fileModel0.getFileType());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileModel fileModel0 = new FileModel();
      fileModel0.setFileName("xLhST/yGZhG{5?R");
      fileModel0.setFileType(3696);
      assertEquals(3696, fileModel0.getFileType());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileModel fileModel0 = new FileModel("WG(O'xX{%");
      fileModel0.setFileType(882);
      assertEquals(882, fileModel0.getFileType());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileModel fileModel0 = new FileModel("");
      fileModel0.countNormalLines();
      fileModel0.add(fileModel0);
      assertEquals(2L, fileModel0.getNormalLines());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileModel fileModel0 = new FileModel();
      fileModel0.countCommentLines();
      fileModel0.add(fileModel0);
      assertEquals(2L, fileModel0.getLines());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileModel fileModel0 = new FileModel("");
      FileModel fileModel1 = new FileModel("TPD");
      fileModel0.add(fileModel1);
      assertEquals(0L, fileModel1.getCommentLines());
      assertEquals(0L, fileModel1.getWhiteLines());
      assertEquals(0L, fileModel1.getFileSize());
      assertEquals(0L, fileModel1.getLines());
      assertEquals(0L, fileModel1.getNormalLines());
      assertEquals(0L, fileModel0.getNormalLines());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileModel fileModel0 = new FileModel("");
      fileModel0.countWhiteLines();
      fileModel0.add(fileModel0);
      assertEquals(2L, fileModel0.getLines());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileModel fileModel0 = new FileModel("WG(O'xX{%");
      fileModel0.countWhiteLines();
      long long0 = fileModel0.getWhiteLines();
      assertEquals(1L, fileModel0.getLines());
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileModel fileModel0 = new FileModel();
      fileModel0.setWhiteLines((-4411L));
      long long0 = fileModel0.getWhiteLines();
      assertEquals((-4411L), long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileModel fileModel0 = new FileModel((String) null);
      fileModel0.setNormalLines((-288L));
      long long0 = fileModel0.getNormalLines();
      assertEquals((-288L), long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileModel fileModel0 = new FileModel("");
      fileModel0.countNormalLines();
      long long0 = fileModel0.getLines();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileModel fileModel0 = new FileModel();
      fileModel0.setLines((-833));
      long long0 = fileModel0.getLines();
      assertEquals((-833L), long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileModel fileModel0 = new FileModel();
      fileModel0.setFileType(2344);
      int int0 = fileModel0.getFileType();
      assertEquals(2344, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileModel fileModel0 = new FileModel();
      fileModel0.setFileType((-4053));
      int int0 = fileModel0.getFileType();
      assertEquals((-4053), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileModel fileModel0 = new FileModel();
      fileModel0.setFileSize(4030L);
      long long0 = fileModel0.getFileSize();
      assertEquals(4030L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileModel fileModel0 = new FileModel();
      fileModel0.setFileSize((-4379L));
      long long0 = fileModel0.getFileSize();
      assertEquals((-4379L), long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileModel fileModel0 = new FileModel((String) null);
      fileModel0.getFileName();
      assertEquals(0L, fileModel0.getCommentLines());
      assertEquals(0L, fileModel0.getLines());
      assertEquals(0L, fileModel0.getFileSize());
      assertEquals(0L, fileModel0.getWhiteLines());
      assertEquals(0L, fileModel0.getNormalLines());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileModel fileModel0 = new FileModel();
      fileModel0.getFileName();
      assertEquals(0L, fileModel0.getWhiteLines());
      assertEquals(0L, fileModel0.getFileSize());
      assertEquals(0L, fileModel0.getCommentLines());
      assertEquals(0L, fileModel0.getLines());
      assertEquals(0L, fileModel0.getNormalLines());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileModel fileModel0 = new FileModel("");
      fileModel0.setCommentLines((-1877L));
      long long0 = fileModel0.getCommentLines();
      assertEquals((-1877L), long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileModel fileModel0 = new FileModel();
      // Undeclared exception!
      try { 
        fileModel0.add((FileModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("teapot.pga.FileModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileModel fileModel0 = new FileModel("WG(O'xX{%");
      long long0 = fileModel0.getWhiteLines();
      assertEquals(0L, fileModel0.getNormalLines());
      assertEquals(0L, long0);
      assertEquals(0L, fileModel0.getFileSize());
      assertEquals(0L, fileModel0.getCommentLines());
      assertEquals(0L, fileModel0.getLines());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileModel fileModel0 = new FileModel("");
      long long0 = fileModel0.getLines();
      assertEquals(0L, fileModel0.getFileSize());
      assertEquals(0L, fileModel0.getWhiteLines());
      assertEquals(0L, fileModel0.getNormalLines());
      assertEquals(0L, long0);
      assertEquals(0L, fileModel0.getCommentLines());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileModel fileModel0 = new FileModel();
      int int0 = fileModel0.getFileType();
      assertEquals(0L, fileModel0.getNormalLines());
      assertEquals(0L, fileModel0.getFileSize());
      assertEquals(0L, fileModel0.getLines());
      assertEquals(0L, fileModel0.getCommentLines());
      assertEquals(0L, fileModel0.getWhiteLines());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileModel fileModel0 = new FileModel("WG(O'xX{%");
      fileModel0.getFileName();
      assertEquals(0L, fileModel0.getFileSize());
      assertEquals(0L, fileModel0.getNormalLines());
      assertEquals(0L, fileModel0.getLines());
      assertEquals(0L, fileModel0.getCommentLines());
      assertEquals(0L, fileModel0.getWhiteLines());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FileModel fileModel0 = new FileModel();
      long long0 = fileModel0.getFileSize();
      assertEquals(0L, fileModel0.getWhiteLines());
      assertEquals(0L, long0);
      assertEquals(0L, fileModel0.getNormalLines());
      assertEquals(0L, fileModel0.getCommentLines());
      assertEquals(0L, fileModel0.getLines());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FileModel fileModel0 = new FileModel();
      long long0 = fileModel0.getNormalLines();
      assertEquals(0L, fileModel0.getWhiteLines());
      assertEquals(0L, fileModel0.getCommentLines());
      assertEquals(0L, long0);
      assertEquals(0L, fileModel0.getLines());
      assertEquals(0L, fileModel0.getFileSize());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FileModel fileModel0 = new FileModel();
      long long0 = fileModel0.getCommentLines();
      assertEquals(0L, fileModel0.getWhiteLines());
      assertEquals(0L, fileModel0.getNormalLines());
      assertEquals(0L, fileModel0.getFileSize());
      assertEquals(0L, long0);
      assertEquals(0L, fileModel0.getLines());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FileModel fileModel0 = new FileModel("Ji5DKpb.Xnk");
      fileModel0.setFileType((-145100235));
      assertEquals((-1), fileModel0.getFileType());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FileModel fileModel0 = new FileModel("BUILD.XML");
      fileModel0.setFileType(2964);
      assertEquals(10007, fileModel0.getFileType());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FileModel fileModel0 = new FileModel();
      fileModel0.countCommentLines();
      long long0 = fileModel0.getCommentLines();
      assertEquals(1L, fileModel0.getLines());
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FileModel fileModel0 = new FileModel();
      fileModel0.countNormalLines();
      long long0 = fileModel0.getNormalLines();
      assertEquals(1L, fileModel0.getLines());
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FileModel fileModel0 = new FileModel();
      fileModel0.setFileName((String) null);
      // Undeclared exception!
      try { 
        fileModel0.setFileType((-383));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("teapot.pga.FileModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FileModel fileModel0 = new FileModel("BUILD.XML");
      String string0 = fileModel0.toString();
      assertEquals("FileModel(fileName=BUILD.XML, fileSize=0, fileType=0, lines=0, whiteLines=0, commentLines=0, normalLines=0)", string0);
  }
}
