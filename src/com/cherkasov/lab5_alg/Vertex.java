package com.cherkasov.lab5_alg;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private List<Edge> incident_to = new ArrayList<>();
    private List<Vertex> neighbors = new ArrayList<>();
    private int label;
    public void setLabel(int label){
        this.label = label;
    }
    public int getLabel(){
        return label;
    }
    public void addEdge(Edge edge){
        incident_to.add(edge);
    }
    public List getEdges(){
        return incident_to;
    }
    public void addNeighbor(Vertex vertex){
        neighbors.add(vertex);
    }
    public List getNeigbors(){
        return neighbors;
    }
}
