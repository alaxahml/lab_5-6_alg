package com.cherkasov.lab5_alg;

import java.util.ArrayList;
import java.util.List;

public class IncidentMatrix {
    void show(List<Vertex> vertices,List<Edge> edges){
        List<List<Integer>> matrix = new ArrayList<>();
        EulerianCycle is_cycle = new EulerianCycle();
        for(int i = 0;i < vertices.size();++i){
            matrix.add(new ArrayList<>());
            for(int j = 0;j < edges.size();++j){
                boolean is_equal = false;
                for(int k = 0;k < vertices.get(i).getEdges().size();++k){
                    if(vertices.get(i).getEdges().get(k)== edges.get(j)){
                        matrix.get(i).add(1);
                        is_equal = true;
                        break;
                    }
                }
                if (!is_equal){
                    matrix.get(i).add(0);
                }
            }
        }
        for(int i = 0;i < matrix.size();++i){
            for(int j = 0;j < matrix.get(i).size();++j){
                System.out.print(matrix.get(i).get(j));
            }
            System.out.println();
        }
        System.out.println();
        is_cycle.check(matrix);
    }
}