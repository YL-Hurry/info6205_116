package edu.neu.coe.info6205.life.base;

public class Gene {
    private int[] gene;

    public Gene(int[] gene){
        this.gene = gene;
    }

    public Gene(){}

    public int[] getGene(){
        return this.gene;
    }

    //get the first generation gene
    public int[] getRandomGene() {
        //length represents the length of gene
        int length = 10;
        int[] genes = new int[length];
        for (int i = 0; i < genes.length; i++) {
            int g = (int) (Math.random() * 40) - 20;
            genes[i] = g;
        }
        return genes;
    }

    //evolution the best gene, and produce the child gene
    public int[] evolution(int[] g) {

        int i = (int) Math.random() * (g.length);
        if (g[i] > 0) {
            g[i] -= ((int) Math.random() * 10 + 1);
        } else if (g[i] < 0) {
            g[i] += ((int) Math.random() * 10 + 1);
        }

        // set the mutation
        double mutateProbility = 0.05+Math.random()*0.05;
        if (Math.random() < mutateProbility) {
            g = mutate(g);
        }

        return g;
    }

    //mutation
    public int[] mutate(int[] g) {
        int i = (int) Math.random() * (g.length);
        g[i] += (int) (Math.random() * 20) - 10;
        return g;
    }
}
