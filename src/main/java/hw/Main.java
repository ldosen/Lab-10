package hw;

import java.util.*;
import org.jgrapht.*;
import org.jgrapht.Graph;
import org.jgrapht.alg.color.GreedyColoring;
import org.jgrapht.graph.*;
import org.jgrapht.traverse.BreadthFirstIterator;
import org.jgrapht.traverse.ClosestFirstIterator;
import org.jgrapht.traverse.DepthFirstIterator;
import org.jgrapht.traverse.RandomWalkIterator;


public class Main {

    public static void main(final String[] args) {
        //add country codes for vertices
        final String PL = CountryCodes.PL;
        final String DE = CountryCodes.DE;
        final String RU = CountryCodes.RU;
        final String LT = CountryCodes.LT;
        final String BY = CountryCodes.BY;
        final String CZ = CountryCodes.CZ;
        final String SK = CountryCodes.SK;
        final String UA = CountryCodes.UA;

        //create vertices
        final Graph<String, DefaultEdge> myMap = new SimpleGraph<>(DefaultEdge.class);
        myMap.addVertex(PL);
        myMap.addVertex(DE);
        myMap.addVertex(RU);
        myMap.addVertex(LT);
        myMap.addVertex(BY);
        myMap.addVertex(CZ);
        myMap.addVertex(SK);
        myMap.addVertex(UA);

        //add edges w/ Poland
        myMap.addEdge(PL, DE);
        myMap.addEdge(PL, RU);
        myMap.addEdge(PL, LT);
        myMap.addEdge(PL, BY);
        myMap.addEdge(PL, CZ);
        myMap.addEdge(PL, SK);
        myMap.addEdge(PL, UA);

        //add shared edges
        myMap.addEdge(DE, CZ); //Germany and Czechia
        myMap.addEdge(CZ, SK); //Czechia and Slovakia
        myMap.addEdge(SK, UA); //Slovakia and Ukraine
        myMap.addEdge(UA, BY); //Ukraine and Belarus
        myMap.addEdge(UA, RU); //Ukraine and Russia
        myMap.addEdge(BY, LT); //Belarus and Lithuania
        myMap.addEdge(BY, RU); //Belarus and Russia
        myMap.addEdge(LT, RU); //Lithuania and Russia

        //print the resulting graph
        System.out.println(myMap.toString());

        //traverse the graph (Breadth First Search)
        final Iterator<String> bf = new BreadthFirstIterator<>(myMap, PL);
        while (bf.hasNext()) {
            final String country = bf.next();
            System.out.println(country);
        }
        System.out.println("--------------------");

        final Iterator<String> bf1 = new BreadthFirstIterator<>(myMap, DE);
        while (bf1.hasNext()) {
            final String country = bf1.next();
            System.out.println(country);

        }
        System.out.println("--------------------");

        //Closest First Search
        final Iterator<String> cf = new ClosestFirstIterator<>(myMap, PL);
        while (cf.hasNext()){
            final String country = cf.next();
            System.out.println(country);
        }
        System.out.println("--------------------");

        final Iterator<String> cf1 = new ClosestFirstIterator<>(myMap, DE);
        while (cf1.hasNext()){
            final String country = cf1.next();
            System.out.println(country);
        }
        System.out.println("--------------------");

        //Depth First Search
        final Iterator<String> df = new DepthFirstIterator<>(myMap, PL);
        while (df.hasNext()){
            final String country  = df.next();
            System.out.println(country);
        }
        System.out.println("--------------------");

        final Iterator<String> df1 = new DepthFirstIterator<>(myMap, DE);
        while (df1.hasNext()){
            final String country  = df1.next();
            System.out.println(country);
        }
        System.out.println("--------------------");
        /*
        //Random Walk Search
        final Iterator<String> rw = new RandomWalkIterator<>(myMap, PL);
        while (rw.hasNext()){
            final String country = rw.next();
            System.out.println(country);
        }
        System.out.println("--------------------");
        */
        /*
        final Iterator<String> rw1 = new RandomWalkIterator<>(myMap, DE);
        while (rw1.hasNext()){
            final String country = rw1.next();
            System.out.println(country);
        }
        System.out.println("--------------------");
        */
        //map coloring
        GreedyColoring testMap = new GreedyColoring(myMap);
        System.out.println(testMap.getColoring());
    }
}