package dk.kea.examples.logic;

class Node
{
    private String Country;

    private String city;

    private int latitude;

    private int longitude;

    Node leftChild;
    Node rightChild;

    /**
     * Constructor
     * @param city
     * @param country
     * @param latitude
     * @param longitude
     */
    public Node(String city, String country, int latitude, int longitude)
    {
        this.city = city;
        this.Country = country;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getCountry()
    {
        return Country;
    }

    public void setCountry(String country)
    {
        Country = country;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public int getLatitude()
    {
        return latitude;
    }

    public void setLatitude(int latitude)
    {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude)
    {
        this.longitude = longitude;
    }
}
