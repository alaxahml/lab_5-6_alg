package com.cherkasov.lab5_alg;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        List<Vertex> vertices = new ArrayList<>();
        List<Edge> edges = new ArrayList<>();
        IncidentMatrix matrix1 = new IncidentMatrix();
        AdjacencyMatrix matrix2 = new AdjacencyMatrix();
        vertices.add(new Vertex());
        vertices.add(new Vertex());
        vertices.add(new Vertex());
        vertices.add(new Vertex());
        //vertices.add(new Vertex());

        edges.add(new Edge());
        edges.get(0).addVertex(vertices.get(0),vertices.get(1));
        vertices.get(0).addEdge(edges.get(0));
        vertices.get(1).addEdge(edges.get(0));

        edges.add(new Edge());
        edges.get(1).addVertex(vertices.get(1),vertices.get(2));
        vertices.get(1).addEdge(edges.get(1));
        vertices.get(2).addEdge(edges.get(1));

        edges.add(new Edge());
        edges.get(2).addVertex(vertices.get(2),vertices.get(3));
        vertices.get(2).addEdge(edges.get(2));
        vertices.get(3).addEdge(edges.get(2));

        edges.add(new Edge());
        edges.get(3).addVertex(vertices.get(3),vertices.get(0));
        vertices.get(3).addEdge(edges.get(3));
        vertices.get(0).addEdge(edges.get(3));

        /*edges.add(new Edge());
        edges.get(4).addVertex(vertices.get(4),vertices.get(0));
        vertices.get(4).addEdge(edges.get(4));
        vertices.get(0).addEdge(edges.get(4));

        edges.add(new Edge());
        edges.get(5).addVertex(vertices.get(4),vertices.get(1));
        vertices.get(4).addEdge(edges.get(5));
        vertices.get(1).addEdge(edges.get(5));*/

        matrix1.show(vertices, edges);
        matrix2.show(vertices, edges);


    }
}
