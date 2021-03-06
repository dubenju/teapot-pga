/*
 * This file was automatically generated by EvoSuite
 * Thu Jun 18 10:59:11 GMT 2020
 */

package teapot.pga;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import teapot.pga.FileModel;
import teapot.pga.LocModel;
import teapot.pga.Options;
import teapot.pga.SumModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LocModel_ESTest extends LocModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("--LIST-FILE");
      FileSystemHandling.createFolder(evoSuiteFile0);
      Options options0 = new Options();
      options0.set("--LIST-FILE", "--LIST-FILE");
      locModel0.setOptions(options0);
      locModel0.getInputs();
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.setTotal((SumModel) null);
      locModel0.getTotal();
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      SumModel sumModel0 = locModel0.getTotal();
      sumModel0.countWhiteLines();
      locModel0.getTotal();
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      SumModel sumModel0 = locModel0.getTotal();
      sumModel0.setWhiteLines((-1304L));
      locModel0.getTotal();
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      SumModel sumModel0 = locModel0.getTotal();
      sumModel0.countNormalLines();
      locModel0.getTotal();
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      SumModel sumModel0 = new SumModel();
      sumModel0.setNormalLines((-1L));
      locModel0.setTotal(sumModel0);
      locModel0.getTotal();
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      SumModel sumModel0 = new SumModel();
      sumModel0.setLines((-1031L));
      locModel0.setTotal(sumModel0);
      locModel0.getTotal();
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      SumModel sumModel0 = locModel0.getTotal();
      sumModel0.add(sumModel0);
      locModel0.getTotal();
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      SumModel sumModel0 = locModel0.getTotal();
      sumModel0.setFiles((-3259L));
      locModel0.getTotal();
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      SumModel sumModel0 = locModel0.getTotal();
      sumModel0.setFileType(54);
      locModel0.getTotal();
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      SumModel sumModel0 = locModel0.getTotal();
      sumModel0.setFileSize(3808L);
      locModel0.getTotal();
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      SumModel sumModel0 = locModel0.getTotal();
      sumModel0.setFileSize((-1L));
      locModel0.getTotal();
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      SumModel sumModel0 = new SumModel();
      sumModel0.countCommentLines();
      locModel0.setTotal(sumModel0);
      locModel0.getTotal();
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      SumModel sumModel0 = new SumModel();
      sumModel0.setCommentLines((-1L));
      locModel0.setTotal(sumModel0);
      locModel0.getTotal();
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.setSum((Map<Integer, SumModel>) null);
      locModel0.getSum();
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      HashMap<Integer, SumModel> hashMap0 = new HashMap<Integer, SumModel>();
      Integer integer0 = Integer.valueOf((-1));
      hashMap0.put(integer0, (SumModel) null);
      locModel0.setSum(hashMap0);
      locModel0.getSum();
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.setStart(2359L);
      long long0 = locModel0.getStart();
      assertEquals(2359L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.setStart((-1L));
      long long0 = locModel0.getStart();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.setResults((Map<String, FileModel>) null);
      locModel0.getResults();
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      HashMap<String, FileModel> hashMap0 = new HashMap<String, FileModel>();
      FileModel fileModel0 = new FileModel();
      hashMap0.put("%xg8$*gB2Gy+a", fileModel0);
      locModel0.setResults(hashMap0);
      locModel0.getResults();
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      Options options0 = new Options();
      locModel0.setOptions(options0);
      options0.setHasListFile(true);
      locModel0.getOptions();
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      Options options0 = new Options();
      locModel0.setOptions(options0);
      locModel0.getOptions();
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.setFolderCount((-517L));
      long long0 = locModel0.getFolderCount();
      assertEquals((-517L), long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.setFilesIgnored((List<String>) null);
      locModel0.getFilesIgnored();
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.setFileCountUnique((-1L));
      long long0 = locModel0.getFileCountUnique();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.setFileCountText(1L);
      long long0 = locModel0.getFileCountText();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.setFileCountText((-517L));
      long long0 = locModel0.getFileCountText();
      assertEquals((-517L), long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.setFileCountSkiped(1814L);
      long long0 = locModel0.getFileCountSkiped();
      assertEquals(1814L, long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.setFileCountSkiped((-605L));
      long long0 = locModel0.getFileCountSkiped();
      assertEquals((-605L), long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.setFileCountIgnored(2450L);
      long long0 = locModel0.getFileCountIgnored();
      assertEquals(2450L, long0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.setFileCountIgnored((-1L));
      long long0 = locModel0.getFileCountIgnored();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.setFileCountBinary((-1L));
      long long0 = locModel0.getFileCountBinary();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.setFileCount((-2459L));
      long long0 = locModel0.getFileCount();
      assertEquals((-2459L), long0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("--LIST-FILE");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      Options options0 = new Options();
      options0.set("--LIST-FILE", "--LIST-FILE");
      locModel0.setOptions(options0);
      locModel0.getInputs();
      List<String> list0 = locModel0.getErrorInputs();
      assertEquals(0L, locModel0.getFolderCount());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.setEnd(496L);
      long long0 = locModel0.getEnd();
      assertEquals(496L, long0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.setEnd((-3019L));
      long long0 = locModel0.getEnd();
      assertEquals((-3019L), long0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      // Undeclared exception!
      try { 
        locModel0.getInputs();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("teapot.pga.LocModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.setFilesIgnored((List<String>) null);
      // Undeclared exception!
      try { 
        locModel0.addIgnoredFile("`Pq,: m}E-8i");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("teapot.pga.LocModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.setResults((Map<String, FileModel>) null);
      SumModel sumModel0 = new SumModel();
      // Undeclared exception!
      try { 
        locModel0.addFile("ajJpD(C|u", sumModel0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("teapot.pga.LocModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("--LIST-FILE");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      Options options0 = new Options();
      options0.set("--LIST-FILE", "--LIST-FILE");
      locModel0.setOptions(options0);
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      List<File> list0 = locModel0.getInputs();
      assertNotNull(list0);
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("--LIST-FILE");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "z7");
      Options options0 = new Options();
      options0.set("--LIST-FILE", "--LIST-FILE");
      locModel0.setOptions(options0);
      List<File> list0 = locModel0.getInputs();
      assertNotNull(list0);
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      Options options0 = new Options();
      options0.set("--INPUT-DIR", "--INPUT-DIR");
      locModel0.setOptions(options0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("--INPUT-DIR");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "--CSV");
      List<File> list0 = locModel0.getInputs();
      assertNotNull(list0);
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      Options options0 = new Options();
      options0.set("--INPUT-DIR", "--INPUT-DIR");
      locModel0.setOptions(options0);
      List<File> list0 = locModel0.getInputs();
      assertNull(list0);
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      Options options0 = new Options();
      options0.set("--LIST-FILE", "--LIST-FILE");
      locModel0.setOptions(options0);
      locModel0.getInputs();
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.getStart();
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.countFileCountText();
      assertEquals(1L, locModel0.getFileCountText());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.getFileCountSkiped();
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      SumModel sumModel0 = new SumModel();
      locModel0.addFile("ajJpD(C|u", sumModel0);
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.getFileCount();
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.getFileCountUnique();
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      long long0 = locModel0.getFolderCount();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.countFileCountIgnored();
      assertEquals(1L, locModel0.getFileCountIgnored());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.countFileCountBinary();
      long long0 = locModel0.getFileCountBinary();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.getErrorInputs();
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.addIgnoredFile("");
      locModel0.getFilesIgnored();
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.getEnd();
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.getOptions();
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.countFile();
      long long0 = locModel0.getFileCount();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.getFileCountBinary();
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.countFileCountUnique();
      long long0 = locModel0.getFileCountUnique();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.getFileCountIgnored();
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.getFilesIgnored();
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.countFolderCount();
      long long0 = locModel0.getFolderCount();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      Map<Integer, SumModel> map0 = locModel0.getSum();
      locModel0.setSum(map0);
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.getFileCountText();
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      Options options0 = new Options();
      locModel0.setOptions(options0);
      List<File> list0 = locModel0.getInputs();
      locModel0.setInputs(list0);
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      Map<String, FileModel> map0 = locModel0.getResults();
      locModel0.setResults(map0);
      assertEquals(0L, locModel0.getFolderCount());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      locModel0.countFileCountSkiped();
      assertEquals(1L, locModel0.getFileCountSkiped());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      LocModel locModel0 = new LocModel();
      Options options0 = new Options();
      List<String> list0 = options0.getExcludeDirs();
      locModel0.setErrorInputs(list0);
      locModel0.getErrorInputs();
      assertEquals(0L, locModel0.getFolderCount());
  }
}
