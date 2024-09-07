package ie.tcd.scss.namelist;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

@RestController
public class NamelistController {
  private final List<String> namesList = new ArrayList<>();

  @PostMapping("/names")
  public ResponseEntity<Void> addNames(@RequestBody NameDto nameDto) {
    String name = nameDto.getName();
    if (name == null || name.isEmpty()) {
      return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
    }
    if (namesList.contains(name)) {
      return ResponseEntity.ok().build();
    } else {
      namesList.add(name);
      return ResponseEntity.status(HttpStatus.CREATED).build();
    }
  }

  @GetMapping("/reset")
  public ResponseEntity<Void> resetNamesList() {
    namesList.clear(); 
    return ResponseEntity.status(HttpStatus.OK).build(); 
  }

  @GetMapping("/names")
  public ResponseEntity<String> getNamesList() {
    if (namesList.isEmpty()) {
      return ResponseEntity.ok("(List of names is empty)");
    } else {
      List<String> sortedNames = namesList.stream().sorted().collect(Collectors.toList());
      String names = String.join(", ", sortedNames);
      return ResponseEntity.ok(names);
    }
  }
}
