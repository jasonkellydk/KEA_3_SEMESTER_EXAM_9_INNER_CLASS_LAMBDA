package dk.kea.examples;

import dk.kea.ExampleInterface;
import dk.kea.examples.logic.Filter;
import dk.kea.examples.logic.Stream;

public class StreamExample implements ExampleInterface
{
    @Override
    public String getDescription()
    {
        return "This example will demonstrate streams";
    }

    @Override
    public String getName()
    {
        return "Stream";
    }

    @Override
    public void runExample()
    {
        long start = 0;
        long stop = 0;
        long elapsed = 0;

        Stream stream = new Stream();

        start = System.nanoTime();

        stream.stream("b");

        stop = System.nanoTime();

        elapsed = stop - start;

        System.out.println("Runtime: " + elapsed);
    }
}
