public class Q343_IntegerBreak {
  public static int integerBreak(int n) {
    int output = 0;
    int noOfFrag = n / 2;
    int remd = n % 2;
    if (n == 2) {
      output = 1;
    }
    if (n % 2 == 1) {
      noOfFrag += 1;
    }
    int[] arr = new int[noOfFrag];
    int counter = 0;
    for (int i = 2; i <= noOfFrag; i++) {
      int frag = i;
      int avg = n / i;
      int last_avg = avg;
      int last_avg2 = avg;
      int last_avg3 = avg;
      int last_avg4 = avg;
      int last_avg5 = avg;
      int last_avg6 = avg;
      int last_avg7 = avg;
      int last_avg8 = avg;
      int last_avg9 = avg;
      int last_avg10 = avg;
      int last_avg11 = avg;
      int last_avg12 = avg;
      int last_avg13 = avg;
      int last_avg14 = avg;
      int last_avg15 = avg;
      int last_avg16 = avg;
      int last_avg17 = avg;
      int last_avg18 = avg;
      int last_avg19 = avg;
      int last_avg20 = avg;
      int last_avg21 = avg;
      int last_avg22 = avg;
      int last_avg23 = avg;
      int last_avg24 = avg;
      int last_avg25 = avg;
      int last_avg26 = avg;
      int last_avg27 = avg;
      int last_avg28 = avg;

      if (n % i == 1) {
        last_avg = avg + 1;
      }
      if (n % i == 2) {
        last_avg = avg + 1;
        last_avg2 = avg + 1;
      }
      if (n % i == 3) {
        last_avg = avg + 1;
        last_avg2 = avg + 1;
        last_avg3 = avg + 1;
      }
      if (n % i == 4) {
        last_avg = avg + 1;
        last_avg2 = avg + 1;
        last_avg3 = avg + 1;
        last_avg4 = avg + 1;
      }
      if (n % i == 5) {
        last_avg = avg + 1;
        last_avg2 = avg + 1;
        last_avg3 = avg + 1;
        last_avg4 = avg + 1;
        last_avg5 = avg + 1;
      }
      if (n % i == 6) {
        last_avg = avg + 1;
        last_avg2 = avg + 1;
        last_avg3 = avg + 1;
        last_avg4 = avg + 1;
        last_avg5 = avg + 1;
        last_avg6 = avg + 1;
      }
      if (n % i == 7) {
        last_avg = avg + 1;
        last_avg2 = avg + 1;
        last_avg3 = avg + 1;
        last_avg4 = avg + 1;
        last_avg5 = avg + 1;
        last_avg6 = avg + 1;
        last_avg7 = avg + 1;
      }
      if (n % i == 8) {
        last_avg = avg + 1;
        last_avg2 = avg + 1;
        last_avg3 = avg + 1;
        last_avg4 = avg + 1;
        last_avg5 = avg + 1;
        last_avg6 = avg + 1;
        last_avg7 = avg + 1;
        last_avg8 = avg + 1;
      }
      if (n % i == 9) {
        last_avg = avg + 1;
        last_avg2 = avg + 1;
        last_avg3 = avg + 1;
        last_avg4 = avg + 1;
        last_avg5 = avg + 1;
        last_avg6 = avg + 1;
        last_avg7 = avg + 1;
        last_avg8 = avg + 1;
        last_avg9 = avg + 1;
      }
      if (n % i == 10) {
        last_avg = avg + 1;
        last_avg2 = avg + 1;
        last_avg3 = avg + 1;
        last_avg4 = avg + 1;
        last_avg5 = avg + 1;
        last_avg6 = avg + 1;
        last_avg7 = avg + 1;
        last_avg8 = avg + 1;
        last_avg9 = avg + 1;
        last_avg10 = avg + 1;
      }
      if (n % i == 11) {
        last_avg = avg + 1;
        last_avg2 = avg + 1;
        last_avg3 = avg + 1;
        last_avg4 = avg + 1;
        last_avg5 = avg + 1;
        last_avg6 = avg + 1;
        last_avg7 = avg + 1;
        last_avg8 = avg + 1;
        last_avg9 = avg + 1;
        last_avg10 = avg + 1;
        last_avg11 = avg + 1;
      }
      if (n % i == 12) {
        last_avg = avg + 1;
        last_avg2 = avg + 1;
        last_avg3 = avg + 1;
        last_avg4 = avg + 1;
        last_avg5 = avg + 1;
        last_avg6 = avg + 1;
        last_avg7 = avg + 1;
        last_avg8 = avg + 1;
        last_avg9 = avg + 1;
        last_avg10 = avg + 1;
        last_avg11 = avg + 1;
        last_avg12 = avg + 1;
      }
      if (n % i == 13) {
        last_avg = avg + 1;
        last_avg2 = avg + 1;
        last_avg3 = avg + 1;
        last_avg4 = avg + 1;
        last_avg5 = avg + 1;
        last_avg6 = avg + 1;
        last_avg7 = avg + 1;
        last_avg8 = avg + 1;
        last_avg9 = avg + 1;
        last_avg10 = avg + 1;
        last_avg11 = avg + 1;
        last_avg12 = avg + 1;
        last_avg13 = avg + 1;
      }
      if (n % i == 14) {
        last_avg = avg + 1;
        last_avg2 = avg + 1;
        last_avg3 = avg + 1;
        last_avg4 = avg + 1;
        last_avg5 = avg + 1;
        last_avg6 = avg + 1;
        last_avg7 = avg + 1;
        last_avg8 = avg + 1;
        last_avg9 = avg + 1;
        last_avg10 = avg + 1;
        last_avg11 = avg + 1;
        last_avg12 = avg + 1;
        last_avg13 = avg + 1;
        last_avg14 = avg + 1;
      }
      if (n % i == 15) {
        last_avg = avg + 1;
        last_avg2 = avg + 1;
        last_avg3 = avg + 1;
        last_avg4 = avg + 1;
        last_avg5 = avg + 1;
        last_avg6 = avg + 1;
        last_avg7 = avg + 1;
        last_avg8 = avg + 1;
        last_avg9 = avg + 1;
        last_avg10 = avg + 1;
        last_avg11 = avg + 1;
        last_avg12 = avg + 1;
        last_avg13 = avg + 1;
        last_avg14 = avg + 1;
        last_avg15 = avg + 1;
      }
      if (n % i == 16) {
        last_avg = avg + 1;
        last_avg2 = avg + 1;
        last_avg3 = avg + 1;
        last_avg4 = avg + 1;
        last_avg5 = avg + 1;
        last_avg6 = avg + 1;
        last_avg7 = avg + 1;
        last_avg8 = avg + 1;
        last_avg9 = avg + 1;
        last_avg10 = avg + 1;
        last_avg11 = avg + 1;
        last_avg12 = avg + 1;
        last_avg13 = avg + 1;
        last_avg14 = avg + 1;
        last_avg15 = avg + 1;
        last_avg16 = avg + 1;
      }
      if (n % i == 17) {
        last_avg = avg + 1;
        last_avg2 = avg + 1;
        last_avg3 = avg + 1;
        last_avg4 = avg + 1;
        last_avg5 = avg + 1;
        last_avg6 = avg + 1;
        last_avg7 = avg + 1;
        last_avg8 = avg + 1;
        last_avg9 = avg + 1;
        last_avg10 = avg + 1;
        last_avg11 = avg + 1;
        last_avg12 = avg + 1;
        last_avg13 = avg + 1;
        last_avg14 = avg + 1;
        last_avg15 = avg + 1;
        last_avg16 = avg + 1;
        last_avg17 = avg + 1;
      }
      if (n % i == 18) {
        last_avg = avg + 1;
        last_avg2 = avg + 1;
        last_avg3 = avg + 1;
        last_avg4 = avg + 1;
        last_avg5 = avg + 1;
        last_avg6 = avg + 1;
        last_avg7 = avg + 1;
        last_avg8 = avg + 1;
        last_avg9 = avg + 1;
        last_avg10 = avg + 1;
        last_avg11 = avg + 1;
        last_avg12 = avg + 1;
        last_avg13 = avg + 1;
        last_avg14 = avg + 1;
        last_avg15 = avg + 1;
        last_avg16 = avg + 1;
        last_avg17 = avg + 1;
        last_avg18 = avg + 1;
      }
      if (n % i == 19) {
        last_avg = avg + 1;
        last_avg2 = avg + 1;
        last_avg3 = avg + 1;
        last_avg4 = avg + 1;
        last_avg5 = avg + 1;
        last_avg6 = avg + 1;
        last_avg7 = avg + 1;
        last_avg8 = avg + 1;
        last_avg9 = avg + 1;
        last_avg10 = avg + 1;
        last_avg11 = avg + 1;
        last_avg12 = avg + 1;
        last_avg13 = avg + 1;
        last_avg14 = avg + 1;
        last_avg15 = avg + 1;
        last_avg16 = avg + 1;
        last_avg17 = avg + 1;
        last_avg18 = avg + 1;
        last_avg19 = avg + 1;
      }
      if (n % i == 20) {
        last_avg = avg + 1;
        last_avg2 = avg + 1;
        last_avg3 = avg + 1;
        last_avg4 = avg + 1;
        last_avg5 = avg + 1;
        last_avg6 = avg + 1;
        last_avg7 = avg + 1;
        last_avg8 = avg + 1;
        last_avg9 = avg + 1;
        last_avg10 = avg + 1;
        last_avg11 = avg + 1;
        last_avg12 = avg + 1;
        last_avg13 = avg + 1;
        last_avg14 = avg + 1;
        last_avg15 = avg + 1;
        last_avg16 = avg + 1;
        last_avg17 = avg + 1;
        last_avg18 = avg + 1;
        last_avg19 = avg + 1;
        last_avg20 = avg + 1;
      }
      if (n % i == 21) {
        last_avg = avg + 1;
        last_avg2 = avg + 1;
        last_avg3 = avg + 1;
        last_avg4 = avg + 1;
        last_avg5 = avg + 1;
        last_avg6 = avg + 1;
        last_avg7 = avg + 1;
        last_avg8 = avg + 1;
        last_avg9 = avg + 1;
        last_avg10 = avg + 1;
        last_avg11 = avg + 1;
        last_avg12 = avg + 1;
        last_avg13 = avg + 1;
        last_avg14 = avg + 1;
        last_avg15 = avg + 1;
        last_avg16 = avg + 1;
        last_avg17 = avg + 1;
        last_avg18 = avg + 1;
        last_avg19 = avg + 1;
        last_avg20 = avg + 1;
        last_avg21 = avg + 1;
      }
      if (n % i == 22) {
        last_avg = avg + 1;
        last_avg2 = avg + 1;
        last_avg3 = avg + 1;
        last_avg4 = avg + 1;
        last_avg5 = avg + 1;
        last_avg6 = avg + 1;
        last_avg7 = avg + 1;
        last_avg8 = avg + 1;
        last_avg9 = avg + 1;
        last_avg10 = avg + 1;
        last_avg11 = avg + 1;
        last_avg12 = avg + 1;
        last_avg13 = avg + 1;
        last_avg14 = avg + 1;
        last_avg15 = avg + 1;
        last_avg16 = avg + 1;
        last_avg17 = avg + 1;
        last_avg18 = avg + 1;
        last_avg19 = avg + 1;
        last_avg20 = avg + 1;
        last_avg21 = avg + 1;
        last_avg22 = avg + 1;
      }
      if (n % i == 23) {
        last_avg = avg + 1;
        last_avg2 = avg + 1;
        last_avg3 = avg + 1;
        last_avg4 = avg + 1;
        last_avg5 = avg + 1;
        last_avg6 = avg + 1;
        last_avg7 = avg + 1;
        last_avg8 = avg + 1;
        last_avg9 = avg + 1;
        last_avg10 = avg + 1;
        last_avg11 = avg + 1;
        last_avg12 = avg + 1;
        last_avg13 = avg + 1;
        last_avg14 = avg + 1;
        last_avg15 = avg + 1;
        last_avg16 = avg + 1;
        last_avg17 = avg + 1;
        last_avg18 = avg + 1;
        last_avg19 = avg + 1;
        last_avg20 = avg + 1;
        last_avg21 = avg + 1;
        last_avg22 = avg + 1;
        last_avg23 = avg + 1;
      }
      if (n % i == 24) {
        last_avg = avg + 1;
        last_avg2 = avg + 1;
        last_avg3 = avg + 1;
        last_avg4 = avg + 1;
        last_avg5 = avg + 1;
        last_avg6 = avg + 1;
        last_avg7 = avg + 1;
        last_avg8 = avg + 1;
        last_avg9 = avg + 1;
        last_avg10 = avg + 1;
        last_avg11 = avg + 1;
        last_avg12 = avg + 1;
        last_avg13 = avg + 1;
        last_avg14 = avg + 1;
        last_avg15 = avg + 1;
        last_avg16 = avg + 1;
        last_avg17 = avg + 1;
        last_avg18 = avg + 1;
        last_avg19 = avg + 1;
        last_avg20 = avg + 1;
        last_avg21 = avg + 1;
        last_avg22 = avg + 1;
        last_avg23 = avg + 1;
        last_avg24 = avg + 1;
      }
      if (n % i == 25) {
        last_avg = avg + 1;
        last_avg2 = avg + 1;
        last_avg3 = avg + 1;
        last_avg4 = avg + 1;
        last_avg5 = avg + 1;
        last_avg6 = avg + 1;
        last_avg7 = avg + 1;
        last_avg8 = avg + 1;
        last_avg9 = avg + 1;
        last_avg10 = avg + 1;
        last_avg11 = avg + 1;
        last_avg12 = avg + 1;
        last_avg13 = avg + 1;
        last_avg14 = avg + 1;
        last_avg15 = avg + 1;
        last_avg16 = avg + 1;
        last_avg17 = avg + 1;
        last_avg18 = avg + 1;
        last_avg19 = avg + 1;
        last_avg20 = avg + 1;
        last_avg21 = avg + 1;
        last_avg22 = avg + 1;
        last_avg23 = avg + 1;
        last_avg24 = avg + 1;
        last_avg25 = avg + 1;
      }
      if (n % i == 26) {
        last_avg = avg + 1;
        last_avg2 = avg + 1;
        last_avg3 = avg + 1;
        last_avg4 = avg + 1;
        last_avg5 = avg + 1;
        last_avg6 = avg + 1;
        last_avg7 = avg + 1;
        last_avg8 = avg + 1;
        last_avg9 = avg + 1;
        last_avg10 = avg + 1;
        last_avg11 = avg + 1;
        last_avg12 = avg + 1;
        last_avg13 = avg + 1;
        last_avg14 = avg + 1;
        last_avg15 = avg + 1;
        last_avg16 = avg + 1;
        last_avg17 = avg + 1;
        last_avg18 = avg + 1;
        last_avg19 = avg + 1;
        last_avg20 = avg + 1;
        last_avg21 = avg + 1;
        last_avg22 = avg + 1;
        last_avg23 = avg + 1;
        last_avg24 = avg + 1;
        last_avg25 = avg + 1;
        last_avg26 = avg + 1;
      }
      if (n % i == 27) {
        last_avg = avg + 1;
        last_avg2 = avg + 1;
        last_avg3 = avg + 1;
        last_avg4 = avg + 1;
        last_avg5 = avg + 1;
        last_avg6 = avg + 1;
        last_avg7 = avg + 1;
        last_avg8 = avg + 1;
        last_avg9 = avg + 1;
        last_avg10 = avg + 1;
        last_avg11 = avg + 1;
        last_avg12 = avg + 1;
        last_avg13 = avg + 1;
        last_avg14 = avg + 1;
        last_avg15 = avg + 1;
        last_avg16 = avg + 1;
        last_avg17 = avg + 1;
        last_avg18 = avg + 1;
        last_avg19 = avg + 1;
        last_avg20 = avg + 1;
        last_avg21 = avg + 1;
        last_avg22 = avg + 1;
        last_avg23 = avg + 1;
        last_avg24 = avg + 1;
        last_avg25 = avg + 1;
        last_avg26 = avg + 1;
        last_avg27 = avg + 1;
      }
      if (n % i == 28) {
        last_avg = avg + 1;
        last_avg2 = avg + 1;
        last_avg3 = avg + 1;
        last_avg4 = avg + 1;
        last_avg5 = avg + 1;
        last_avg6 = avg + 1;
        last_avg7 = avg + 1;
        last_avg8 = avg + 1;
        last_avg9 = avg + 1;
        last_avg10 = avg + 1;
        last_avg11 = avg + 1;
        last_avg12 = avg + 1;
        last_avg13 = avg + 1;
        last_avg14 = avg + 1;
        last_avg15 = avg + 1;
        last_avg16 = avg + 1;
        last_avg17 = avg + 1;
        last_avg18 = avg + 1;
        last_avg19 = avg + 1;
        last_avg20 = avg + 1;
        last_avg21 = avg + 1;
        last_avg22 = avg + 1;
        last_avg23 = avg + 1;
        last_avg24 = avg + 1;
        last_avg25 = avg + 1;
        last_avg26 = avg + 1;
        last_avg27 = avg + 1;
        last_avg28 = avg + 1;
      }
      int product = avg;
      for (int j = 2; j <= i; j++) {
        if ((n % i == 0) || (n % i == 1)) {
          if (j < i) {
            product = product * avg;
          } else if (j == i) {
            product = product * last_avg;
          }
        } else if (n % i == 2) {
          if (j < (i-1)) {
            product = product * avg;
          } else if (j == (i-1)) {
            product = product * last_avg2;
          } else if (j == i) {
            product = product * last_avg;
          }
        } else if (n % i == 3) {
          if (j < (i-2)) {
            product = product * avg;
          } else if (j == (i-2)) {
            product = product * last_avg3;
          } else if (j == (i-1)) {
            product = product * last_avg2;
          } else if (j == i) {
            product = product * last_avg;
          }
        } else if (n % i == 4) {
          if (j < (i-3)) {
            product = product * avg;
          } else if (j == (i-3)) {
            product = product * last_avg4;
          } else if (j == (i-2)) {
            product = product * last_avg3;
          } else if (j == (i-1)) {
            product = product * last_avg2;
          } else if (j == i) {
            product = product * last_avg;
          }
        } else if (n % i == 5) {
          if (j < (i-4)) {
            product = product * avg;
          } else if (j == (i-4)) {
            product = product * last_avg5;
          } else if (j == (i-3)) {
            product = product * last_avg4;
          } else if (j == (i-2)) {
            product = product * last_avg3;
          } else if (j == (i-1)) {
            product = product * last_avg2;
          } else if (j == i) {
            product = product * last_avg;
          }
        } else if (n % i == 6) {
          if (j < (i-5)) {
            product = product * avg;
          } else if (j == (i-5)) {
            product = product * last_avg6;
          } else if (j == (i-4)) {
            product = product * last_avg5;
          } else if (j == (i-3)) {
            product = product * last_avg4;
          } else if (j == (i-2)) {
            product = product * last_avg3;
          } else if (j == (i-1)) {
            product = product * last_avg2;
          } else if (j == i) {
            product = product * last_avg;
          }
        } else if (n % i == 7) {
          if (j < (i-6)) {
            product = product * avg;
          } else if (j == (i-6)) {
            product = product * last_avg7;
          } else if (j == (i-5)) {
            product = product * last_avg6;
          } else if (j == (i-4)) {
            product = product * last_avg5;
          } else if (j == (i-3)) {
            product = product * last_avg4;
          } else if (j == (i-2)) {
            product = product * last_avg3;
          } else if (j == (i-1)) {
            product = product * last_avg2;
          } else if (j == i) {
            product = product * last_avg;
          }
        } else if (n % i == 8) {
          if (j < (i-7)) {
            product = product * avg;
          } else if (j == (i-7)) {
            product = product * last_avg8;
          } else if (j == (i-6)) {
            product = product * last_avg7;
          } else if (j == (i-5)) {
            product = product * last_avg6;
          } else if (j == (i-4)) {
            product = product * last_avg5;
          } else if (j == (i-3)) {
            product = product * last_avg4;
          } else if (j == (i-2)) {
            product = product * last_avg3;
          } else if (j == (i-1)) {
            product = product * last_avg2;
          } else if (j == i) {
            product = product * last_avg;
          }
        } else if (n % i == 9) {
          if (j < (i-8)) {
            product = product * avg;
          } else if (j == (i-8)) {
            product = product * last_avg9;
          } else if (j == (i-7)) {
            product = product * last_avg8;
          } else if (j == (i-6)) {
            product = product * last_avg7;
          } else if (j == (i-5)) {
            product = product * last_avg6;
          } else if (j == (i-4)) {
            product = product * last_avg5;
          } else if (j == (i-3)) {
            product = product * last_avg4;
          } else if (j == (i-2)) {
            product = product * last_avg3;
          } else if (j == (i-1)) {
            product = product * last_avg2;
          } else if (j == i) {
            product = product * last_avg;
          }
        } else if (n % i == 10) {
          if (j < (i-9)) {
            product = product * avg;
          } else if (j == (i-9)) {
            product = product * last_avg10;
          } else if (j == (i-8)) {
            product = product * last_avg9;
          } else if (j == (i-7)) {
            product = product * last_avg8;
          } else if (j == (i-6)) {
            product = product * last_avg7;
          } else if (j == (i-5)) {
            product = product * last_avg6;
          } else if (j == (i-4)) {
            product = product * last_avg5;
          } else if (j == (i-3)) {
            product = product * last_avg4;
          } else if (j == (i-2)) {
            product = product * last_avg3;
          } else if (j == (i-1)) {
            product = product * last_avg2;
          } else if (j == i) {
            product = product * last_avg;
          }
        } else if (n % i == 11) {
          if (j < (i-10)) {
            product = product * avg;
          } else if (j == (i-10)) {
            product = product * last_avg11;
          } else if (j == (i-9)) {
            product = product * last_avg10;
          } else if (j == (i-8)) {
            product = product * last_avg9;
          } else if (j == (i-7)) {
            product = product * last_avg8;
          } else if (j == (i-6)) {
            product = product * last_avg7;
          } else if (j == (i-5)) {
            product = product * last_avg6;
          } else if (j == (i-4)) {
            product = product * last_avg5;
          } else if (j == (i-3)) {
            product = product * last_avg4;
          } else if (j == (i-2)) {
            product = product * last_avg3;
          } else if (j == (i-1)) {
            product = product * last_avg2;
          } else if (j == i) {
            product = product * last_avg;
          }
        } else if (n % i == 12) {
          if (j < (i-11)) {
            product = product * avg;
          } else if (j == (i-11)) {
            product = product * last_avg12;
          } else if (j == (i-10)) {
            product = product * last_avg11;
          } else if (j == (i-9)) {
            product = product * last_avg10;
          } else if (j == (i-8)) {
            product = product * last_avg9;
          } else if (j == (i-7)) {
            product = product * last_avg8;
          } else if (j == (i-6)) {
            product = product * last_avg7;
          } else if (j == (i-5)) {
            product = product * last_avg6;
          } else if (j == (i-4)) {
            product = product * last_avg5;
          } else if (j == (i-3)) {
            product = product * last_avg4;
          } else if (j == (i-2)) {
            product = product * last_avg3;
          } else if (j == (i-1)) {
            product = product * last_avg2;
          } else if (j == i) {
            product = product * last_avg;
          }
        } else if (n % i == 13) {
          if (j < (i-12)) {
            product = product * avg;
          } else if (j == (i-12)) {
            product = product * last_avg13;
          } else if (j == (i-11)) {
            product = product * last_avg12;
          } else if (j == (i-10)) {
            product = product * last_avg11;
          } else if (j == (i-9)) {
            product = product * last_avg10;
          } else if (j == (i-8)) {
            product = product * last_avg9;
          } else if (j == (i-7)) {
            product = product * last_avg8;
          } else if (j == (i-6)) {
            product = product * last_avg7;
          } else if (j == (i-5)) {
            product = product * last_avg6;
          } else if (j == (i-4)) {
            product = product * last_avg5;
          } else if (j == (i-3)) {
            product = product * last_avg4;
          } else if (j == (i-2)) {
            product = product * last_avg3;
          } else if (j == (i-1)) {
            product = product * last_avg2;
          } else if (j == i) {
            product = product * last_avg;
          }
        } else if (n % i == 14) {
          if (j < (i-13)) {
            product = product * avg;
          } else if (j == (i-13)) {
            product = product * last_avg14;
          } else if (j == (i-12)) {
            product = product * last_avg13;
          } else if (j == (i-11)) {
            product = product * last_avg12;
          } else if (j == (i-10)) {
            product = product * last_avg11;
          } else if (j == (i-9)) {
            product = product * last_avg10;
          } else if (j == (i-8)) {
            product = product * last_avg9;
          } else if (j == (i-7)) {
            product = product * last_avg8;
          } else if (j == (i-6)) {
            product = product * last_avg7;
          } else if (j == (i-5)) {
            product = product * last_avg6;
          } else if (j == (i-4)) {
            product = product * last_avg5;
          } else if (j == (i-3)) {
            product = product * last_avg4;
          } else if (j == (i-2)) {
            product = product * last_avg3;
          } else if (j == (i-1)) {
            product = product * last_avg2;
          } else if (j == i) {
            product = product * last_avg;
          }
        } else if (n % i == 15) {
          if (j < (i-14)) {
            product = product * avg;
          } else if (j == (i-14)) {
            product = product * last_avg15;
          } else if (j == (i-13)) {
            product = product * last_avg14;
          } else if (j == (i-12)) {
            product = product * last_avg13;
          } else if (j == (i-11)) {
            product = product * last_avg12;
          } else if (j == (i-10)) {
            product = product * last_avg11;
          } else if (j == (i-9)) {
            product = product * last_avg10;
          } else if (j == (i-8)) {
            product = product * last_avg9;
          } else if (j == (i-7)) {
            product = product * last_avg8;
          } else if (j == (i-6)) {
            product = product * last_avg7;
          } else if (j == (i-5)) {
            product = product * last_avg6;
          } else if (j == (i-4)) {
            product = product * last_avg5;
          } else if (j == (i-3)) {
            product = product * last_avg4;
          } else if (j == (i-2)) {
            product = product * last_avg3;
          } else if (j == (i-1)) {
            product = product * last_avg2;
          } else if (j == i) {
            product = product * last_avg;
          }
        } else if (n % i == 16) {
          if (j < (i-15)) {
            product = product * avg;
          } else if (j == (i-15)) {
            product = product * last_avg16;
          } else if (j == (i-14)) {
            product = product * last_avg15;
          } else if (j == (i-13)) {
            product = product * last_avg14;
          } else if (j == (i-12)) {
            product = product * last_avg13;
          } else if (j == (i-11)) {
            product = product * last_avg12;
          } else if (j == (i-10)) {
            product = product * last_avg11;
          } else if (j == (i-9)) {
            product = product * last_avg10;
          } else if (j == (i-8)) {
            product = product * last_avg9;
          } else if (j == (i-7)) {
            product = product * last_avg8;
          } else if (j == (i-6)) {
            product = product * last_avg7;
          } else if (j == (i-5)) {
            product = product * last_avg6;
          } else if (j == (i-4)) {
            product = product * last_avg5;
          } else if (j == (i-3)) {
            product = product * last_avg4;
          } else if (j == (i-2)) {
            product = product * last_avg3;
          } else if (j == (i-1)) {
            product = product * last_avg2;
          } else if (j == i) {
            product = product * last_avg;
          }
        } else if (n % i == 17) {
          if (j < (i-16)) {
            product = product * avg;
          } else if (j == (i-16)) {
            product = product * last_avg17;
          } else if (j == (i-15)) {
            product = product * last_avg16;
          } else if (j == (i-14)) {
            product = product * last_avg15;
          } else if (j == (i-13)) {
            product = product * last_avg14;
          } else if (j == (i-12)) {
            product = product * last_avg13;
          } else if (j == (i-11)) {
            product = product * last_avg12;
          } else if (j == (i-10)) {
            product = product * last_avg11;
          } else if (j == (i-9)) {
            product = product * last_avg10;
          } else if (j == (i-8)) {
            product = product * last_avg9;
          } else if (j == (i-7)) {
            product = product * last_avg8;
          } else if (j == (i-6)) {
            product = product * last_avg7;
          } else if (j == (i-5)) {
            product = product * last_avg6;
          } else if (j == (i-4)) {
            product = product * last_avg5;
          } else if (j == (i-3)) {
            product = product * last_avg4;
          } else if (j == (i-2)) {
            product = product * last_avg3;
          } else if (j == (i-1)) {
            product = product * last_avg2;
          } else if (j == i) {
            product = product * last_avg;
          }
        }
      }
      arr[counter] = product;
      counter += 1;
    }
    for (int i = 0; i < arr.length; i++) {
      output = Math.max(arr[i], output);
    }
    // arr
    // find max of prod in arr
    return output;
  }
  // ===========================================================================
  public static void main(String[] args) {
    int n = 2;
    int n2 = 10;
    int n3 = 58;
    int n4 = 8;
    int n5 = 11;
    int n6 = 14;
    int output = Q343_IntegerBreak.integerBreak(n);
    int output2 = Q343_IntegerBreak.integerBreak(n2);
    int output3 = Q343_IntegerBreak.integerBreak(n3);
    int output4 = Q343_IntegerBreak.integerBreak(n4);
    int output5 = Q343_IntegerBreak.integerBreak(n5);  //54
    int output6 = Q343_IntegerBreak.integerBreak(n6);  //162
    System.out.println(output);
    System.out.println(output2);
    System.out.println(output3);
    System.out.println(output4);
    System.out.println(output5);
    System.out.println(output6);
  }
}