package com.cherkasov.lab5_alg;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyMatrix {
    void show(List<Vertex> vertices, List<Edge> edges) {
        WideSearch search = new WideSearch();
        List<List<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < vertices.size(); ++i) {
            matrix.add(new ArrayList<>());
            for (int j = 0; j < vertices.size(); ++j) {
                matrix.get(i).add(0);
            }
        }
        for(int i = 0;i < vertices.size();++i){
            for (int j = 0; j < vertices.size(); ++j){
                for(int s = 0;s < edges.size();++s){
                    if((vertices.get(i) == edges.get(s).getVertices().get(0) && vertices.get(j) == edges.get(s).getVertices().get(1))
                            ||(vertices.get(j) == edges.get(s).getVertices().get(0) && vertices.get(i) == edges.get(s).getVertices().get(1))){

                        matrix.get(i).set(j,1);
                        vertices.get(i).addNeighbor(vertices.get(j));
                        vertices.get(j).addNeighbor(vertices.get(i));
                    }
                }
            }
        }

        for(int i = 0;i < matrix.size();++i){
            for(int j = 0;j < matrix.get(i).size();++j){
                System.out.print(matrix.get(i).get(j));
            }
            System.out.println();
        }
        search.search(vertices, edges);
    }
}