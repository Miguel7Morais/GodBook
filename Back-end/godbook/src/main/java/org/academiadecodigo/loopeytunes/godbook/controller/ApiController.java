package org.academiadecodigo.loopeytunes.godbook.controller;

import org.academiadecodigo.loopeytunes.godbook.persistence.model.Givers;
import org.academiadecodigo.loopeytunes.godbook.service.GiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class ApiController {

    private final GiverService giverService;


    @Autowired
    public ApiController(GiverService giverService) {
        this.giverService = giverService;
    }

    @CrossOrigin
    @GetMapping
    public List<Givers> getGivers() {
        return giverService.getGivers();
    }

    @CrossOrigin
    @GetMapping(path = "/{id}")
    public Givers getGiver(@PathVariable Integer id) {
        Givers giver = giverService.getGiver(id);
        System.out.println(giver.getAge());
        System.out.println(giver);
        System.out.println("********************+" + giver.getId());
        return giver;
    }

    @CrossOrigin
    @PostMapping
    public void addGiver(@RequestBody Givers giver) {
        giverService.addGiver(giver);
    }

    @CrossOrigin
    @DeleteMapping(path = "/{id}")
    public void deleteGiver(@PathVariable Integer id) {
        giverService.deleteGiver(id);
    }

    @CrossOrigin
    @PutMapping(path = "/{id}")
    public void updateGiver(@RequestBody Givers giver, @PathVariable Integer id) {
        giver.setId(id);
        giverService.updateGiver(giver);
    }


}
