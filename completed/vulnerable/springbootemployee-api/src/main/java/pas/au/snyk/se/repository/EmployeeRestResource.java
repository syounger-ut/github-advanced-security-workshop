package pas.au.snyk.se.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pas.au.snyk.se.domain.Employee;

@RepositoryRestResource
public interface EmployeeRestResource extends PagingAndSortingRepository <Employee, Long> {
}
