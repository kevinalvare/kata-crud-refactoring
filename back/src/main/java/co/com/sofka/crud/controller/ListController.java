package co.com.sofka.crud.controller;

import co.com.sofka.crud.services.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ListController {
    @Autowired

    private ListService serviceList;

}
