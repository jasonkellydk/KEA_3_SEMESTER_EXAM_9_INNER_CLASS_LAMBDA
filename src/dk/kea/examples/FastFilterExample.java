package dk.kea.examples;

import dk.kea.ExampleInterface;
import dk.kea.examples.logic.Filter;

public class FastFilterExample implements ExampleInterface
{
    @Override
    public String getDescription()
    {
        return "This example will show an fast implementation of iterator";
    }

    @Override
    public String getName()
    {
        return "fast filter";
    }

    @Override
    public void runExample()
    {
        long start = 0;
        long stop = 0;
        long elapsed = 0;

        Filter filter = new Filter();

        start = System.nanoTime();

        filter.fastFilter("b");

        stop = System.nanoTime();

        elapsed = stop - start;

        System.out.println("Runtime: " + elapsed);
    }
}
