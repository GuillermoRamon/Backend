package com.example.BS9.person.application.port;

import com.example.BS9.profesor.infraestructure.controller.dto.output.ProfesorOuputDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "simpleFeign",url = "localhost:8081")
public interface IFeignServer {
    @GetMapping("/profesor/{id}")
    ResponseEntity<ProfesorOuputDTO> callProfesor(@PathVariable int id);
}
