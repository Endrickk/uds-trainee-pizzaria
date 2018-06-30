package br.com.uds.pizza.trainee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/cardapio")
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;

    @PostMapping
    public ResponseEntity criar(@ResponseBody PizzaDTO pizzaDTO){
        return new ResponseEntity(pizzaService.criar(pizzaDTO)
        .toString(),
                HttpStatus.CREATED);

    }
}
