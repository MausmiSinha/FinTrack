package com.fintrack.FinTrack.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.fintrack.FinTrack.entity.Budget_alloc;

@RestController
public interface Budget_allocController {
	
	// Returns all Budget Allocated of a particular user with uid
	ResponseEntity<List<Budget_alloc>> getAllBudgetsByUid(String uid);
	
	// Returns all Budget Allocated of a particular user with uid and year
	ResponseEntity<List<Budget_alloc>> getAllBudgetByUidYear(String uid, int year);
	
	// Returns all Budget Allocated of a particular user with uid and year and month
	ResponseEntity<List<Budget_alloc>> getAllBudgetByUidYearMonth(String uid, int year, String month);
}
