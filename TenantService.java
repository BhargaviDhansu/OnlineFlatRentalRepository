package com.cg.ofr.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ofr.entities.Flat;
import com.cg.ofr.entities.Tenant;
import com.cg.ofr.exception.TenantNotFoundException;
import com.cg.ofr.repository.ITenantRepository;
@Service
public class TenantService  {
	@Autowired
	private ITenantRepository itenantrepository;
	
	public String addTenant(Tenant tenant) {
		itenantrepository.save(tenant);
		return "Added";
	}
	
public List<ITenantRepository> updateage(int tenant_id,int age) {
		if(!itenantrepository.existsById(tenant_id))
			throw new TenantNotFoundException();
		
		}
	Tenant tenant=itenantrepository.findById(tenant_id).get();
	
	tenant.setTenantAge(tenantAge);
	itenantrepository.flush();
	return itenantrepository.findAll();
}

public List<Tenant> deleteTenant(int tenant_id) throws TenantNotFoundException {
		if(!itenantrepository.deleteById(tenant_id);
			throw new TenantNotFoundException();
	    }	
		itenantrepository.deleteById(tenant_id);	
			return itenantrepository.findAll();
}
	
public Tenant viewTenant(int tenant_id) throws TenantNotFoundException{
	    if(!itenantrepository.existsById(tenant_id)) {
	    	
			throw new TenantNotFoundException();
	    }	
			return itenantrepository.findById(tenant_id).get();
	}	

public List<Tenant> viewAllTenant(){
	return itenantrepository.findAll();
}

public List<Tenant> validateTenant(){
	return itenantrepository.findAll();
}	
}
