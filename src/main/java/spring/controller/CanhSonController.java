/**
 * 
 */
package spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lecan
 *
 */
@RestController
public class CanhSonController {

	@RequestMapping({ "/hello" })
	public String firstPage() {
		return "Hello World";
	}

}
