import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CommonsMathTest {

    @Test
    public void populationTest() {
        List<Chromosome> popList = new LinkedList<Chromosome>();
        popList.add(new Chromosome(1,"Bill"));
        popList.add(new Chromosome(24,"Jim"));
        popList.add(new Chromosome(25,"Debil"));

        ListPopulation listPopulation = new ListPopulation(popList,popList.size());
    }
}

class ListPopulation{
    private int populationLimit;
    private List<Chromosome> chromosomes;

    public ListPopulation(final List<Chromosome> chromosomes, final int populationLimit){
        this.populationLimit = populationLimit;
        this.chromosomes = new ArrayList<Chromosome>(populationLimit);
        this.chromosomes.addAll(chromosomes);
    }
}

class Chromosome{
    private int count;
    private String name;

    public Chromosome(int count, String name) {
        this.count = count;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Chromosome{" +
                "count=" + count +
                ", name='" + name + '\'' +
                '}';
    }
}
