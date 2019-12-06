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
        int[] after=gene.evolution(gene.getGene());

        for(int i=0;i<gene.getGene().length;i++){
            if(after[i]==gene.getGene()[i]){
                flag=true;
                break;
            }
        }
        assertTrue(flag);

    }
}
