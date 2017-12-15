package dk.kea.examples.logic;

import java.util.List;

public class Stream
{
    public void stream(String firstLetter)
    {
        CSVReader csvReader = new CSVReader();

        List<Node> list= csvReader.nodeArrayList();

        String filterLetter = firstLetter.toUpperCase();

        list.stream()
                .filter(t -> t.getCity().startsWith(filterLetter));
    }
}
