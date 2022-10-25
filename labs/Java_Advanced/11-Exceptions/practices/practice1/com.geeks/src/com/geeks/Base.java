/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.geeks;

/**
 *
 * @author byron
 */
class T {
  int t = 20;
  T() {
    t = 40;
  }
}
class Base {
   public static void main(String args[]) {
      T t1 = new T();
      System.out.println(t1.t);
   }
}