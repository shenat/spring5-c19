package com.sat.rest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sat.domain.Ingredient;
import com.sat.domain.Taco;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(path="/design", 
				produces="application/json") //只处理accept是json的请求，多个值隔开
@CrossOrigin(origins="*")//允许那些地址可以跨域请求这个服务，这里是任何地址都可以
@Slf4j
public class TacoRestController {
	
	@GetMapping("/{id}")
	public ResponseEntity<Taco> tacoById(@PathVariable("id") Long id) throws Exception{
		log.info("开始执行方法");
		Taco taco = new Taco();
		List<Ingredient> ingredients = new ArrayList<Ingredient>();
		Ingredient flourTortilla = new Ingredient("FLTO", "Flour Tortilla", Ingredient.Type.WRAP);
        Ingredient cornTortilla = new Ingredient("COTO", "Corn Tortilla", Ingredient.Type.WRAP);
        Ingredient groundBeef = new Ingredient("GRBF", "Ground Beef", Ingredient.Type.PROTEIN);
        ingredients.add(flourTortilla);
        ingredients.add(cornTortilla);
        ingredients.add(groundBeef);
        
		taco.setId(1l);
		taco.setCreatedAt(new Date());
		taco.setName("test");
		taco.setIngredients(ingredients);
		log.info("执行结束");
		return new ResponseEntity<Taco>(taco, HttpStatus.OK);
	}
	
	
	
}
