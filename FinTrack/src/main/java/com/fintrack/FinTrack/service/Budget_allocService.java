package com.fintrack.FinTrack.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fintrack.FinTrack.entity.Budget_alloc;

@Service
public interface Budget_allocService {

	//Find budget allocated by uid
	List<Budget_alloc> findBudgetByUid(String uid);
	
	//Find budget allocated by uid and year
	List<Budget_alloc> findBudgetByUidYear(String uid, int year);
	
	//Find Budget allocated by uid, year and month
	List<Budget_alloc> findBudgetByUidYearMonth(String uid, int year, String month);
}