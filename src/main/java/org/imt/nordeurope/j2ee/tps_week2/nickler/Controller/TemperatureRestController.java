package org.imt.nordeurope.j2ee.tps_week2.nickler.Controller;

import org.imt.nordeurope.j2ee.tps_week2.nickler.Model.TemperatureByCountry;
import org.imt.nordeurope.j2ee.tps_week2.nickler.Model.TemperatureForm;
import org.imt.nordeurope.j2ee.tps_week2.nickler.Service.ITemperatureRestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;


@Controller
public class TemperatureRestController {

    @Inject
    ITemperatureRestService service;

    @GetMapping(value = {"/"})
    public String index(Model model) {
        model.addAttribute("temperatureForm", new TemperatureForm());
        return "index";
    }

    @GetMapping(value = {"/temperature"})
    public String getAll(Model model) {
        model.addAttribute("countries", service.getAll());
        return "temperature";
    }

    @PostMapping(value = {"/temperature/search"})
    public String getCountryForm(Model model, @ModelAttribute("temperatureForm") TemperatureForm temperatureForm) {
        return "redirect:/temperature/" + temperatureForm.getCountry();
    }

    @GetMapping(value = "/temperature/{country}")
    public String getCountryTemperature(Model model, @PathVariable(value = "country") String country ) {
        model.addAttribute("temperatureCountry", service.getTemperatureOfCountry(country));
        return "temperatureCountry";
    }
}
