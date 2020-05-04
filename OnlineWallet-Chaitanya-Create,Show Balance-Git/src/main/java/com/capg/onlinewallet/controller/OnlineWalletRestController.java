package com.capg.onlinewallet.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capg.onlinewallet.dao.OnlineWalletNotFoundException;
import com.capg.onlinewallet.entities.OnlineWallet;
import com.capg.onlinewallet.service.IOnlineWalletService;

@RestController
@RequestMapping({ "/onlinewallet" })
@CrossOrigin("http://localhost:4200")
public class OnlineWalletRestController {
	@Autowired
	private IOnlineWalletService service;

	/* the create method will be again going to service layer and dao layer */

	@PostMapping(path = "/create")
	public ResponseEntity<OnlineWallet> CreateOnlineWallet(@Valid @RequestBody OnlineWallet onlinewalletbean)
			throws Exception {
		
		OnlineWallet onlinewallet = service.CreateOnlineWallet(onlinewalletbean);
		if (onlinewallet == null) {
			throw new OnlineWalletNotFoundException("Values should not be null");
		}

		return new ResponseEntity<OnlineWallet>(onlinewallet, new HttpHeaders(), HttpStatus.OK);
	}

	/* the getdetails method is meant to show details of one particular id */

	@GetMapping(path = "/showBalance/{customerId}")
	public ResponseEntity<OnlineWallet> findOnlineWalletById(@PathVariable("customerId") int customerId)
			throws Exception {
		OnlineWallet onlinewallet = service.findOnlineWalletById(customerId);
		if (onlinewallet == null) {
			throw new OnlineWalletNotFoundException("onlinewallet not found for id=" + customerId);
		}
		return new ResponseEntity<OnlineWallet>(onlinewallet, new HttpHeaders(), HttpStatus.OK);

	}

	
}
