package ru.netology.javaqa;

public class Radio {
    private int maxNumberStation = 10;
    private int minNumberStation = 0;
    private int numberStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int volume;

    public Radio(){


    }
    public int getMaxNumberStation() {
        return maxNumberStation - 1;
    }

    public int getMinNumberStation() {
        return minNumberStation;
    }

    public int getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int numberStation) {
        if (numberStation < minNumberStation) {
            return;
        }
        if (numberStation > maxNumberStation - 1) {
            return;
        }
        this.numberStation = numberStation;
    }

    public void next() {
        if (numberStation == maxNumberStation - 1) {
            numberStation = minNumberStation;
        } else {
            numberStation++;
        }
    }

    public void prev() {
        if (numberStation == minNumberStation) {
            numberStation = maxNumberStation - 1;
        } else {
            numberStation--;
        }
    }

    public int getVolume() {
        return volume;
    }

    public int getMaxVolume(){
        return maxVolume;
    }
    public int getMinVolume(){
        return minVolume;
    }

    public void setVolume(int volume) {
        if (volume <= minVolume) {
            volume = 0;
        }
        if (volume >= maxVolume) {
            volume = 100;
        }
        this.volume = volume;
    }
    public void plusVolume() {
        if (volume < maxVolume) {
            volume++;
        }
    }

    public void minusVolume() {
        if (volume > minVolume) {
            volume--;
        }
    }

}