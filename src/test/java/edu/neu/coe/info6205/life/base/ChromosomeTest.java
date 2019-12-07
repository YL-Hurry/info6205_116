package edu.neu.coe.info6205.life.base;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChromosomeTest {

    @Test
    public void testGetChromosome(){
        int[] x={1,1,2,2};
        int[] y={1,2,2,1};
        Chromosome chromosome= new Chromosome(x,y);
        //create a chromosome, build gene
        assertEquals("1 1, 1 2, 2 2, 2 1",chromosome.getChromesome());
    }
}
