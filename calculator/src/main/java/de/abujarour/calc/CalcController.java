/**
 * 
 */
package de.abujarour.calc;

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
	public double add(@RequestParam(value = "op1") double op1, @RequestParam(value = "op2") double op2) {
		return Calculator.add(op1, op2);
	}

}
