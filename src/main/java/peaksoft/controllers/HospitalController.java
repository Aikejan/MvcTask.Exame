package peaksoft.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import peaksoft.models.Hospital;
import peaksoft.services.HospitalServices;



@Controller                 // BEAN TYZOT
@RequiredArgsConstructor
public class HospitalController {

    private final HospitalServices hospitalServices;


    @GetMapping("/allHospital")
    public String getAllHospitals(Model model) {
        model.addAttribute("allHospitals", hospitalServices.getAllHospitals());
        return "/getAllHospital";


    }

    @GetMapping("/create")
    String createHospital(Model model) {
        model.addAttribute("newHospital", new Hospital());
        return "/savePage";
    }
    @PostMapping("/save")
    String saveHospital(@ModelAttribute("newHospital") Hospital hospital) {
        hospitalServices.saveHospital(hospital);
        return "redirect:/allHospital";
    }






}
