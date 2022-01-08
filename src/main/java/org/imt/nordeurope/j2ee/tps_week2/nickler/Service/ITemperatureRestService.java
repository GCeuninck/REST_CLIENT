package org.imt.nordeurope.j2ee.tps_week2.nickler.Service;

import org.imt.nordeurope.j2ee.tps_week2.nickler.Model.Countries;
import org.imt.nordeurope.j2ee.tps_week2.nickler.Model.TemperatureByCountry;

public interface ITemperatureRestService {
    Countries getAll();
    TemperatureByCountry getTemperatureOfCountry(String country);
}
