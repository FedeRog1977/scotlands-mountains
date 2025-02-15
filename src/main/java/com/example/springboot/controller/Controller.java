package com.example.springboot.controller;

import java.util.Arrays;
import java.util.List;
// import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.springboot.model.Hill;
// import com.example.springboot.repository.HillRepository;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class Controller {

	// private HillRepository hillRepository;

	// public Controller(HillRepository hillRepository) {
	// 	this.hillRepository = hillRepository;
	// }

	// @GetMapping("/munros/all")
	// public ResponseEntity<List<Hill>> getAllMunros() {
	// 	return ResponseEntity.ok(this.hillRepository.findAll());
	// }

	// ---

	// @GetMapping("/munros/all")
	// public List<Hill> getAllMunros() {
	// 	return hillRepository.getAll();
	// }
	
	// @GetMapping("/munros/{id}")
	// public Hill getMunro(@PathVariable("id") String id) {
	// 	return hillRepository.get(id);
	// }

	// @PostMapping("/munros/add")
	// public void addMunro(@RequestBody Hill hill) {
	// 	hillRepository.add(hill);
	// }

	// ---
		
	@GetMapping("/munros/all")
	public List<Hill> getAllMunros() {
		return Arrays.asList(
			new Hill(
				"Ben Cruachan",
				"56.4267",
				"-5.1319",
				"NN069304",
				"3694",
				"2884",
				"12.43",
				"Triangulation Station TP1263 [Pillar (Round (Destroyed))] at NN 06965 30471"
			),
			new Hill(
				"Stob Daimh",
				"56.4312",
				"-5.0913",
				"NN094308",
				"3274",
				"436",
				"0.71",
				"Cairn"
			)
		);
	}

}