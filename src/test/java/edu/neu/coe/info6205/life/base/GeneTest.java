package edu.neu.coe.info6205.life.base;
import org.junit.Test;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneTest {

    @Test
    public void testGene(){
        int[] x={1,1,2,2};
        Gene gene=new Gene(x);
        assertEquals(x[0],gene.getGene()[0]);
        assertEquals(x[1],gene.getGene()[1]);
        assertEquals(x[2],gene.getGene()[2]);
        assertEquals(x[3],gene.getGene()[3]);
    }

    @Test
    public void testEvolution(){
        int[] x={1,1,2,2};
        Gene gene=new Gene(x);
        boolean flag = false;
        int[] after = new int[gene.getGene().length];
        for(int a=0;a<gene.getGene().length;a++){
            after[a]=gene.getGene()[a];
        }
        //evolute gene
        after=gene.evolution(after);
        //compare, if after evolution, gene change return true
        for(int i=0;i<gene.getGene().length;i++){
            if(after[i]!=x[i]){
                flag=true;
                break;
            }
        }
        //print 2 genes
        for(int j:gene.getGene()){System.out.print(j);}
        System.out.println("");
        for(int k:after){System.out.print(k);}

        assertTrue(flag);
    }

    @Test
    public void textMutation(){
        int[] x={1,1,2,2};
        Gene gene=new Gene(x);
        boolean flag = false;
        int[] after = new int[gene.getGene().length];
        for(int a=0;a<gene.getGene().length;a++){
            after[a]=gene.getGene()[a];
        }
        //evolute gene
        after=gene.mutate(after);
        //compare, if after evolution, gene change return true
        for(int i=0;i<gene.getGene().length;i++){
            if(after[i]!=x[i]){
                flag=true;
                break;
            }
        }
        for(int j:gene.getGene()){System.out.print(j);}

        System.out.println("");
        for(int k:after){System.out.print(k);}

        assertTrue(flag);
    }
}
