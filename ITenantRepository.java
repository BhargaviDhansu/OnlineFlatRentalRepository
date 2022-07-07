package com.cg.ofr.repository;

import java.util.List;

import com.cg.ofr.entities.Tenant;
import com.cg.ofr.exception.TenantNotFoundException;


public interface ITenantRepository extends JpaRepository<Tenant,Integer> {

}
