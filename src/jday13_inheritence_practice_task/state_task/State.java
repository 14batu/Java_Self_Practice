package jday13_inheritence_practice_task.state_task;

import java.awt.desktop.SystemEventListener;

public class State {
    private String name;
    private String abbreviation;
    private String politicalParty;
    private String senator;
    private int population;

    public State(String name, String abbreviation, String politicalParty, String senator, int population) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setSenator(senator);
        setPopulation(population);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank() || name.isEmpty() || name == null){
            System.err.println("Name cannot be null, empty or blank");
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if (abbreviation.isBlank() || abbreviation.isEmpty() || abbreviation == null){
            System.err.println("Abb cannot be null, empty or blank");
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty.isBlank() || politicalParty.isEmpty() || politicalParty == null){
            System.err.println("Political Party cannot be null, empty or blank");
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if (senator.isBlank() || senator.isEmpty() || senator == null){
            System.err.println("Senator cannot be null, empty or blank");
            System.exit(1);
        }
        this.senator = senator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if (population <= 0 ){
            System.err.println("Population cannot be less than 0");
            System.exit(1);
        }
        this.population = population;
    }


    public String toString() {
        return  getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                '}';
    }
}
