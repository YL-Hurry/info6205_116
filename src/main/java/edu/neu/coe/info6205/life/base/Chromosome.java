package edu.neu.coe.info6205.life.base;

import java.util.Arrays;

public class Chromosome {
    int[] gene_x;
    int[] gene_y;
    public Chromosome(int[] x,int[] y){
        this.gene_x = x.clone();
        this.gene_y = y.clone();
    }
    public String getChromesome(){
        String[] s=new String[this.gene_x.length];
        for(int i=0;i<this.gene_x.length;i++){
            int x =this.gene_x[i];
            int y =this.gene_y[i];
            s[i]=x+" "+y;
        }
        return Arrays.toString(s).substring(1, Arrays.toString(s).length() - 1);
    }
    
    public Object clone() throws CloneNotSupportedException {
        Chromosome c=null;
        c =(Chromosome) super.clone();
        c.gene_x=gene_x.clone();
        c.gene_y=gene_y.clone();
        return c;
    }
}
