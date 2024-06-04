package com.BIT_PROJECTS.Controller;

import com.BIT_PROJECTS.DTO.IntegerSetDTO;
import com.BIT_PROJECTS.DTO.Mensaje;
import com.BIT_PROJECTS.Entity.IntegerSet;
import com.BIT_PROJECTS.Service.IintegerSetService;
import com.BIT_PROJECTS.Service.Implementation.IntegerSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("project4")
public class Project_4_Controller {
    @Autowired
    IntegerSetService integerSetService;



    @PostMapping(path = "/unionInteger", produces = MediaType.APPLICATION_JSON_VALUE)
    public IntegerSet unionInteger(@RequestBody IntegerSetDTO dto) {
        return integerSetService.unionIntegerSet(dto.getOtherSet1(),dto.getOtherSet2());
    }

    @PostMapping(path = "/intersectionIntegerSet", produces = MediaType.APPLICATION_JSON_VALUE)
    public IntegerSet intersectionIntegerSet(@RequestBody IntegerSetDTO dto) {
        return integerSetService.intersectionIntegerSet(dto.getOtherSet1(),dto.getOtherSet2());
    }

    @PostMapping(path = "/insertElement", produces = MediaType.APPLICATION_JSON_VALUE)
    public void insertElement(@RequestParam("k") int k) {
         integerSetService.insertElement(k);
    }

    @PostMapping(path = "/deleteElement", produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteElement(@RequestParam("m") int m) {
        integerSetService.deleteElement(m);
    }

    @PostMapping(path = "/equalTo", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mensaje equalTo(@RequestBody IntegerSetDTO dto) {
        return integerSetService.equalTo(dto.getOtherSet1(),dto.getOtherSet2());
    }
}
