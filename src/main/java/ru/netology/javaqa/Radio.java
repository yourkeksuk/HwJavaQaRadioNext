package ru.netology.javaqa;

public class Radio {

    private int numberStation;
    private int volume;

    public int getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int numberStation) {
        if (numberStation < 0) {
            return;
        }
        if (numberStation > 9) {
            return;
        }
        this.numberStation = numberStation;
    }

    public void next() {
        if (numberStation == 9) {
            numberStation = 0;
        } else {
            numberStation++;
        }
    }

    public void prev() {
        if (numberStation == 0) {
            numberStation = 9;
        } else {
            numberStation--;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume <= 0) {
            volume = 0;
        }
        if (volume >= 10) {
            volume = 10;
        }
        this.volume = volume;
    }
    public void plusVolume() {
        if (volume < 10) {
            volume++;
        }
    }

    public void minusVolume() {
        if (volume > 0) {
            volume--;
        }
    }

}