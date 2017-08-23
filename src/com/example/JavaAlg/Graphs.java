package com.example.JavaAlg;

import java.util.*;

/**
 * Created by svishnu on 7/20/17.
 */
public class Graphs {

    private int V;   // No. of vertices
    private LinkedList<Integer> adj[]; //Adjacency Lists
    int s;
    boolean visited[] = new boolean[V];

    Graphs(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int v,int w)
    {
        adj[v].add(w);
    }


    private void breadthFirstTraversal(int startIndex) {
        if (adj.length == 0) {
            System.out.println("Please have data inside");
            return;
        }
        boolean visited[] = new boolean[V];

        Queue<Integer> queue = new LinkedList<Integer>();
         if(queue.size() ==0){
             queue.add(startIndex);
             visited[startIndex] = true;
         }

         while(queue.size() > 0){
             s = queue.poll();
             System.out.print(s +" ");
             for(int i=0; i< adj[s].size();i++){
              if(adj[s].get(i) != null){
                  if(!visited[adj[s].get(i)]){
                      visited[adj[s].get(i)] = true;
                      queue.add(adj[s].get(i));
                  }
              }


             }
         }

    }

private void depthFirstTraversal(boolean flag) {
    if(flag) {
        boolean[] visitor = new boolean[V];
        for (int i = 0; i < V; i++) {
            depthFirstTraversal(i, visitor);
        }
    }else {
        boolean[] isCyclic = new boolean[V];

        for (int j = 0; j < V; j++) {
           cyclicGraphsDFS(j, isCyclic);
        }
    }
}

    private void cyclicGraphsDFS(int v, boolean[] isCyclic) {
        for(int i=0;i < adj[v].size();i++){
            if(!isCyclic[adj[v].get(i)]){
                isCyclic[adj[v].get(i)] = true;

                cyclicGraphsDFS(adj[v].get(i),isCyclic);
            }else if(isCyclic[adj[v].get(i)]){
                System.out.println("Found Cyclic "+ adj[v]);
                break;
            }
        }
    }

    private void depthFirstTraversal(int v,boolean[] visitor) {

         for(int i=0;i < adj[v].size();i++){
             if(!visitor[adj[v].get(i)]){
                 visitor[adj[v].get(i)] = true;
                 System.out.print(adj[v].get(i) + " ");
                 depthFirstTraversal(adj[v].get(i),visitor);
               }
         }
     }





    public static void main(String[] args){
        Graphs g = new Graphs(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
        System.out.println(" Breadth First Search using Queue");
        g.breadthFirstTraversal(4);
        System.out.println(" ");
        System.out.println(" Depth First Search Using Stack");
        g.depthFirstTraversal(true);
        System.out.println(" ");
        System.out.println(" Cyclic Depth First Search Using Stack");
        //g.depthFirstTraversal(false);
    }
}
