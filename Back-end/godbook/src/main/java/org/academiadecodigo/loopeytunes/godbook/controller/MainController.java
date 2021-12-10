package org.academiadecodigo.loopeytunes.godbook.controller;

import org.academiadecodigo.loopeytunes.godbook.persistence.model.Givers;
import org.academiadecodigo.loopeytunes.godbook.service.GiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping
public class MainController {

    private final GiverService giverService;

    @Autowired
    public MainController(GiverService giverService) {
        this.giverService = giverService;
    }

    @GetMapping(path = {"/", ""})
    public String home() {
        return "templates/index.html";
    }

    @GetMapping(path = "/{id}")
    public String getProfile(@PathVariable String id) {
        return "templates/profile/profile.html";
    }

    @GetMapping(path = "/profile.js")
    public String getProfileJs() {

        return "templates/profile/profile.js";
    }

    @GetMapping(path = "/profile.css")
    public String getProfileCss() {

        return "templates/profile/profile.css";
    }

    @GetMapping(path = "/{id}.jpg")
    public String getProfileImg(@PathVariable Integer id) {

      return "photos/" + id + ".jpg";
    }

    @GetMapping(path = "/browse")
    public String browse() {
      return "templates/browse/browse_page.html";
    }

    @GetMapping(path = "/browse.css")
    public String browseJs() {
      return "templates/browse/browse.css";
    }

    @GetMapping(path = "/browse.js")
    public String browseCss() {
      return "templates/browse/browse.js";
    }

    @GetMapping(path = "/update{id}")
    public String update() {
      return "templates/addUpdate/update.html";
    }

    @GetMapping(path = "/update.css")
    public String updateCss() {
      return "templates/addUpdate/update.css";
    }

    @GetMapping(path = "/update.js")
    public String updateJs() {
      return "templates/addUpdate/update.js";
    }
}
