/**
 * 
 */
package de.abujarour.calc;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
/**
 * @author mohammed
 *
 */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import de.abujarour.calc.logic.Calculator;

@RestController
@RequestMapping("calc-api")
public class CalcController {
	
	@GetMapping("/add")
	public ResponseEntity<Double> add(@RequestParam(value = "op1") double op1, @RequestParam(value = "op2") double op2) {
		return ResponseEntity.status(HttpStatus.OK).body(Calculator.add(op1, op2));

	}
	/**
	 * TODO: implement the multiplication service
	 * @param op1
	 * @param op2
	 * @return
	 */
	@GetMapping("/multiply")
	public ResponseEntity<String> multiply(@RequestParam(value = "op1") double op1, @RequestParam(value = "op2") double op2) {
		return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(null);
	}

}
