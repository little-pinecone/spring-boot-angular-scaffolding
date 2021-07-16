package in.keepgrowing.springbootangularscaffolding.presentation.controllers;

import in.keepgrowing.springbootangularscaffolding.presentation.viewmodel.HomePageDto;
import in.keepgrowing.springbootangularscaffolding.shared.presentation.controllers.ApiControllerPaths;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = ApiControllerPaths.API + "/home", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Home page")
public class HomePageController {

    @GetMapping
    @Operation(summary = "Returns unsecured test data from backend")
    public ResponseEntity<HomePageDto> getHomePageData() {
        var body = new HomePageDto("Home page body provided by the backend module");

        return ResponseEntity.ok(body);
    }
}
