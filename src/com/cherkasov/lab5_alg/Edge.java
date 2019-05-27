package com.cherkasov.lab5_alg;

import java.util.ArrayList;
import java.util.List;

public class Edge {
    private List<Vertex> incident_to = new ArrayList<>();
    private int label;
    public void setLabel(int label){
        this.label = label;
    }
    public int getLabel(){
        return label;
    }
    public void addVertex(Vertex vertex1,Vertex vertex2){
        incident_to.add(vertex1);
        incident_to.add(vertex2);
    }
    public List getVertices(){
        return incident_to;
    }
}
