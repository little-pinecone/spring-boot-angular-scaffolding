package in.keepgrowing.springbootangularscaffolding.home.presentation.viewmodel;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Schema(name = "Home")
public class HomePageDto {

    private String body;
}
