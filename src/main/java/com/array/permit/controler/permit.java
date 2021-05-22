package com.array.permit.controler;

import com.array.permit.Entity.arraysEntities.Arrays;
import com.array.permit.Repository.ArraysRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class permit {
    @Autowired
    ArraysRepository arraysRepository ;

    @PostMapping(path="/save")
    int save(@RequestBody Arrays arrays){


        arraysRepository.save(arrays);
         return 1;
    }
    @GetMapping(path = "getForm/{id}")
  Optional<Arrays> getForm(@PathVariable("id") Long id){
        System.out.println(id);
        return  arraysRepository.findById(id);
    }


}
