// 활용 - 지정한 폴더에서 .class 파일만 찾아 출력하라.
package com.eomcs.io.ex01;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Exam0730x {

  public static void main(String[] args) throws Exception {

    File dir = new File("bin/main");
    System.out.println(dir.getCanonicalPath());

    printClasses(dir);
  }

  static void printClasses(File dir) throws IOException {
    System.out.println(dir.getCanonicalPath());

    class JavaClassFilter implements FileFilter{
      @Override
      public boolean accept(File pathname) {
        if(pathname.isFile() && pathname.getName().endsWith(".class") || pathname.isDirectory()) {
          return true;
        }
        return false;
      }
    }


    File[] files = dir.listFiles(new JavaClassFilter());
    for(File f : files) {
      if(f.isDirectory()) {
        printClasses(f);
      }else {
        System.out.println(f.getName());

      }
    }


  }


}
