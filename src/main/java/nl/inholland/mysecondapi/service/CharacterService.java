package nl.inholland.mysecondapi.service;

import nl.inholland.mysecondapi.model.Character;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CharacterService {

    private List<Character> characterList;

    public CharacterService(){
        this.characterList = new ArrayList<>(
                List.of(
                        new Character("Luffy", 18, "Gum-gum"),
                        new Character("Zoro", 20, "None"),
                        new Character("Law", 27, "Room")
                )
        );
    }

    public List<Character> getCharacterList() {
        return characterList;
    }

}
