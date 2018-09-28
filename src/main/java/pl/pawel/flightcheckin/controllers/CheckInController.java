package pl.pawel.flightcheckin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CheckInController {

    @RequestMapping("/showStartCheckIn")
    public String showStartCheckin() {
        return "startCheckIn";
    }
}
