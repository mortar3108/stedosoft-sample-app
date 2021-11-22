package edu.gosho.samplespringapp.domain.common;

public class StaticVariables {
    public static int regionsCount = 100;
    public static int usersCount = 100;
    public static int measuresCount = 100;
    public static int contractorsCount = 100;
    public static int artikulsCount = 100;
    public static int paketiraneCount = 100;

    public StaticVariables() {

    }

    public static int getPaketiraneCount() {
        return paketiraneCount;
    }

    public static void setPaketiraneCount(int paketiraneCount) {
        StaticVariables.paketiraneCount = paketiraneCount;
    }

    public int getUsersCount() {
        return StaticVariables.usersCount;
    }

    public static void setUsersCount(int usersCount) {
        StaticVariables.usersCount = usersCount;
    }

    public int getMeasuresCount() {
        return measuresCount;
    }

    public static void setMeasuresCount(int measuresCount) {
        StaticVariables.measuresCount = measuresCount;
    }

    public int getContractorsCount() {
        return StaticVariables.contractorsCount;
    }

    public static void setContractorsCount(int contractorsCount) {
        StaticVariables.contractorsCount = contractorsCount;
    }

    public int getArtikulsCount() {
        return StaticVariables.artikulsCount;
    }

    public static void setArtikulsCount(int artikulsCount) {
        StaticVariables.artikulsCount = artikulsCount;
    }

    public int getRegionsCount() {
        return StaticVariables.regionsCount;
    }

    public static void setRegionsCount(int regionsCount) {
        StaticVariables.regionsCount = regionsCount;
    }
}
