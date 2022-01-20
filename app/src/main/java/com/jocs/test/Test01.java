package com.jocs.test;

public class Test01 {

  public static void main(String[] args) throws Exception {

    String str = "AB가각";

    byte[] buf = str.getBytes("MS949");

    for(byte a : buf) {
      System.out.printf("%x ", a);
    }
  }
}