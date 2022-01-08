package org.imt.nordeurope.j2ee.tps_week2.nickler.Model;

import java.time.LocalDate;
public class Temperature {
    private Integer temperature;
    private LocalDate date;

    public Temperature() {
    }

    public Temperature(Integer temperature, LocalDate date) {
        this.temperature = temperature;
        this.date = date;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
