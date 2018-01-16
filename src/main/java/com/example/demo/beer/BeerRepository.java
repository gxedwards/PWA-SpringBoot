package com.example.demo.beer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Expose all CRUD operations as REST Endpoints.
 * 
 * @RepositoryRestResource Creates a HATEOAS service with Spring JPA.
 *                         As you can see here adding this annotation and
 *                         linking it to your Pojo you have a fully functional
 *                         HATEOAS service without having to implement the
 *                         repository method or the REST service methods
 * @author EdwardsG
 *
 */
@RepositoryRestResource
interface BeerRepository extends JpaRepository<Beer, Long> {
}
