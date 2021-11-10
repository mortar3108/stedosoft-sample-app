package edu.gosho.samplespringapp;

public class StaticVariables {
    public int regionsCount = 100;
    public int usersCount = 100;
    public int measuresCount = 100;
    public int contractorsCount = 100;
    public int artikulsCount = 100;

    /*public StaticVariables(int usersCount, int measuresCount, int contractorsCount, int artikulsCount) {
        this.usersCount = usersCount;
        this.measuresCount = measuresCount;
        this.contractorsCount = contractorsCount;
        this.artikulsCount = artikulsCount;
    }*/

    public StaticVariables() {

    }

    public int getUsersCount() {
        return usersCount;
    }

    public void setUsersCount(int usersCount) {
        this.usersCount = usersCount;
    }

    public int getMeasuresCount() {
        return measuresCount;
    }

    public void setMeasuresCount(int measuresCount) {
        this.measuresCount = measuresCount;
    }

    public int getContractorsCount() {
        return contractorsCount;
    }

    public void setContractorsCount(int contractorsCount) {
        this.contractorsCount = contractorsCount;
    }

    public int getArtikulsCount() {
        return artikulsCount;
    }

    public void setArtikulsCount(int artikulsCount) {
        this.artikulsCount = artikulsCount;
    }

    public int getRegionsCount() {
        return regionsCount;
    }

    public void setRegionsCount(int regionsCount) {
        this.regionsCount = regionsCount;
    }
}
