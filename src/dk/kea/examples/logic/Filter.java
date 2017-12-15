package dk.kea.examples.logic;

import java.util.List;

public class Filter
{
    /**
     * Slow implementation
     * @param firstLetter
     */
    public void slowFilter(String firstLetter)
    {
        CSVReader csvReader = new CSVReader();
        String filterLetter = firstLetter.toUpperCase();

        List<Node> list = csvReader.nodeArrayList();

        for (int i = 0; i < list.size(); i++) {
            String Letter = String.valueOf(list.get(i).getCity().charAt(0));
            if (Letter.equals(filterLetter)) {}
        }
    }

    /**
     * Fast implementation
     * @param firstLetter
     */
    public void fastFilter(String firstLetter)
    {
        CSVReader csvReader = new CSVReader();
        String filterLetter = firstLetter.toUpperCase();

        List<Node> list = csvReader.nodeArrayList();

        int arrayListSize = list.size();

        for (int i = 0; i < arrayListSize; i++) {
            String Letter = String.valueOf(list.get(i).getCity().charAt(0));

            if (Letter.equals(filterLetter)) {}
        }

    }
}
