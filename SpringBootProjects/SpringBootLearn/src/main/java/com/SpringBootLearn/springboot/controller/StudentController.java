package com.SpringBootLearn.springboot.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.SpringBootLearn.springboot.model.Course;
import com.SpringBootLearn.springboot.model.Player;
import com.SpringBootLearn.springboot.service.PlayerService;
import com.SpringBootLearn.springboot.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@Autowired
	private PlayerService playerSevice;

	@GetMapping("/students/{studentId}/courses")
	public List<Course> retrieveCoursesForStudent(@PathVariable String studentId) {
		return studentService.retrieveCourses(studentId);
	}

	@PostMapping("/students/{studentId}/courses")
	public ResponseEntity<Void> registerStudentForCourse(
			@PathVariable String studentId, @RequestBody Course newCourse) {

		Course course = studentService.addCourse(studentId, newCourse);

		if (course == null)
			return ResponseEntity.noContent().build();

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path(
				"/{id}").buildAndExpand(course.getId()).toUri();

		return ResponseEntity.created(location).build();
	}

	@GetMapping("/students/{studentId}/courses/{courseId}")
	public Course retrieveDetailsForCourse(@PathVariable String studentId,
			@PathVariable String courseId) {
		return studentService.retrieveCourse(studentId, courseId);
	}
	
	@GetMapping("/students/getPlayerUsingPlayerId/{playerId}")
	public Player getPlayerUsingPlayerId(@PathVariable int playerId) {
		Player player = playerSevice.findUserById(playerId);
		System.out.println("player : "+player);
		return player;
	}
	
	@PostMapping("/students/createPlayer")
	public int createPlayer() {
		playerSevice.create(getPlayer());
		int playerReturnInt = 1;
		System.out.println("playerReturnInt : "+playerReturnInt);
		return playerReturnInt;
	}

	public static Player getPlayer(){
		Player player = new Player(2,2,"Vignesh","Uthay");
		System.out.println("Player Created ...............");
		return player;
	}
	
	@RequestMapping(value = "/players", produces = "application/json",  method = RequestMethod.GET)
	public String getAllEmployeesJSON(Model model)
	{
	    model.addAttribute("players", playerSevice.getPlayersCollection());
	    return playerSevice.getPlayersCollection().toString();
	}
	
}

