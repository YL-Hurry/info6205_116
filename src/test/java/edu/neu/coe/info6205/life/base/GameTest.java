package edu.neu.coe.info6205.life.base;

import edu.neu.coe.info6205.life.library.Library;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

		@Test
		public void testRunBlip() {
				String patternName = "Blip";
				System.out.println("Game of Life with starting pattern: " + patternName);
				final String pattern = Library.get(patternName);
				final Game.Behavior generations = Game.run(0L, pattern);
				assertEquals(0, generations.generation);
		}

		@Test
		public void testRunBlinker() {
				String patternName = "Blinker";
				System.out.println("Game of Life with starting pattern: " + patternName);
				final String pattern = Library.get(patternName);
				final Game.Behavior generations = Game.run(0L, pattern);
				assertEquals(new Game.Behavior(4, 0, 1), generations);
		}

		@Test
		public void generation() {
				// TODO implement test
		}

		@Test
		public void testFitness(){
			int[] x={1,1,2,2};
			int[] y={1,2,2,1};
			//create one chromosome, fitness = 2
			Chromosome chromosome= new Chromosome(x,y);
			Game game=new Game();
			assertEquals(2,game.fitness(chromosome));
		}

		@Test
		public void testSelect(){
			int[] x1={1,1,2,2};
			int[] y1={1,2,2,1};
			int[] x2={1,4,4,8};
			int[] y2={1,-2,-2,-1};
			int[] x3={1,3,2,2,5,6};
			int[] y3={1,3,2,1,4,3};
			// create 3 chromosomes
			Chromosome[] c= new Chromosome[3];
			c[0]=new Chromosome(x1,y1);
			c[1]=new Chromosome(x2,y2);
			c[2]=new Chromosome(x3,y3);
			Game game=new Game();
			//the best is c2
			assertEquals(c[2],game.select(c));
		}
}
