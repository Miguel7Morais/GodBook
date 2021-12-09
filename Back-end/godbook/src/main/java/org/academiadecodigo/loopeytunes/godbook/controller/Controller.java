package org.academiadecodigo.loopeytunes.godbook.controller;

import org.academiadecodigo.loopeytunes.godbook.persistence.model.Givers;
import org.academiadecodigo.loopeytunes.godbook.service.GiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class Controller {

    private final GiverService giverService;


    @Autowired
    public Controller(GiverService giverService) {
        this.giverService = giverService;
    }

    @GetMapping
    public List<Givers> getGivers() {
        return giverService.getGivers();
    }

    @GetMapping(path = "/{id}")
    public Givers getGiver(@PathVariable Integer id) {
        Givers giver = giverService.getGiver(id);
        System.out.println(giver.getAge());
        System.out.println(giver);
        System.out.println("********************+" + giver.getId());
        return giver;
    }

    @PostMapping
    public void addGiver(@RequestBody Givers giver) {
        giverService.addGiver(giver);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteGiver(@PathVariable Integer id) {
        giverService.deleteGiver(id);
    }

    @PutMapping(path = "/{id}")
    public void updateGiver(@RequestBody Givers giver, @PathVariable Integer id) {
        giver.setId(id);
        giverService.updateGiver(giver);
    }


}
