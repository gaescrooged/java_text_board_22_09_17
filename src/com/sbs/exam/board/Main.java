package com.sbs.exam.board;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("== 게시판 v 0.1 ==");
    System.out.println("== 프로그램 시작 ==");

    while(true) { // while 문 무한 루프
      System.out.printf("명령"); //
      String cmd = sc.nextLine();

      if(cmd.equals(" exit")) {
        break;
      }

      System.out.printf("입력 된 명령어 : %s\n", cmd);
    }

    System.out.println("== 프로그램 종료 ==");
    sc.close();

  }
}