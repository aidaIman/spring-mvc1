package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.ServiceCarDAO;

@Controller
@RequestMapping(value = "/cars")
public class CarController {

    private ServiceCarDAO serviceCarDAO;

    public CarController(ServiceCarDAO serviceCarDAO) {
        this.serviceCarDAO = serviceCarDAO;
    }

    @GetMapping
    public String printTable(@RequestParam(value = "count", defaultValue = "5") int count,
                             ModelMap model) {

        model.addAttribute("cars", serviceCarDAO.getCarsWithCount(count));

        return "cars";
    }
}
