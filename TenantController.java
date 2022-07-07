package com.cg.ofr.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ofr.entities.Tenant;
import com.cg.ofr.exception.TenantNotFoundException;
import com.cg.ofr.service.ITenantService;
@RestController
public class TenantController {
	
	private ITenantService itenantService;
	@PostMapping("/addTenant")
	public String addTenant(@RequestBody Tenant tenant) {
		return itenantService.addTenant(tenant);
	}
	
	@PutMapping("/updateTenant/{tenant_id}/{Age}")
	public List<Tenant> updateTenant(@PathVariable("tenant_id") int tenant_id,@PathVariable("Age") int Age) {
		return itenantService.updatetenant_id(tenant_id,Age);
	}
	
	@DeleteMapping("/deletetenant/{tenant_id}")
	public List<Tenant>  deletetenant(@PathVariable("tenant_id") int tenant_id) throws TenantNotFoundException {
		return itenantService.deleteTenant(tenant_id);
	}
	
	@GetMapping("/viewTenant/{tenant_id}")
	public Tenant viewTenantById(@PathVariable("tenant_id") int tenant_id) throws TenantNotFoundException {
		return itenantService.viewTenant(tenant_id);
	}
	@GetMapping("/viewAll")
	public List<Tenant> viewAllTenant() {
		return itenantService.viewAllTenant();
	}
	
	@GetMapping("/validate")
	public Tenant valiadteTenantById(@PathVariable("tenant_id") int tenant_Id) {
		return itenantService.validateTenant(tenant_id);
	}

}
