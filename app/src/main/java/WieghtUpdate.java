import android.content.Intent;
import android.view.View;

import com.daoud.dona.fitnessloseweight.MainPage;
import com.daoud.dona.fitnessloseweight.WiehghtUpdate;

public class WieghtUpdate {
    private double correntWieght, firstWieght, lengh, wightNeeded, daysFosEndingTheDiet, weightYouLost;
    private int startingDate;
    String _id;

    public WieghtUpdate() {

        this._id = _id;
        this.startingDate = startingDate;
        this.correntWieght = correntWieght;
        this.firstWieght = firstWieght;
        this.lengh = lengh;
    }

    public double getWeightYouLost() { // الوزن الذي خسرته
       return firstWieght-correntWieght;
    }

    public double getDaysFosEndingTheDiet() {
        return 30-startingDate;
    }

    public String _id() {
        return _id;
    }

    public double correntWieght() {
        return correntWieght;
    }

    public double firstWieght() {
        return firstWieght;
    }

    public double lengh() {
        return lengh;
    }

    public double wightNeeded() {
        return wightNeeded;
    }

    public double daysFosEndingTheDiet() {
        return daysFosEndingTheDiet;
    }

    public void setCorrentWieght(double correntWieght) {
        this.correntWieght = correntWieght;
    }

    public void setFirstWieght(double firstWieght) {
        this.firstWieght = firstWieght;
    }

    public void setLengh(double lengh) {
        this.lengh = lengh;
    }

    public void setWightNeeded(double wightNeeded) {
        this.wightNeeded = wightNeeded;
    }

    public void setDaysFosEndingTheDiet(double daysFosEndingTheDiet) {
        this.daysFosEndingTheDiet = daysFosEndingTheDiet;
    }

    public void setWeightYouLost(double weightYouLost) {
        this.weightYouLost = weightYouLost;
    }

    public void setStartingDate(int startingDate) {
        this.startingDate = startingDate;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public double weightYouLost() {
        return weightYouLost;
    }

    public int startingDate() {
        return startingDate;
    }

    public String toString() {
        return (this._id + "id:" + this.correntWieght + " corrent Wieght" + this.firstWieght + "first Wieght" + this.lengh + "lenght" + this.wightNeeded + "weight needed" + this.daysFosEndingTheDiet + "days for ending the diet" + this.weightYouLost + "weight you lost" + this.startingDate + "starting date");
    }


    public static double culculate(double y, double x , double correntWieght , double wightNeeded , double lenght) {
        y = lenght * lenght;
        x = correntWieght / y;
        wightNeeded = y * 25; // الوزن اللازم
        return wightNeeded;


    }

    }
    


