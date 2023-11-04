package Competitive.Advanced;

import java.util.Vector;

public class Trees {

    public static void main(String[] args) {
        int N = 7, Root = 1;

        // Adjacency list to store the tree
        Vector<Vector<Integer> > adj
                = new Vector<Vector<Integer> >();
        for (int i = 0; i < N + 1; i++) {
            adj.add(new Vector<Integer>());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(1).add(3);
        adj.get(3).add(1);

        adj.get(1).add(4);
        adj.get(4).add(1);

        adj.get(2).add(5);
        adj.get(5).add(2);

        adj.get(2).add(6);
        adj.get(6).add(2);

        adj.get(4).add(7);
        adj.get(7).add(4);

        System.out.println(adj);
    }
}
