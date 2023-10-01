package med.voll.api.controller;

import med.voll.api.doctor.Doctor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @PostMapping("/create")
    public String createDoctor(@RequestBody Doctor doctor){
        return doctor.toString();
    }
}
