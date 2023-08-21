package peaksoft.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import peaksoft.services.DepartmentServices;

@Controller                 // BEAN TYZOT
@RequestMapping("/departments")  // PUT UKAZYBAET CCYLKA TYZYP BERET
@RequiredArgsConstructor

public class DepatmentController {
    private  DepartmentServices departmentServices;
    public String getAllHospitals(Model model) {
        model.addAttribute("allHospitals", departmentServices.getAllHospitals());
        return "hospitals/getAlll";

    }
}
