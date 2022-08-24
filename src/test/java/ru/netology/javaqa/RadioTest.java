package ru.netology.javaqa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class RadioTest {

    @Test
    public void setMoreNumberStation(){
        ru.netology.javaqa.Radio radio = new ru.netology.javaqa.Radio();
        radio.setNumberStation(10);

        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setLessNumberStation(){
        ru.netology.javaqa.Radio radio = new ru.netology.javaqa.Radio();
        radio.setNumberStation(-1);

        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextTestNine(){
        ru.netology.javaqa.Radio radio = new ru.netology.javaqa.Radio();
        radio.setNumberStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextTestZero(){
        ru.netology.javaqa.Radio radio = new ru.netology.javaqa.Radio();
        radio.setNumberStation(0);
        radio.next();

        int expected = 1;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevTestZero() {
        ru.netology.javaqa.Radio radio = new ru.netology.javaqa.Radio();
        radio.setNumberStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevTestNine() {
        ru.netology.javaqa.Radio radio = new ru.netology.javaqa.Radio();
        radio.setNumberStation(9);
        radio.prev();

        int expected = 8;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeMore(){
        ru.netology.javaqa.Radio radio = new ru.netology.javaqa.Radio();
        radio.setVolume(11);

        int expected = 10;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeLess(){
        ru.netology.javaqa.Radio radio = new ru.netology.javaqa.Radio();
        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void plusVolumeMax(){
        ru.netology.javaqa.Radio radio = new ru.netology.javaqa.Radio();
        radio.setVolume(10);
        radio.plusVolume();

        int expected = 10;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void plusVolumeMin(){
        ru.netology.javaqa.Radio radio = new ru.netology.javaqa.Radio();
        radio.setVolume(0);
        radio.plusVolume();

        int expected = 1;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minusVolumeMax(){
        ru.netology.javaqa.Radio radio = new ru.netology.javaqa.Radio();
        radio.setVolume(10);
        radio.minusVolume();

        int expected = 9;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minusVolumeMin(){
        ru.netology.javaqa.Radio radio = new ru.netology.javaqa.Radio();
        radio.setVolume(0);
        radio.minusVolume();

        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

}
