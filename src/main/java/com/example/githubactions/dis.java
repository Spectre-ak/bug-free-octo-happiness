package com.example.githubactions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Arrays;

@RestController
public class dis {
	@GetMapping("/")
	public String va() {
		return "hrllo";
	}
	@GetMapping("/testCookie")
	@CrossOrigin({"http://localhost:3000","http://localhost:44"
		,"https://friendly-doodle.azurewebsites.net"})
	public String setCookie(HttpServletRequest request,HttpServletResponse response) {
		Cookie[] ar = request.getCookies();
		System.out.println("cookie received " + Arrays.toString(ar));
		if (ar != null)
			for (Cookie cookie : ar) {
				System.out.println(cookie.getName());
			}
		
		Cookie jwtTokenCookie = new Cookie("user-id", "c2FtLnNtaXRoQGV4YW1wbGUuY29t");

	      jwtTokenCookie.setMaxAge(1123424);
	      jwtTokenCookie.setSecure(true);
	      jwtTokenCookie.setHttpOnly(true);
	      jwtTokenCookie.setPath("/");
	      jwtTokenCookie.setDomain("friendly-doodle.azurewebsites.net");
	      response.addCookie(jwtTokenCookie);
		return "added";
	}
	
}
