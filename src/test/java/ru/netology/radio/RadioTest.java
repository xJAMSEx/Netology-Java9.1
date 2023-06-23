package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldMinCurrentNumberRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldMaxCurrentStationStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldAnyCurrentNumberRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinNotCurrentNumberRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxNotCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextCurrentNumberRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadioStation(2);
        radio.setNextCurrentNumberRadioStation();

        int expected = 3;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextCurrentNumberRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadioStation(9);
        radio.setNextCurrentNumberRadioStation();

        int expected = 9;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevCurrentNumberRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadioStation(8);
        radio.setPrevCurrentNumberRadioStation();

        int expected = 7;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevCurrentNumberRadioStationZero() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadioStation(0);
        radio.setPrevCurrentNumberRadioStation();

        int expected = 9;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinNotCurrentRadioVolume() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxNotCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(101);

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxCurrentRadioVolume() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(100);

        int expected = 100;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinCurrentRadioVolume() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(0);

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAnyCurrentRadioVolume() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(50);

        int expected = 50;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUpCurrentRadioVolume() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(77);
        radio.setUpCurrentRadioVolume();

        int expected = 78;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUpMaxCurrentRadioVolume() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(100);
        radio.setUpCurrentRadioVolume();

        int expected = 100;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownCurrentRadioVolume() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(89);
        radio.setDownCurrentRadioVolume();

        int expected = 88;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownCurrentRadioVolumeZero() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(0);
        radio.setDownCurrentRadioVolume();

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }
}

