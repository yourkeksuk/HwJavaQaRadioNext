package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void setMoreNumberStation() {
        Radio radio = new Radio();
        radio.setNumberStation(10);

        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setLessNumberStation() {
        Radio radio = new Radio();
        radio.setNumberStation(-1);

        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextTestNine() {
        Radio radio = new Radio();
        radio.setNumberStation(radio.getMaxNumberStation());
        radio.next();

        int expected = radio.getMinNumberStation();
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextTestZero() {
        Radio radio = new Radio();
        radio.setNumberStation(radio.getMinNumberStation());
        radio.next();

        int expected = 1;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevTestZero() {
        Radio radio = new Radio();
        radio.setNumberStation(radio.getMinNumberStation());
        radio.prev();

        int expected = radio.getMaxNumberStation();
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevTestNine() {
        Radio radio = new Radio();
        radio.setNumberStation(radio.getMaxNumberStation());
        radio.prev();

        int expected = 8;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeMore() {
        Radio radio = new Radio();
        radio.setVolume(111);

        int expected = radio.getMaxVolume();
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeLess() {
        Radio radio = new Radio();
        radio.setVolume(-1);

        int expected = radio.getMinVolume();
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void plusVolumeMax() {
        Radio radio = new Radio();
        radio.setVolume(101);
        radio.plusVolume();

        int expected = radio.getMaxVolume();
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void plusVolumeMin() {
        Radio radio = new Radio();
        radio.setVolume(radio.getMinVolume());
        radio.plusVolume();

        int expected = 1;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minusVolumeMax() {
        Radio radio = new Radio();
        radio.setVolume(radio.getMaxVolume());
        radio.minusVolume();

        int expected = 99;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minusVolumeMin() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        radio.minusVolume();

        int expected = radio.getMinVolume();
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

}
