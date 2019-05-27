package com.cherkasov.lab5_alg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class EulerianCycle {
    public void check(List<List<Integer>> matrix) {
        Scanner in = new Scanner(System.in);
        List<Integer> marked = new ArrayList<>();
        Stack<Integer> cycle = new Stack<>();
        System.out.println("Введите номер начальной вершины: ");
        int n = in.nextInt();
        for (int i = 0; i < matrix.size(); ++i) {
            int degcounter = 0;
            for (int j = 0; j < matrix.get(i).size(); ++j) {
                degcounter += matrix.get(i).get(j);
            }
            if (degcounter % 2 != 0) {
                System.out.println("Граф не является эйлеровым");
                return;
            }
        }
        cycle.push(n);
        while (!cycle.empty()) {
            int current = cycle.peek();
            int adjacent = -1;
            boolean is_not_marked = true;
            for (int i = 0; i < matrix.get(current).size(); ++i) {
                if (matrix.get(current).get(i) == 1) {
                    is_not_marked = true;
                    for (int j = 0; j < marked.size(); ++j) {
                        if (marked.get(j) == i) {
                            is_not_marked = false;
                        }
                    }
                    if (is_not_marked) {
                        adjacent = i;
                        break;

                    }
                }
            }
            if (is_not_marked) {
                marked.add(adjacent);
                for (int i1 = 0; i1 < matrix.size(); ++i1) {
                    if (i1 != current && matrix.get(i1).get(adjacent) == 1) {
                        cycle.push(i1);
                        break;
                    }
                }
            } else {
                System.out.print(cycle.pop() + "->");
            }
        }
        System.out.println();
    }
}



