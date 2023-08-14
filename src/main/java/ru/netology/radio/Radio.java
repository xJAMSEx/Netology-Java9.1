package ru.netology.radio;

public class Radio {

    private int maxNumberRadioStation = 9;
    private int minNumberRadioStation = 0;
    private int countRadioStation = 10;
    private int currentNumberRadioStation = minNumberRadioStation;
    private int maxRadioVolume = 100;
    private int minRadioVolume = 0;
    private int currentRadioVolume;

    public Radio(int number) {
        maxNumberRadioStation = minNumberRadioStation + number - 1;
        countRadioStation = number;
    }

    public Radio() {
        this.minNumberRadioStation = minNumberRadioStation;
        this.maxNumberRadioStation = maxNumberRadioStation;
        this.currentNumberRadioStation = minNumberRadioStation;
        this.countRadioStation = countRadioStation;
    }

    public int getCurrentNumberRadioStation() {

        return currentNumberRadioStation;
    }

    public int getCountRadioStation() {
        return countRadioStation;
    }

    public int getMaxNumberRadioStation() {
        return maxNumberRadioStation;
    }

    public int getMinNumberRadioStation() {
        return minNumberRadioStation;
    }

    public int getMaxRadioVolume() {
        return maxRadioVolume;
    }

    public int getMinRadioVolume() {
        return minRadioVolume;
    }

    public void setCurrentNumberRadioStation(int newCurrentNumberRadioStation) {
        if (newCurrentNumberRadioStation < minNumberRadioStation) {
            return;
        }
        if (newCurrentNumberRadioStation > maxNumberRadioStation) {
            return;
        }
        currentNumberRadioStation = newCurrentNumberRadioStation;
    }

    public void setNextCurrentNumberRadioStation() {
        if (currentNumberRadioStation < maxNumberRadioStation) {
            currentNumberRadioStation = currentNumberRadioStation + 1;
        } else {
            currentNumberRadioStation = maxNumberRadioStation;
        }
    }

    public void setPrevCurrentNumberRadioStation() {
        if (currentNumberRadioStation > minNumberRadioStation) {
            currentNumberRadioStation = currentNumberRadioStation - 1;
        } else {
            currentNumberRadioStation = maxNumberRadioStation;
        }
    }

    public int getCurrentRadioVolume() {
        return currentRadioVolume;
    }

    public void setCurrentRadioVolume(int newCurrentRadioVolume) {
        if (newCurrentRadioVolume > maxRadioVolume) {
            return;
        }
        if (newCurrentRadioVolume < minRadioVolume) {
            return;
        }
        currentRadioVolume = newCurrentRadioVolume;
    }

    public void setUpCurrentRadioVolume() {
        if (currentRadioVolume < maxRadioVolume) {
            currentRadioVolume = currentRadioVolume + 1;
        } else {
            currentRadioVolume = maxRadioVolume;
        }
    }

    public void setDownCurrentRadioVolume() {
        if (currentRadioVolume > minRadioVolume) {
            currentRadioVolume = currentRadioVolume - 1;
        } else {
            currentRadioVolume = minRadioVolume;
        }
    }
}



