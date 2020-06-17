package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CountryController {

    CountryStorage countryStorage;

    public CountryController(CountryStorage countryStorage) {
        this.countryStorage = countryStorage;

    }

    @RequestMapping("country/{countryName}")
    public String showSingleCountry(@PathVariable String countryName, Model model) {
        model.addAttribute("country", countryStorage.getCountryByName(countryName));
        return "country-template";
    }


}
