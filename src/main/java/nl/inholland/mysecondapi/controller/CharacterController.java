package nl.inholland.mysecondapi.controller;

import nl.inholland.mysecondapi.model.Character;
import nl.inholland.mysecondapi.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value = "characters")
public class CharacterController {

    @Autowired
    private CharacterService service;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Character>> getAllCharacters(){
        return ResponseEntity.status(200).body(service.getCharacterList());
    }

}
