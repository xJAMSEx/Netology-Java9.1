package ru.netology.radio;

public class Radio {

    private int CurrentNumberRadioStation;
    private int MaxNumberRadioStation = 9;
    private int MinNumberRadioStation = 0;
    private int CurrentRadioVolume;
    private int MaxRadioVolume = 100;
    private int MinRadioVolume = 0;

    public int getCurrentNumberRadioStation() {
        return CurrentNumberRadioStation;
    }

    public void setCurrentNumberRadioStation(int newCurrentNumberRadioStation) {
        if (newCurrentNumberRadioStation < MinNumberRadioStation) {
            return;
        }
        if (newCurrentNumberRadioStation > MaxNumberRadioStation) {
            return;
        }
        CurrentNumberRadioStation = newCurrentNumberRadioStation;
    }

    public void setNextCurrentNumberRadioStation() {
        if (CurrentNumberRadioStation < MaxNumberRadioStation) {
            CurrentNumberRadioStation = CurrentNumberRadioStation + 1;
        } else {
            CurrentNumberRadioStation = MaxNumberRadioStation;
        }
    }

    public void setPrevCurrentNumberRadioStation() {
        if (CurrentNumberRadioStation > MinNumberRadioStation) {
            CurrentNumberRadioStation = CurrentNumberRadioStation - 1;
        } else {
            CurrentNumberRadioStation = MaxNumberRadioStation;
        }
    }

    public int getCurrentRadioVolume() {
        return CurrentRadioVolume;
    }

    public void setCurrentRadioVolume(int newCurrentRadioVolume) {
        if (newCurrentRadioVolume > MaxRadioVolume) {
            return;
        }
        if (newCurrentRadioVolume < MinRadioVolume) {
            return;
        }
        CurrentRadioVolume = newCurrentRadioVolume;
    }

    public void setUpCurrentRadioVolume() {
        if (CurrentRadioVolume < MaxRadioVolume) {
            CurrentRadioVolume = CurrentRadioVolume + 1;
        } else {
            CurrentRadioVolume = MaxRadioVolume;
        }
    }

    public void setDownCurrentRadioVolume() {
        if (CurrentRadioVolume > MinRadioVolume) {
            CurrentRadioVolume = CurrentRadioVolume - 1;
        } else {
            CurrentRadioVolume = MinRadioVolume;
        }
    }
}



