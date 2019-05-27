package com.cherkasov.lab5_alg;

import java.util.*;

public class WideSearch {
    public void search(List<Vertex> vertices, List<Edge> edges){
        Queue<Vertex> queue = new LinkedList<>();
        int num;
        for(int i = 0;i < vertices.size();++i){
            vertices.get(i).setLabel(-1);
        }
        num = (int)Math.random() * vertices.size();
        vertices.get(num).setLabel(0);
        queue.add(vertices.get(num));

        while(!queue.isEmpty()){
            Vertex temp = queue.peek();
            queue.remove();
            List<Vertex>neigbors = temp.getNeigbors();
            for(int i = 0;i < temp.getNeigbors().size();++i){
                if(neigbors.get(i).getLabel() == -1){
                    neigbors.get(i).setLabel(temp.getLabel()+1);
                    queue.add(neigbors.get(i));
                }
            }
        }

        boolean is_coherent = true;
        for(int i = 0;i < vertices.size();++i){
            System.out.println(vertices.get(i).getLabel());
            if(vertices.get(i).getLabel() == -1){
                is_coherent = false;
            }
        }
        if(!is_coherent){
            System.out.println("не связный");
        }
        else{
            System.out.println("связный");
        }
        for(int i = 0;i < edges.size();++i){
            List<Vertex> indvertices = edges.get(i).getVertices();
            int a = (indvertices.get(1).getLabel()%2);
            int b = (indvertices.get(0).getLabel()%2);
            if(a == b){
                System.out.println("не двудолььный");
                return;
            }
        }
        System.out.println("двудольный");

    }
}
