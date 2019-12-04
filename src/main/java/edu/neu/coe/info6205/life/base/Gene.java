package edu.neu.coe.info6205.life.base;

public class Gene {
    //get the first generation gene
    public int[] getRandomGene() {
        int[] genes = new int[8];
        for (int i = 0; i < genes.length; i++) {
            int g = (int) (Math.random() * 40) - 20;
            genes[i] = g;
        }
        return genes;
    }

    //进化
    public int[] evolution(int[] g) {

        int i = (int) Math.random() * (g.length + 1);
        if (g[i] > 0) {
            g[i] -= ((int) Math.random() * 10 + 1);
        } else if (g[i] < 0) {
            g[i] += ((int) Math.random() * 10 + 1);
        }

        if (Math.random() < 0.05) {
            g = motate(g);
        }

        return g;
    }

    //突变
    public int[] motate(int[] g) {
        int i = (int) Math.random() * (g.length + 1);
        g[i] = (int) (Math.random() * 40) - 20;
        return g;
    }
}
