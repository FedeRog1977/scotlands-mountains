package com.springboot.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.model.Hill;

@RestController
public class Controller {

	@GetMapping("/munros/all")
	public List<Hill> getAllMunros() {
		return Arrays.asList(
			new Hill(
				"RANDOM",
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
				"RANDOM",
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