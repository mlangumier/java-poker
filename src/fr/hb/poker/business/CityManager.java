package fr.hb.poker.business;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CityManager {
    private List<List<String>> records;
    private List<City> cities;

    /**
     * Constructor
     */
    public CityManager() {
        this.records = new ArrayList<>();
        this.cities = new ArrayList<>();

        readCSVFile("cities.csv");
        createCitiesFromCSVArray();
    }

    public List<List<String>> getRecords() {
        return records;
    }

    public void setRecords(List<List<String>> records) {
        this.records = records;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    /**
     * Reads a CSV file
     *
     * @param fileName Name of the file to read
     */
    public void readCSVFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                records.add(Arrays.asList(values));
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Error reading file: " + e.getMessage());
        }
    }

    public void createCitiesFromCSVArray() {
        String[] columns = records.getFirst().toArray(new String[0]);
        HashMap<String, Integer> columnNamesAndId = new HashMap<>();

        for (int i = 0; i < columns.length; i++) {
            columnNamesAndId.put(columns[i], i);
        }

        for (int i = 1; i < records.size(); i++) {
            String[] line = records.get(i).toArray(new String[0]);

            String name = line[columnNamesAndId.get("nom_commune_postal")];
            String postCode = line[columnNamesAndId.get("code_postal")];
            Double latitude = !line[columnNamesAndId.get("latitude")].isEmpty() ? Double.parseDouble(line[columnNamesAndId.get("latitude")]) : null;
            Double longitude = !line[columnNamesAndId.get("longitude")].isEmpty() ? Double.parseDouble(line[columnNamesAndId.get("longitude")]) : null;

            if (latitude == null || longitude == null) {
                cities.add(new City(name, postCode));
            } else {
                cities.add(new City(name, postCode, latitude, longitude));
            }
        }
    }

    @Override
    public String toString() {
        return "FileManager{" +
                "records=" + records +
                '}';
    }
}
